import javafx.scene.transform.Scale;

import java.util.*;

public class Sklep {
    private final String nazwa = "X-com";
    private String miasto;
    private Map<Kod_produktu,Produkt > mapaProduktow= new HashMap<Kod_produktu, Produkt>();



    public String getNazwa() {
        return nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Map<Kod_produktu, Produkt> getMapaProduktow() {
        return mapaProduktow;
    }

    public void setMapaProduktow(Map<Kod_produktu, Produkt> mapaProduktow) {
        this.mapaProduktow = mapaProduktow;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                ", mapaProduktow=" + mapaProduktow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sklep sklep = (Sklep) o;

        if (nazwa != null ? !nazwa.equals(sklep.nazwa) : sklep.nazwa != null) return false;
        if (miasto != null ? !miasto.equals(sklep.miasto) : sklep.miasto != null) return false;
        return mapaProduktow != null ? mapaProduktow.equals(sklep.mapaProduktow) : sklep.mapaProduktow == null;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (miasto != null ? miasto.hashCode() : 0);
        result = 31 * result + (mapaProduktow != null ? mapaProduktow.hashCode() : 0);
        return result;
    }



    // METODY




    public Map<Kod_produktu, Produkt> dodajDoMapyProdukty (Kod_produktu kod_produktu, Produkt produkt){
        if(mapaProduktow.containsKey(kod_produktu)) {
            System.out.println("Ten produkt juz jest w twoim sklepie!");
        }else {
            mapaProduktow.put(kod_produktu,produkt);


        }
        return mapaProduktow;
    }

    public void kupProdukt(Produkt produkt){

        for(Map.Entry<Kod_produktu, Produkt> wpis : mapaProduktow.entrySet() ){
            if (wpis.getValue().equals(produkt)){
                System.out.println("III TEST:");
                System.out.println("Cena do zaplacenia: "+ wpis.getValue().getCena());
                System.out.println("Zapraszamy ponownie!");
            }
        }

    }
    public List<Produkt> znajdzPoTypie(Typ typ ) {
        List<Produkt> listaProduktowPoDanymTypie= new ArrayList<Produkt>();
        for (Map.Entry<Kod_produktu, Produkt> wpis : mapaProduktow.entrySet()) {
            if (wpis.getValue().getTyp().equals(typ)) {
                listaProduktowPoDanymTypie.add(wpis.getValue());
                System.out.println("II TEST:");
                System.out.println(listaProduktowPoDanymTypie);

            }
        }
        return null;
    }



    public static void main(String[] args) {
        Kod_produktu kod_produktu1 = new Kod_produktu(111);
        Kod_produktu kod_produktu2 = new Kod_produktu(112);
        Kod_produktu kod_produktu3 = new Kod_produktu(113);
        Kod_produktu kod_produktu4 = new Kod_produktu(114);
        Kod_produktu kod_produktu5 = new Kod_produktu(115);
        Kod_produktu kod_produktu6 = new Kod_produktu(116);
        Kod_produktu kod_produktu7 = new Kod_produktu(117);
        Kod_produktu kod_produktu8 = new Kod_produktu(118);
        Kod_produktu kod_produktu9 = new Kod_produktu(119);
        Kod_produktu kod_produktu10 = new Kod_produktu(120);

        Produkt produkt1= new Produkt(Typ.KOMPUTER_STACJONARNY, "HP IronPentium", 3900);
        Produkt produkt2= new Produkt(Typ.MONITOR, "SONY LCDxtech", 550);
        Produkt produkt3= new Produkt(Typ.MONITOR, "LG TDD500", 900);
        Produkt produkt4= new Produkt(Typ.LAPTOP,"Dell", 5000);
        Produkt produkt5= new Produkt(Typ.LAPTOP,"Asus", 2900);
        Produkt produkt6= new Produkt(Typ.LAPTOP,"HP Omen", 9000);
        Produkt produkt7= new Produkt(Typ.TELEFON,"Samsung S9", 3200);
        Produkt produkt8= new Produkt(Typ.TELEFON,"IPhone 6s", 1200);
        Produkt produkt9= new Produkt(Typ.INNE,"HDMI", 90);
        Produkt produkt10= new Produkt(Typ.INNE,"Wzmacniacz sygnalu", 50);

        Sklep sklep= new Sklep();
        sklep.dodajDoMapyProdukty(kod_produktu1,produkt1);
        sklep.dodajDoMapyProdukty(kod_produktu2,produkt2);
        sklep.dodajDoMapyProdukty(kod_produktu3,produkt3);
        sklep.dodajDoMapyProdukty(kod_produktu4,produkt4);
        sklep.dodajDoMapyProdukty(kod_produktu5,produkt5);
        sklep.dodajDoMapyProdukty(kod_produktu6,produkt6);
        sklep.dodajDoMapyProdukty(kod_produktu7,produkt7);
        sklep.dodajDoMapyProdukty(kod_produktu8,produkt8);
        sklep.dodajDoMapyProdukty(kod_produktu9,produkt9);
        sklep.dodajDoMapyProdukty(kod_produktu10,produkt10);
        for(Map.Entry<Kod_produktu, Produkt> wpis : sklep.mapaProduktow.entrySet() ) {
            System.out.println(wpis);
        }
        List<Produkt> listaProduktow= new ArrayList<Produkt>();
        Collections.addAll(listaProduktow,produkt1,produkt2,produkt3,produkt4,produkt5,produkt6,produkt7,produkt8,produkt9,produkt10);
        System.out.println();
        for (Produkt it :listaProduktow){
            System.out.println(it);
        }
        System.out.println();
        listaProduktow.sort(Produkt.WG_CENY());
        for (Produkt it2:listaProduktow) {
            System.out.println(it2);
        }
        sklep.znajdzPoTypie(Typ.LAPTOP);
        sklep.kupProdukt(produkt3);


    }
}
