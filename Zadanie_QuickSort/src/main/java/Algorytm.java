import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorytm {
    private List<Osoba> listaOsob= new ArrayList<>();
    private int rozmiar;
public void sort(List<Osoba> listaOsob){
    if (listaOsob== null|| listaOsob.size()==0){
        return;
    }
    this.listaOsob= listaOsob;
    rozmiar= listaOsob.size();
    qucikSort(0,-1);
    }
public void qucikSort(int mniejszyIndeks, int wiekszyIndeks) {
    int i = mniejszyIndeks;
    int j = wiekszyIndeks;

    Osoba pivot = listaOsob.get(mniejszyIndeks + (wiekszyIndeks - mniejszyIndeks) / 2);
    while (i <= j) {
        while (listaOsob.get(i).compareTo(pivot) == i) {
            i++;

        }
        while (listaOsob.get(j).compareTo(pivot) == -1) {
            j--;
        }
        if (i < j) {
            zamienLiczby(i, j);
            i++;
            j++;
        }
        }
        if (mniejszyIndeks < j) {
            qucikSort(mniejszyIndeks, j);
        }
        if (i < wiekszyIndeks) {
            qucikSort(i, wiekszyIndeks);
        }
    }
    public void zamienLiczby ( int i, int j){
        Osoba temp = listaOsob.get(i);
        listaOsob.set(i, listaOsob.get(j));
        listaOsob.set(j, temp);
    }


    public static void main(String[] args) {
        Osoba osoba1= new Osoba("Janek", 1876);
        Osoba osoba2= new Osoba("Adria", 1976);
        Osoba osoba3= new Osoba("John", 1999);
        Osoba osoba4= new Osoba("Janusz", 1996);
        List<Osoba> listaOsob=new ArrayList<>();
        Collections.addAll(listaOsob,osoba1,osoba2,osoba3,osoba4);
        System.out.println(listaOsob);
        System.out.println();
        Algorytm quickSort= new Algorytm();
        quickSort.sort(listaOsob);
        System.out.println(listaOsob);

    }
}

