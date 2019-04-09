import java.util.*;

/*Zadanie 1.

1. Stwórz klasę Klient -> pola: imie, nazwisko
2. Stwórz enuma Materiał -> BAWEŁNA, POLIESTER, WEŁNA, JEDWAB, LEN
2. Stwórz klasę Ubranie -> pola: materiał, rodzaj ubrania ,kolor
3. Stwórz klasę Usługa -> pola: klient, ubranie
4. Stwórz klasę Pralnia -> pole lista usług
			-> pole kolejka priorytetowa usług(porównujemy po materiale)

	metoda -> dodajUsługe
	metoda -> wykonanoUsluge
	metoda -> znajdzUslugiDlaKonkretnegoKlienta
	metoda -> znajdz UslugiZKonkretnymMaterialem
	metoda -> wykonajWszystkieUslugi(z kolejka) -> po wykonaniu uslugi wypisz ze ubranie takiego i takiego klienta zostalo wyprane i wywolaj metode
							wykonano usługę żeby ta pozycja nie znajdowała się już na liście
Przetestuj w mainie. Pamietaj ze przy dodawaniu uslugi musi sie ona znaleźć zarówno w liście jak i kolejce!*/
public class Pralnia {
    private Comparator<Usluga> WG_MATERIALU= new Comparator<Usluga>() {
        @Override
        public int compare(Usluga o1, Usluga o2) {
            return o1.getUbranie().getMarerial().compareTo(o2.getUbranie().getMarerial());
        }
    };
     private List<Usluga> lista_Uslug= new ArrayList<Usluga>();
     private Queue<Usluga> kolejka_Uslug= new PriorityQueue<Usluga>(WG_MATERIALU);



    public void dodajUsluge(Usluga usluga){
        lista_Uslug.add(usluga);
        kolejka_Uslug.offer(usluga);
    }
    public void wykonanoUsluge ( Usluga usluga){
        if(lista_Uslug.contains(usluga)&&kolejka_Uslug.contains(usluga)) {
            lista_Uslug.remove(usluga);
            kolejka_Uslug.remove(usluga);
        }
    }
    public List<Usluga> znajdzUslugiDlaKonkretnegoKlienta(String nazwisko){
        List<Usluga> listauslugwgklient= new ArrayList<>();
        for(Usluga u: lista_Uslug){
            if (u.getKlient().getNazwisko().equals(nazwisko)){
                listauslugwgklient.add(u);

            }
        }
        return listauslugwgklient;
    }
    public List<Usluga> znajdzuslugiwgmaterialu(Mareriał marerial){
        List<Usluga> listauslugwgmaterialu= new ArrayList<>();
        for (Usluga u:lista_Uslug){
            if(u.getUbranie().getMarerial().equals(marerial)){
                listauslugwgmaterialu.add(u);
            }
        }
        return listauslugwgmaterialu;
    }
    public void wykonajwszystkieuslugi(){
        while(kolejka_Uslug.peek()!=null){
            wykonanoUsluge(kolejka_Uslug.peek());
            System.out.println("wykonano " + kolejka_Uslug.peek()+ " usluge");
        }
    }

    public static void main(String[] args) {

        Klient janNowak = new Klient("Jan", "Nowak");
        Klient elaJanusz = new Klient("Ela", "Janusz");
        Klient hieronimZet = new Klient("Hieronim", "Zet");
        Klient adelajdaPe = new Klient("Adelajda", "Pe");

        Ubranie spodnieJana = new Ubranie(Mareriał.LEN,"spodnie","biel");
        Ubranie marynarkaJana = new Ubranie(Mareriał.WEŁNA, "marynarka", "czern");
        Ubranie koszulaJana = new Ubranie(Mareriał.BAWEŁNA, "koszula", "zielen");
        Ubranie spodnieEli = new Ubranie(Mareriał.WEŁNA,"spodnie","biel");
        Ubranie marynarkaHieronima = new Ubranie(Mareriał.WEŁNA, "marynarka", "bez");
        Ubranie koszulaAdelajdy = new Ubranie(Mareriał.BAWEŁNA, "koszula", "zielen");

        Usluga usluga1 = new Usluga(janNowak,spodnieJana);
        Usluga usluga2 = new Usluga(janNowak, marynarkaJana);
        Usluga usluga3 = new Usluga(janNowak, koszulaJana);
        Usluga usluga4 = new Usluga(elaJanusz, spodnieEli);
        Usluga usluga5 = new Usluga(hieronimZet, marynarkaHieronima);
        Usluga usluga6 = new Usluga(adelajdaPe, koszulaAdelajdy);

        Pralnia pralnia = new Pralnia();

        pralnia.dodajUsluge(usluga1);
        pralnia.dodajUsluge(usluga2);
        pralnia.dodajUsluge(usluga3);
        pralnia.dodajUsluge(usluga4);
        pralnia.dodajUsluge(usluga5);
        pralnia.dodajUsluge(usluga6);

        System.out.println("I test lista: " + pralnia.lista_Uslug);
        System.out.println("I test kolejka: " + pralnia.kolejka_Uslug);

        System.out.println("II test: " + pralnia.znajdzUslugiDlaKonkretnegoKlienta("nowak"));
        System.out.println("III test: " + pralnia.znajdzuslugiwgmaterialu(Mareriał.WEŁNA));

        pralnia.wykonanoUsluge(usluga1);
        System.out.println("IV test lista: " + pralnia.lista_Uslug);
        System.out.println("IV test kolejka: " + pralnia.kolejka_Uslug);

        System.out.println("V test: ");
        pralnia.wykonajwszystkieuslugi();
    }
}
