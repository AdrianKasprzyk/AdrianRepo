//Stworz klase HashSetLear pozneij utworz khashset typu osoba , stowrz klase osoba


import java.util.Comparator;
import java.util.Objects;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public static final Comparator<Osoba> BY_WIEK() {
        return Comparator.comparing(Osoba::getWiek);
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
    public int getWiek(){
        return wiek;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                imie.equals(osoba.imie) &&
                nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek);
    }

    @Override
    public String toString() {
        return "\n"+"Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
