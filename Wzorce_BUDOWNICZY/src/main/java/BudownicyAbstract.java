public abstract class BudownicyAbstract {
    protected Produkt_osoba osoba;
    public abstract BudownicyAbstract tworzImie(String imie);

    public abstract BudownicyAbstract tworzNazwisko(String nazwisko);

    public abstract BudownicyAbstract tworzNIP(int n);

    public abstract BudownicyAbstract tworzREGON(int r);

    public abstract BudownicyAbstract tworzPESEL(int i);

    public abstract BudownicyAbstract czyPlaciVAT(boolean b);

    public abstract Produkt_osoba zwrocNowaOsobe();
}
