public class Limuzyna extends Pojazd {
    public Limuzyna(int iloscKol, String kolor) {
        super(iloscKol, kolor);
    }

    @Override
    public String toString() {
        return "Limuzyna: " +
                "ilosc kol = " + iloscKol +
                ", kolor = " + kolor + '\'' +
                ';';
    }
}
