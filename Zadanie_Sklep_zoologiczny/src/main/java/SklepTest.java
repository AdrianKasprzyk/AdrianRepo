import java.util.*;

public class SklepTest {
    List<SDACollectionsPractise.sklep_zoologiczny.Zwierze> listaZwierzat = new ArrayList<>();
    SortedSet<SDACollectionsPractise.sklep_zoologiczny.Zwierze> setZwierzat = new TreeSet<>(SDACollectionsPractise.sklep_zoologiczny.Zwierze.BY_GATUNEK());

    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze1= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "papuga", 450);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze2= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "wrobel", 40);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze3= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "sikorka", 50);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze4= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "jastrzab", 500);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze5= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "pies", 3400 );
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze6= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "kot", 900);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze7= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "kon", 9000);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze8= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "rys", 5000);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze9= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "swinka morska", 300);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze10= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ryba", "szczupak", 50);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze11= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ryba", "pstrag", 55);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze12= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ryba", "ploc", 20);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze13= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ryba", "wegorz", 100);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze14= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "papuga", 450);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze15= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "kanarek", 400);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze16= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "szczygiel", 500);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze17= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("plaz", "zolw", 320);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze18= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("gad", "waz", 500);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze19= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("pajeczaki", "pajak", 150);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze20= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "swinka morska", 300);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze21= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("pajeczaki", "pajak", 150);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze22= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "papuga", 450);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze23= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "papuga", 450);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze24= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ryba", "ploc", 20);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze25= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ssak", "kon", 9000);
    SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze26= new SDACollectionsPractise.sklep_zoologiczny.Zwierze("ptak", "sikorka", 50);


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