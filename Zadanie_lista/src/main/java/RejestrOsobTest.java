
public class RejestrOsobTest {
    Osoba osoba1 = new Osoba("Adrian", "Kasprzyk", 34);
    Osoba osoba2 = new Osoba("Tomasz", "Piatek", 36);
    Osoba osoba3 = new Osoba("Kamil", "Wolski",55);
    Osoba osoba4 = new Osoba("Adrian", "Nowak",22);
    Osoba osoba5 = new Osoba("Ryszard", "Kasprzyk",47);
    Osoba osoba6 = new Osoba("Marzena", "Kasprzyk",45);
    Osoba osoba7 = new Osoba("Tadeusz", "Kasprzyk",80);

    RejestrOsob rejestrOsobb = new RejestrOsob();
    public void dodajOsobe(){
        rejestrOsobb.dodajOsobe(osoba1);
        rejestrOsobb.dodajOsobe(osoba2);
        rejestrOsobb.dodajOsobe(osoba3);
        rejestrOsobb.dodajOsobe(osoba4);
        rejestrOsobb.dodajOsobe(osoba5);
        rejestrOsobb.dodajOsobe(osoba6);
        rejestrOsobb.dodajOsobe(osoba7);
        System.out.println("I TEST: "+ rejestrOsobb);
    }
    public void usunOsobe(){
        rejestrOsobb.usunOsobe(osoba4);
        rejestrOsobb.usunOsobe(osoba7);
        System.out.println("II TEST"+ rejestrOsobb);
    }
    public void wypisywanie(){
        System.out.println("III TEST:  +");
        rejestrOsobb.wypiszOsoby();
    }
    public void poNazwisku(){
        System.out.println("IV TEST:"+ rejestrOsobb.zwrocOsobePoNazwisku("Wolski"));
        System.out.println("IV TEST:"+ rejestrOsobb.zwrocOsobePoNazwisku("Ptak"));
    }
    public void sredniWiek(){
        System.out.println("V TEST: "+ rejestrOsobb.sredniWiek());
    }
    public void osobaMax(){
        System.out.println("VI TEST : " + rejestrOsobb.maxWiek());
    }public void osobaMin(){
        System.out.println("VII TEST : " + rejestrOsobb.minWiek());
    }


    public static void main(String[] args) {
        RejestrOsobTest rejestrOsobbTest= new RejestrOsobTest();
        rejestrOsobbTest.dodajOsobe();
        rejestrOsobbTest.usunOsobe();
        rejestrOsobbTest.poNazwisku();
        rejestrOsobbTest.sredniWiek();
        rejestrOsobbTest.osobaMax();
        rejestrOsobbTest.osobaMin();
    }
}
