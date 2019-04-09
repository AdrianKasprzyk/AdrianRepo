import SDACollectionsPractise.sklep_zoologiczny.Zwierze;
import java.util.*;

public class SklepTest {
    List<Zwierze> listaZwierzat = new ArrayList<>();
    SortedSet<Zwierze> setZwierzat = new TreeSet<>(Zwierze.BY_GATUNEK());
    Zwierze zwierze1= new Zwierze("ptak", "papuga", 450);
    Zwierze zwierze2= new Zwierze("ptak", "wrobel", 40);
    Zwierze zwierze3= new Zwierze("ptak", "sikorka", 50);
    Zwierze zwierze4= new Zwierze("ptak", "jastrzab", 500);
    Zwierze zwierze5= new Zwierze("ssak", "pies", 3400 );
    Zwierze zwierze6= new Zwierze("ssak", "kot", 900);
    Zwierze zwierze7= new Zwierze("ssak", "kon", 9000);
    Zwierze zwierze8= new Zwierze("ssak", "rys", 5000);
    Zwierze zwierze9= new Zwierze("ssak", "swinka morska", 300);
    Zwierze zwierze10= new Zwierze("ryba", "szczupak", 50);
    Zwierze zwierze11= new Zwierze("ryba", "pstrag", 55);
    Zwierze zwierze12= new Zwierze("ryba", "ploc", 20);
    Zwierze zwierze13= new Zwierze("ryba", "wegorz", 100);
    Zwierze zwierze14= new Zwierze("ptak", "papuga", 450);
    Zwierze zwierze15= new Zwierze("ptak", "kanarek", 400);
    Zwierze zwierze16= new Zwierze("ptak", "szczygiel", 500);
    Zwierze zwierze17= new Zwierze("plaz", "zolw", 320);
    Zwierze zwierze18= new Zwierze("gad", "waz", 500);
    Zwierze zwierze19= new Zwierze("pajeczaki", "pajak", 150);
    Zwierze zwierze20= new Zwierze("ssak", "swinka morska", 300);
    Zwierze zwierze21= new Zwierze("pajeczaki", "pajak", 150);
    Zwierze zwierze22= new Zwierze("ptak", "papuga", 450);
    Zwierze zwierze23= new Zwierze("ptak", "papuga", 450);
    Zwierze zwierze24= new Zwierze("ryba", "ploc", 20);
    Zwierze zwierze25= new Zwierze("ssak", "kon", 9000);
    Zwierze zwierze26= new Zwierze("ptak", "sikorka", 50);


    Sklep sklep= new Sklep();

    public void dodajZwierzeta(){
        sklep.dodajZwierze(zwierze1);
        sklep.dodajZwierze(zwierze2);
        sklep.dodajZwierze(zwierze3);
        sklep.dodajZwierze(zwierze4);
        sklep.dodajZwierze(zwierze5);
        sklep.dodajZwierze(zwierze6);
        sklep.dodajZwierze(zwierze7);
        sklep.dodajZwierze(zwierze8);
        sklep.dodajZwierze(zwierze9);
        sklep.dodajZwierze(zwierze10);
        sklep.dodajZwierze(zwierze11);
        sklep.dodajZwierze(zwierze12);
        sklep.dodajZwierze(zwierze13);
        sklep.dodajZwierze(zwierze14);
        sklep.dodajZwierze(zwierze15);
        sklep.dodajZwierze(zwierze16);
        sklep.dodajZwierze(zwierze17);
        sklep.dodajZwierze(zwierze18);
        sklep.dodajZwierze(zwierze19);
        sklep.dodajZwierze(zwierze20);
        sklep.dodajZwierze(zwierze21);
        sklep.dodajZwierze(zwierze22);
        sklep.dodajZwierze(zwierze23);
        sklep.dodajZwierze(zwierze24);
        sklep.dodajZwierze(zwierze25);
        sklep.dodajZwierze(zwierze26);
        System.out.println("I TEST : "+ sklep.listaZwierzat) ;
        System.out.println(sklep.setZwierzat);
    }
    public void wyszukiwarkaZwierzat1(){
        sklep.znajdzZwierzePoRodzaju();
    }
    public void wyszukiwarkaZwierzat2(){
        sklep.znajdzZwierzePoGatunku();
    }


    public void liczbaDostepnychZwierzat(){
        sklep.liczbaZwierzat();
    }
    public void pokazSetaOproczGatunku(){
        sklep.wypiszZKataloguZwierzatDostepneZwierzetaOproczGatunku();


    }
    public void zakupZwierzecia(){
        sklep.kupionoZwierze(zwierze7);
        System.out.println("Aktualny stan zwierzat na sprzedaz to : "+ sklep.listaZwierzat);
        System.out.println(sklep.listaZwierzat.size());
    }
    public void podsumowanieZakupow(){
        //sklep.obliczSumeZamowienia(zwierze7,2);
    }


    public static void main(String[] args)throws ConcurrentModificationException {
        SklepTest sklepTest= new SklepTest();
        sklepTest.dodajZwierzeta();
        sklepTest.wyszukiwarkaZwierzat1();
        sklepTest.wyszukiwarkaZwierzat2();
        sklepTest.liczbaDostepnychZwierzat();
        sklepTest.zakupZwierzecia();
        sklepTest.pokazSetaOproczGatunku();




    }

}