

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Komis {

    List<Samochod> listaSamochodow = new ArrayList<Samochod>();

    public List<Samochod> getListaSamochodow() {
        return listaSamochodow;
    }

    public void setListaSamochodow(List<Samochod> listaSamochodow) {
        this.listaSamochodow = listaSamochodow;
    }

    public void dodajSamochodDoListy(Samochod samochod) {
        listaSamochodow.add(samochod);
    }

    public void usunSamochodZListy(Samochod samochod) {
        listaSamochodow.remove(samochod);
    }

    public Samochod znajdzSamochodCena1() {

        System.out.println("Prosze podac minimalna cene: ");

        Scanner odczytCeny1 = new Scanner(System.in);
        double price = odczytCeny1.nextDouble();
        Iterator<Samochod> it1 = listaSamochodow.iterator();
        while (it1.hasNext()) {
            Samochod samochod = it1.next();
            if (price < samochod.getCena()) {
                System.out.println(samochod);
            }
        }

        return null;
    }

    public Samochod znajdzSamochodCena2() {

        System.out.println("Prosze podac maksymalna cene: ");

        Scanner odczytCeny2 = new Scanner(System.in);
        double price2 = odczytCeny2.nextDouble();
        Iterator<Samochod> it2 = listaSamochodow.iterator();
        while (it2.hasNext()) {
            Samochod samochod = it2.next();
            if (price2 > samochod.getCena()) {
                System.out.println(samochod);
            }
        }
        return null;


    }

    public Samochod znajdzPoMarce() {
        System.out.println("Podaj nazwe marki:");
        Scanner odczytMarki = new Scanner(System.in);
        String marka = odczytMarki.nextLine();
        Iterator<Samochod> it3 = listaSamochodow.iterator();
        while (it3.hasNext()) {
            Samochod samochod = it3.next();
            if (marka.equalsIgnoreCase(samochod.getMarka())) {
                System.out.println(samochod);
            }


        }
        return null;
    }
    public Samochod znajdzPoModelu() {
        System.out.println("Podaj nazwe modelu:");
        Scanner odczytModelu = new Scanner(System.in);
        String model = odczytModelu.nextLine();
        Iterator<Samochod> it4 = listaSamochodow.iterator();
        while (it4.hasNext()) {
            Samochod samochod = it4.next();
            if (model.equalsIgnoreCase(samochod.getModel())) {
                System.out.println(samochod);
            }


        }
        return null;
    }
}

