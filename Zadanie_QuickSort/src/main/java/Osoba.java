public class Osoba implements Comparable<Osoba>{
    String imie;
    int rokUrodzenia;
    int [] tablica;

    Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (rokUrodzenia != osoba.rokUrodzenia) return false;
        return imie != null ? imie.equals(osoba.imie) : osoba.imie == null;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + rokUrodzenia;
        return result;
    }

    public int compareTo(Osoba o) {
        return Integer.compare(rokUrodzenia,o.rokUrodzenia);

    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
