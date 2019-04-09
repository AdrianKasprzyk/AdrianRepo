import java.util.Comparator;

public class Produkt {
    private Typ typ;
    private  String nazwa;
    private  int cena;

    public Produkt(Typ typ, String nazwa, int cena) {
        this.typ = typ;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;

        if (cena != produkt.cena) return false;
        if (typ != produkt.typ) return false;
        return nazwa != null ? nazwa.equals(produkt.nazwa) : produkt.nazwa == null;
    }

    @Override
    public int hashCode() {
        int result = typ != null ? typ.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + cena;
        return result;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "typ=" + typ +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
    public static final Comparator<Produkt> WG_CENY(){
        return Comparator.comparing(Produkt::getCena);
    }
}
