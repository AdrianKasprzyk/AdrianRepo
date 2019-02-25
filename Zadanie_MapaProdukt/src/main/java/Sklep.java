import java.util.*;

public class Sklep {


    public Sklep(String miasto, Map<GatunekProduktu, List<Produkt>> mapaSklepu) {
        this.miasto = miasto;
        this.mapaSklepu = mapaSklepu;
    }

    public Sklep (){}

    private String miasto;
    private Queue<Produkt> kolejkaProduktow = new PriorityQueue<Produkt>(Produkt.WG_CENY);
    private Map<GatunekProduktu, List<Produkt>> mapaSklepu = new HashMap<>();



    public void dodajDoSklepu(Produkt produkt){
        kolejkaProduktow.offer(produkt);
        if(!mapaSklepu.containsKey(produkt.getGatunekProduktu())){
            List<Produkt> listaProduktow = new ArrayList<>();
            listaProduktow.add(produkt);
            mapaSklepu.put(produkt.getGatunekProduktu(),listaProduktow);
        } else{
            mapaSklepu.get(produkt.getGatunekProduktu()).add(produkt);
        }
    }

    public void usunZeSklepu(Produkt produkt){
        kolejkaProduktow.remove(produkt);
        if(mapaSklepu.containsKey(produkt.getGatunekProduktu())) {
            mapaSklepu.get(produkt.getGatunekProduktu()).remove(produkt);
        }
    }

    public List<Produkt> zwrocProduktyDanegoProducenta(Producent producent){
        List<Produkt> listaProducenta = new ArrayList<>();
        for(Map.Entry<GatunekProduktu,List<Produkt>> wpis : mapaSklepu.entrySet()){
            for(Produkt produkt: wpis.getValue()){
                if(produkt.getProducent().equals(producent)){
                    listaProducenta.add(produkt);
                }
            }
        } return listaProducenta;
    }

    public List<Produkt> zwrocProduktyDanegoGatunku(GatunekProduktu gatunekProduktu){
        List<Produkt> listaGatunku = new ArrayList<>();
        if(mapaSklepu.containsKey(gatunekProduktu)){
            return mapaSklepu.get(gatunekProduktu);
        }
        return listaGatunku;
    }

    public List<Produkt> zwrocDostepneProduktyDanegoGatunkuDoPodanejCeny(GatunekProduktu gatunekProduktu, double cena){
        List<Produkt> listaGatunku = new ArrayList<>();
        if(mapaSklepu.containsKey(gatunekProduktu)){

            for(Produkt produkt: mapaSklepu.get(gatunekProduktu)){
                if(produkt.getCena()<= cena){
                    listaGatunku.add(produkt);
                }
            }
        }return  listaGatunku;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "miasto='" + miasto + '\'' +
                ", mapaSklepu=" + mapaSklepu +
                '}';
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Map<GatunekProduktu, List<Produkt>> getMapaSklepu() {
        return mapaSklepu;
    }

    public void setMapaSklepu(Map<GatunekProduktu, List<Produkt>> mapaSklepu) {
        this.mapaSklepu = mapaSklepu;
    }

    public static void main(String[] args) {

        Produkt umywalka = new Produkt(GatunekProduktu.CERAMIKA,"umywalka", Producent.MYDŁOIPOWIDŁO, 320.55);
        Produkt zaslony = new Produkt(GatunekProduktu.TESKTYLIA, "zaslony", Producent.MYDŁOIPOWIDŁO, 320.12);
        Produkt gwozdz = new Produkt(GatunekProduktu.METALOWE, "gwozdz", Producent.GWOZDZIARZE, 1.2);
        Produkt mlotek = new Produkt(GatunekProduktu.METALOWE, "mlotek", Producent.GWOZDZIARZE, 21.2);
        Produkt zaslony2 = new Produkt(GatunekProduktu.TESKTYLIA,"zaslony", Producent.MYDŁOIPOWIDŁO, 210.20);
        Sklep sklep = new Sklep();
        sklep.dodajDoSklepu(umywalka);
        sklep.dodajDoSklepu(zaslony);
        sklep.dodajDoSklepu(gwozdz);
        sklep.dodajDoSklepu(zaslony2);
        sklep.dodajDoSklepu(mlotek);

        System.out.println(sklep.mapaSklepu);
        System.out.println(sklep.kolejkaProduktow);
        System.out.println();
        sklep.usunZeSklepu(umywalka);
        System.out.println(sklep.mapaSklepu);
        System.out.println(sklep.kolejkaProduktow);
        System.out.println();

        System.out.println(sklep.zwrocProduktyDanegoProducenta(Producent.MYDŁOIPOWIDŁO));


        System.out.println(sklep.zwrocProduktyDanegoGatunku(GatunekProduktu.METALOWE));
        System.out.println(sklep.zwrocDostepneProduktyDanegoGatunkuDoPodanejCeny(GatunekProduktu.TESKTYLIA,250));
    }


}
