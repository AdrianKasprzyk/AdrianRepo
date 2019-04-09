public class Produkt_osoba {
    String imie;
    String nazwisko;
    int NIP;
    int REGON;
    int PESEL;
    boolean platnikVat;




    public Produkt_osoba(String imie, String nazwisko, int NIP, int REGON, int PESEL, boolean platnikVat) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.NIP = NIP;
        this.REGON = REGON;
        this.PESEL = PESEL;
        this.platnikVat = platnikVat;
    }





    public Produkt_osoba() {

    }





    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public int getREGON() {
        return REGON;
    }

    public void setREGON(int REGON) {
        this.REGON = REGON;
    }

    public int getPESEL() {
        return PESEL;
    }

    public void setPESEL(int PESEL) {
        this.PESEL = PESEL;
    }

    public boolean isPlatnikVat() {
        return platnikVat;
    }

    public void setPlatnikVat(boolean platnikVat) {
        this.platnikVat = platnikVat;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", NIP=" + NIP +
                ", REGON=" + REGON +
                ", PESEL=" + PESEL +
                ", platnikVat=" + platnikVat +
                '}';
    }
}
