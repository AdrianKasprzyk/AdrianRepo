import java.util.Objects;

public class Gosc {
    private String imie;
    private String nazwisko;

    public Gosc(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gosc gosc = (Gosc) o;
        return Objects.equals(imie, gosc.imie) &&
                Objects.equals(nazwisko, gosc.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Gosc{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
