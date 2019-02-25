import java.util.*;

public class SiecSklepow {

    private Map<String, Map<GatunekProduktu, List<Produkt>>> mapaSieci = new HashMap<>();

    public void dodajSklepDoSieci(Sklep sklep){
        mapaSieci.put(sklep.getMiasto(), sklep.getMapaSklepu());
    }


    public List<Produkt> znajdzProduktyKonkretnegoGatunkuIProducentaWDanymMiescie(String miasto, GatunekProduktu gatunekProduktu, Producent producent){
        List <Produkt> listaProduktow = new ArrayList<>();
        if(mapaSieci.containsKey(miasto)){
            for (Map.Entry<String,Map<GatunekProduktu,List<Produkt>>> wpisDoSieci : mapaSieci.entrySet()){
                if(miasto.equals(wpisDoSieci.getKey())){
                    for(Map.Entry<GatunekProduktu,List<Produkt>> wpis : wpisDoSieci.getValue().entrySet()){
                        if(wpis.getKey().equals(gatunekProduktu)){
                            for(Produkt produkt : wpis.getValue()){
                                if(produkt.getProducent().equals(producent)){
                                    listaProduktow.add(produkt);
                                }
                            }
                        }
                    }
                }
            }
        } return listaProduktow;
    }

    public Set<Producent> znajdzProducentowWDanymMiescie(String miasto){
        Set<Producent> setProducenow = new HashSet<>();
        if(mapaSieci.containsKey(miasto)){
            for(Map.Entry<String,Map<GatunekProduktu, List<Produkt>>> wpisDoSieci : mapaSieci.entrySet()){
                if(wpisDoSieci.getKey().equals(miasto)){
                    for(Map.Entry<GatunekProduktu,List<Produkt>> wpis : wpisDoSieci.getValue().entrySet()){
                        for(Produkt produkt : wpis.getValue()){
                            setProducenow.add(produkt.getProducent());
                        }
                    }
                }
            }
        }
        return setProducenow;
    }

    public Set<String> znajdzSklepyWKtorychJestDanyProdukt (Produkt produkt) {
        Set<String> setSklepow = new HashSet<>();
        for(Map.Entry<String,Map<GatunekProduktu, List<Produkt>>> wpisWSieci : mapaSieci.entrySet()){
            for(Map.Entry<GatunekProduktu, List<Produkt>> wpis : wpisWSieci.getValue().entrySet()){
                for(Produkt produkt1 : wpis.getValue()){
                    if(produkt1.equals(produkt)){
                        setSklepow.add(wpisWSieci.getKey());
                        break;
                    }
                }
            }
        }
        return setSklepow;
    }

    @Override
    public String toString() {
        return "SiecSklepow{" +
                "mapaSieci=" + mapaSieci +
                '}';
    }

    public static void main(String[] args) {
        Produkt umywalka = new Produkt(GatunekProduktu.CERAMIKA,"umywalka", Producent.MYDŁOIPOWIDŁO, 320.55);
        Produkt zaslony = new Produkt(GatunekProduktu.TESKTYLIA, "zaslony", Producent.MYDŁOIPOWIDŁO, 320.12);
        Produkt gwozdz = new Produkt(GatunekProduktu.METALOWE, "gwozdz", Producent.GWOZDZIARZE, 1.2);
        Produkt zaslony2 = new Produkt(GatunekProduktu.TESKTYLIA,"zaslony", Producent.MYDŁOIPOWIDŁO, 120.99);
        Sklep sklep1 = new Sklep("Kraków", new HashMap<>());
        Sklep sklep2 = new Sklep("Częstochowa", new HashMap<>());
        Sklep sklep3 = new Sklep("Warszawa", new HashMap<>());

        sklep1.dodajDoSklepu(umywalka);
        sklep1.dodajDoSklepu(zaslony);
        sklep1.dodajDoSklepu(gwozdz);

        sklep2.dodajDoSklepu(zaslony2);
        sklep2.dodajDoSklepu(gwozdz);

        sklep3.dodajDoSklepu(umywalka);
        sklep3.dodajDoSklepu(zaslony);
        sklep3.dodajDoSklepu(gwozdz);
        sklep3.dodajDoSklepu(zaslony2);


        System.out.println(sklep1);
        System.out.println();
        System.out.println(sklep2);
        System.out.println();
        System.out.println(sklep3);

        SiecSklepow siecSklepow = new SiecSklepow();
        siecSklepow.dodajSklepDoSieci(sklep1);
        siecSklepow.dodajSklepDoSieci(sklep2);
        siecSklepow.dodajSklepDoSieci(sklep3);
        System.out.println();
        System.out.println(siecSklepow);
        System.out.println();
        System.out.println(siecSklepow.znajdzProduktyKonkretnegoGatunkuIProducentaWDanymMiescie("Warszawa",GatunekProduktu.TESKTYLIA,Producent.MYDŁOIPOWIDŁO));
        System.out.println();
        System.out.println(siecSklepow.znajdzProducentowWDanymMiescie("Warszawa"));
        System.out.println();
        System.out.println(siecSklepow.znajdzSklepyWKtorychJestDanyProdukt(umywalka));
    }
}
