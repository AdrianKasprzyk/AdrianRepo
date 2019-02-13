
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HashSetLearnTest {

    Osoba osoba1 = new Osoba("Jan", "Kowalski", 20);
    Osoba osoba2 = new Osoba("Grażyna", "Kownacka", 55);
    Osoba osoba3 = new Osoba("Konrad", "Walenrod", 43);
    Osoba osoba4 = new Osoba("Krzystof", "Pająk", 15);
    Osoba osoba5 = new Osoba("Patrycja","Kozak", 12);
    Osoba osoba6 = new Osoba("Kamila","Kamilska", 87);
    Osoba osoba7 = new Osoba("Kamila","Kamilska", 42);

    HashSetLearn hashSetLearn = new HashSetLearn();

    List<Osoba> listaOsob = new ArrayList<>();

    public void dodawanieOsoby(){
        hashSetLearn.dodajOsobe(osoba1);
        hashSetLearn.dodajOsobe(osoba2);
        hashSetLearn.dodajOsobe(osoba3);
        hashSetLearn.dodajOsobe(osoba4);
        hashSetLearn.dodajOsobe(osoba5);
        hashSetLearn.dodajOsobe(osoba6);
        hashSetLearn.dodajOsobe(osoba7);
        System.out.println("I test: " + hashSetLearn);
    }

    public void usuwanieOsoby() {
        hashSetLearn.usunOsobe(osoba1);
        System.out.println("II test: " + hashSetLearn);
    }

    public void subSetowanie(){

        hashSetLearn.zwrocSubSeta(osoba2,osoba6);
        System.out.println("III test: " + hashSetLearn.zwrocSubSeta(osoba2,osoba6));
    }

    public void usuwanieKolekcji(){
        Set<Osoba> set = hashSetLearn.zwrocSubSeta(osoba2,osoba6);
        hashSetLearn.usunZSeta(set);
        System.out.println("IV test: " + hashSetLearn);
    }

    public static void main(String[] args) {
        HashSetLearnTest hashSetLearnTest = new HashSetLearnTest();
        hashSetLearnTest.dodawanieOsoby();
        hashSetLearnTest.usuwanieOsoby();
        hashSetLearnTest.subSetowanie();
        hashSetLearnTest.usuwanieKolekcji();
    }
}
