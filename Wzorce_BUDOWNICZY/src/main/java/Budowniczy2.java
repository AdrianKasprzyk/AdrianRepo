public class Budowniczy2 extends BudownicyAbstract {

    public Budowniczy2 utworzOsobe2(){
        this.osoba= new Produkt_osoba();
        return this;
    }

    public BudownicyAbstract tworzImie(final String imie) {
        this.osoba.imie= imie;
        return this;
    }

    public BudownicyAbstract tworzNazwisko(final String nazwisko) {
        this.osoba.nazwisko=nazwisko;
        return this;
    }

    public BudownicyAbstract tworzNIP(int NIP) {
        this.osoba.NIP=NIP;
        return this;
    }

    public BudownicyAbstract tworzREGON(int REGON) {
        this.osoba.REGON=REGON;
        return this;
    }

    public BudownicyAbstract tworzPESEL(final int PESEL) {
        this.osoba.PESEL=PESEL;
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
