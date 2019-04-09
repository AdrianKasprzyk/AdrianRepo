import java.util.ArrayList;
import java.util.List;

public class Zamowienie {


    int ilosc;

    List<Zamowienie> listaZamowienie = new ArrayList<>();

    public Zamowienie(int ilosc) {
        this.ilosc = ilosc;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "ilosc=" + ilosc +
                '}';
    }
}

