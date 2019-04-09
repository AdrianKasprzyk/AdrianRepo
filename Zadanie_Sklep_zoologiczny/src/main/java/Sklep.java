import SDACollectionsPractise.sklep_zoologiczny.Zwierze;

import java.util.*;

public class Sklep {


    List<SDACollectionsPractise.sklep_zoologiczny.Zwierze> listaZwierzat = new ArrayList<>();
    SortedSet<SDACollectionsPractise.sklep_zoologiczny.Zwierze> setZwierzat = new TreeSet<>(SDACollectionsPractise.sklep_zoologiczny.Zwierze.BY_GATUNEK());

    public void dodajZwierze(SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze){

        listaZwierzat.add(zwierze);
        setZwierzat.addAll(listaZwierzat);

    }
    public void kupionoZwierze(SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze){
        listaZwierzat.remove(zwierze);
        setZwierzat.remove(zwierze);
        System.out.println("Do zaplaty: " + zwierze.getCena());


    }



    public void znajdzZwierzePoGatunku(){
        System.out.println("Prosze podaj nazwe gatunku:");
        Scanner odczytGatunku= new Scanner(System.in);
        String wpisanyGatunek= odczytGatunku.nextLine();
        Iterator<SDACollectionsPractise.sklep_zoologiczny.Zwierze> iterator2= listaZwierzat.iterator();
        while(iterator2.hasNext()){
            SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze= iterator2.next();
            if(wpisanyGatunek.equalsIgnoreCase(zwierze.getGatunek())){
                System.out.println(zwierze);
            }

        }
    }
    public void znajdzZwierzePoRodzaju(){
        System.out.println("Prosze podaj nazwe rodzaju:");
        Scanner odczytRodzaju= new Scanner(System.in);
        String wpisanyRodzaj= odczytRodzaju.nextLine();
        Iterator<SDACollectionsPractise.sklep_zoologiczny.Zwierze> iterator3= listaZwierzat.iterator();
        while(iterator3.hasNext()){
            SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze= iterator3.next();
            if(wpisanyRodzaj.equalsIgnoreCase(zwierze.getRodzaj())){
                System.out.println(zwierze);
            }

        }
    }

    public SDACollectionsPractise.sklep_zoologiczny.Zwierze wypiszZKataloguZwierzatDostepneZwierzetaOproczGatunku()  {


        System.out.println("Wyswietl wszystkie zwierzeta oprocz:");
        Scanner odczyt4 = new Scanner(System.in);
        String odczytGatunku = odczyt4.nextLine();
        for (SDACollectionsPractise.sklep_zoologiczny.Zwierze zwierze : setZwierzat) {
            if (odczytGatunku.equalsIgnoreCase(zwierze.getGatunek())) {
                setZwierzat.remove(zwierze);
                System.out.println(setZwierzat );
                System.out.println(setZwierzat.size() );

            }

        }
        return null;
    }


    public void liczbaZwierzat(){

        System.out.println(listaZwierzat.size());
    }
    public int obliczSumeZamowienia(Zwierze zwierze,Zamowienie zamowienie){
        int sumaZawmienia= (int) (zwierze.getCena()* zamowienie.getIlosc());
        return sumaZawmienia;

    }


}


