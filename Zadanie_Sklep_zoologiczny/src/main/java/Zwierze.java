
package SDACollectionsPractise.sklep_zoologiczny;
import java.util.Comparator;

public class Zwierze {

    String rodzaj;
    String gatunek;
    double cena;
    public static final Comparator<Zwierze> BY_GATUNEK()
    {
        return Comparator.comparing(Zwierze::getGatunek);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zwierze zwierze = (Zwierze) o;

        if (Double.compare(zwierze.cena, cena) != 0) return false;
        if (rodzaj != null ? !rodzaj.equals(zwierze.rodzaj) : zwierze.rodzaj != null) return false;
        return gatunek != null ? gatunek.equals(zwierze.gatunek) : zwierze.gatunek == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = rodzaj != null ? rodzaj.hashCode() : 0;
        result = 31 * result + (gatunek != null ? gatunek.hashCode() : 0);
        temp = Double.doubleToLongBits(cena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "rodzaj='" + rodzaj + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", cena=" + cena +
                '}';
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Zwierze(String rodzaj, String gatunek, double cena) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.cena = cena;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }




}
