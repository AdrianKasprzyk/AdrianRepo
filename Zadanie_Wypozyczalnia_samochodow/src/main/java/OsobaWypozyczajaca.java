public class OsobaWypozyczajaca {
    private String imie;
    private String nazwisko;

    public OsobaWypozyczajaca(String imie, String nazwisko) {
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

        OsobaWypozyczajaca that = (OsobaWypozyczajaca) o;

        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        return nazwisko != null ? nazwisko.equals(that.nazwisko) : that.nazwisko == null;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OsobaWypozyczajaca{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

}
