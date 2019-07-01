import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_bank {
   public static List<Klient> listaKlientow= new ArrayList<Klient>();

    public static void main(String[] args) {

        Klient k= new Klient();
        Operacje o= new Operacje();


        Klient klient1= new Klient.KlientBuilder()
                .imie("Adrian")
                .nazwisko("Kasprzyk")
                .stanKonta(10000)
                .tworzKlienta();
        Klient klient2= new Klient.KlientBuilder()
                .imie("Frank")
                .nazwisko("Chamberlain")
                .stanKonta(40000)
                .tworzKlienta();
        Klient klient3= new Klient.KlientBuilder()
                .imie("Tim")
                .nazwisko("Wanger")
                .stanKonta(123000)
                .tworzKlienta();
        Klient klient4= new Klient.KlientBuilder()
                .imie("Grzegorz")
                .nazwisko("Mucha")
                .stanKonta(0)
                .tworzKlienta();
        Klient klient5= new Klient.KlientBuilder()
                .imie("Angelika")
                .nazwisko("Kasprzyk")
                .stanKonta(100200)
                .tworzKlienta();
        Klient klient6= new Klient.KlientBuilder()
                .imie("Ryszard")
                .nazwisko("Kasprzyk")
                .stanKonta(54000)
                .tworzKlienta();
        Klient klient7= new Klient.KlientBuilder()
                .imie("Joanna")
                .nazwisko("Kasprzyk")
                .stanKonta(1000)
                .tworzKlienta();
        Klient klient8= new Klient.KlientBuilder()
                .imie("Marzena")
                .nazwisko("Kasprzyk")
                .stanKonta(120000)
                .tworzKlienta();
        Klient klient9= new Klient.KlientBuilder()
                .imie("Edward")
                .nazwisko("Kasprzyk")
                .stanKonta(100500)
                .tworzKlienta();
        Klient klient10= new Klient.KlientBuilder()
                .imie("Szymon")
                .nazwisko("Karwol")
                .stanKonta(230000)
                .tworzKlienta();


o.dodajKlienta(klient1);
o.dodajKlienta(klient2);
o.dodajKlienta(klient3);
o.dodajKlienta(klient4);
o.dodajKlienta(klient5);
o.dodajKlienta(klient6);
o.dodajKlienta(klient7);
o.dodajKlienta(klient8);
o.dodajKlienta(klient8);
o.dodajKlienta(klient10);
        System.out.println(listaKlientow);

        System.out.println(o.klienciDebet(25000));
        System.out.println(o.przelewPrzychodzacy(klient1, 40000));

    }


}
