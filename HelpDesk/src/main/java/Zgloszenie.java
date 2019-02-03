public class Zgloszenie {
    private final Klient klient;
    private final Kategoria kategoria;

    @Override
    public String toString() {
        return "Zgloszenie{" +
                "klient=" + klient +
                ", kategoria=" + kategoria +
                '}';
    }

    public Zgloszenie(Klient klient, Kategoria kategoria) {
        this.klient = klient;
        this.kategoria = kategoria;
    }
    public Klient getKlient(){
        return klient;
    }
    public Kategoria getKategoria(){
        return kategoria;
    }
}
