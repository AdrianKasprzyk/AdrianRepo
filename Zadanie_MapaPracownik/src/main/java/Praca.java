import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Praca {

    private Map<Stanowisko, List<Zadania>> zadaniaNaStanowisku = new HashMap<>();

    public void dodajZadanieNaStanowisko(Stanowisko stanowisko, Zadania zadanie){
        List<Zadania> listaZadan = new ArrayList<>();
        if(zadaniaNaStanowisku.containsKey(stanowisko)){
            listaZadan = zadaniaNaStanowisku.get(stanowisko);
            listaZadan.add(zadanie);
        } else {
            listaZadan.add(zadanie);
            zadaniaNaStanowisku.put(stanowisko,listaZadan);
        }


    }

    public void usunZadanieZeStanowika(Stanowisko stanowisko, Zadania zadanie){
        if(zadaniaNaStanowisku.containsKey(stanowisko)) {
            zadaniaNaStanowisku.get(stanowisko).remove(zadanie);
        }
    }

    public void wypiszZadaniaNaStanowisku (Stanowisko stanowisko){
        if(zadaniaNaStanowisku.containsKey(stanowisko)){
            List<Zadania> listaZadan =  zadaniaNaStanowisku.get(stanowisko);
            System.out.println("Lista zadań na stanowisku: " + stanowisko + ": ");
            for(Zadania zadanie : listaZadan){
                System.out.println(zadanie);
            }
        }
    }

    public List<Zadania> zwrocListeZadanPracownika (Pracownik pracownik){

        List<Zadania> listaZadan = new ArrayList<>();
        if(zadaniaNaStanowisku.containsKey(pracownik.getStanowisko())){
            listaZadan = zadaniaNaStanowisku.get(pracownik.getStanowisko());
        } else {
            System.out.println("Do takiego stanowiska nie ma przypisanych zadań");

        }
        return listaZadan;
    }



    public static void main(String[] args) {

        Praca praca = new Praca();

        Pracownik pracownik1 = new Pracownik("Jan", "Nowak", Stanowisko.KIEROWCA);
        Pracownik pracownik2 = new Pracownik("Zenon", "Zet", Stanowisko.PRACOWNIK_MAGAZYNU);

        praca.dodajZadanieNaStanowisko(Stanowisko.KOORDYNATOR_PLACÓWKI, Zadania.PRZYJMOWANIE_NOWYCH_PRACOWNIKOW);
        praca.dodajZadanieNaStanowisko(Stanowisko.KOORDYNATOR_PLACÓWKI, Zadania.ROZWIAZYWANIE_KONFILKTOW);
        praca.dodajZadanieNaStanowisko(Stanowisko.KIEROWCA, Zadania.DOSTARCZANIE_PACZEK);
        praca.dodajZadanieNaStanowisko(Stanowisko.KIEROWCA, Zadania.ODBIERANIE_PACZEK);
        praca.dodajZadanieNaStanowisko(Stanowisko.KIEROWCA, Zadania.LADOWANIE_SAMOCHODU);
        // praca.dodajZadanieNaStanowisko(Stanowisko.PRACOWNIK_MAGAZYNU, Zadania.SORTOWANIE_PACZEK);

        praca.usunZadanieZeStanowika(Stanowisko.PRACOWNIK_MAGAZYNU, Zadania.ODBIERANIE_PACZEK);
        System.out.println("I test : "  + praca.zadaniaNaStanowisku);

        praca.wypiszZadaniaNaStanowisku(Stanowisko.KIEROWCA);
        System.out.println(praca.zwrocListeZadanPracownika(pracownik1));
        System.out.println(praca.zwrocListeZadanPracownika(pracownik2));
    }
}
