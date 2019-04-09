public class Dzien {
    String dzien_tygodnia;
    Wydarzenie wydarzenie;
    Urodziny urodziny;

    public Dzien(String dzien_tygodnia, Wydarzenie wydarzenie, Urodziny urodziny) {
        this.dzien_tygodnia = dzien_tygodnia;
        this.wydarzenie = wydarzenie;
        this.urodziny = urodziny;
    }


    public String getDzien_tygodnia() {
        return dzien_tygodnia;
    }

    public void setDzien_tygodnia(String dzien_tygodnia) {
        this.dzien_tygodnia = dzien_tygodnia;
    }

    public Wydarzenie getWydarzenie() {
        return wydarzenie;
    }

    public void setWydarzenie(Wydarzenie wydarzenie) {
        this.wydarzenie = wydarzenie;
    }

    public Urodziny getUrodziny() {
        return urodziny;
    }

    public void setUrodziny(Urodziny urodziny) {
        this.urodziny = urodziny;
    }

    @Override
    public String toString() {
        return
                "Dzis mamy " + dzien_tygodnia  +
                ", zapraszamy na: " + wydarzenie +
                ", urodziny obchodza: =" + urodziny;
    }
}

