public class Zarzadca {
    private Budowniczy1 budowniczy1;
    private Budowniczy2 budowniczy2;

    public void setBudowniczy(Budowniczy1 budowniczyNormalny) {
        this.budowniczy1 = budowniczyNormalny;
    }

    public void setBudowniczy(Budowniczy2 b2) {
        this.budowniczy2 = b2;
    }


    public Produkt_osoba tworzOsobe() {
        Produkt_osoba osoba;
        budowniczy1.utworzOsobe()
                .tworzImie("Adrian")
                .tworzNazwisko("Kasprzyk")
                .tworzPESEL(960704023)
                .czyPlaciVAT(false)
                .zwrocNowaOsobe();
        return budowniczy1.osoba;


    }

    public Produkt_osoba tworzOsobe2() {
        Produkt_osoba osoba2;
        budowniczy2.utworzOsobe2()
                .tworzImie("Marzena")
                .tworzNazwisko("Kasprzyk")
                .tworzPESEL(75100204)
                .zwrocNowaOsobe();
        return budowniczy2.osoba;
    }


}
