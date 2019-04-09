public class Kabriolet extends Pojazd {

    public Kabriolet(int iloscKol, String kolor) {
        super(iloscKol, kolor);
    }

    @Override
    public String toString() {
        return "Kabriolet: " +
                "ilosc kol = " + iloscKol +
                ", kolor = " + kolor + '\'' +
                ';';
    }
}
