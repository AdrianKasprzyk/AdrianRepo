public class Budowniczy1 extends BudownicyAbstract {

    public Budowniczy1 utworzOsobe(){
        this.osoba= new Produkt_osoba();
        return this;
    }

    public BudownicyAbstract tworzImie(final String imie) {
        this.osoba.setImie(imie);
        return this;
    }

    public BudownicyAbstract tworzNazwisko(final String nazwisko) {
        this.osoba.setNazwisko(nazwisko);
        return this;
    }

    public BudownicyAbstract tworzNIP(int NIP) {
        this.osoba.setNIP(NIP);
        return this;
    }

    public BudownicyAbstract tworzREGON(int REGON) {
        this.osoba.setREGON(REGON);
        return this;
    }

    public BudownicyAbstract tworzPESEL(final int PESEL) {
        this.osoba.setPESEL(PESEL);
        return this;
    }

    public BudownicyAbstract czyPlaciVAT(boolean podatnikVat) {

        this.osoba.setPlatnikVat(podatnikVat);
            return this;
        }

    public Produkt_osoba zwrocNowaOsobe(){

        return this.osoba;
    }

}
