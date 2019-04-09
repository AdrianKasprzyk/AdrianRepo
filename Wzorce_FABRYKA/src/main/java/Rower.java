public class Rower extends Pojazd {
    public Rower(int iloscKol, String kolor) {
        super(iloscKol, kolor);
    }

    @Override
    public String toString() {
        return "Rower: " +
                "Ilosc kol = " + iloscKol +
                ", kolor = " + kolor + '\'' +
                ';';
    }
}
