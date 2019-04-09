public abstract class Pojazd {
    int iloscKol;
    String kolor;

    public Pojazd(int iloscKol, String kolor) {
        this.iloscKol = iloscKol;
        this.kolor = kolor;

    }

    public int getIloscKol() {
        return iloscKol;
    }

    public String getKolor() {
        return kolor;
    }

}
