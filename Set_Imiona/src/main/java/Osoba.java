//Stworz klase HashSetLear pozneij utworz khashset typu osoba , stowrz klase osoba
import java.util.HashSet;
import java.util.Set;

public class Osoba {
    String imie;
    String nazwisko;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (!imie.equals(osoba.imie)) return false;
        return nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + nazwisko.hashCode();
        return result;
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

    private Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

}