public class Algorytm {

    private int [] tablica;
    private int [] tablicaPomocnicza;

    private int rozmiar;

    public void sort(int [] tablica) {
        if(tablica == null || tablica.length ==0){
            return;
        }

        this.tablica = tablica;
        rozmiar = tablica.length;
        this.tablicaPomocnicza = new int [rozmiar];
        mergeSort(0,rozmiar -1);
    }

    public void mergeSort(int minIndeks, int maxIndeks){
        // sprawdzamy czy minIndeks jest mniejszy niz maxIndeks bo jesli nie to tablica
        // jest posortowana
        if(minIndeks < maxIndeks){
            //pobieramy indeks srodkowego elementu
            int srodek = minIndeks + (maxIndeks - minIndeks)/2;
            // sortujemy lewa czesc tablicy
            mergeSort(minIndeks,srodek);
            // sortujemy prawa strone tablice
            mergeSort(srodek+1, maxIndeks);

            merge(minIndeks,srodek,maxIndeks);
        }
    }

    public void merge(int minIndeks, int srodek, int maxIndeks){
        // kopijemy zawartosc do tablicy pomocniczej
        for(int i = minIndeks; i<= maxIndeks; i++){
            tablicaPomocnicza[i] = tablica[i];
        }

        // inicjalizacja indeksow startowych

        int i = minIndeks;
        int j = srodek +1;
        int k = minIndeks;
        // kopiowanie najmniejszej wartosci do oryginalnej tablicy
        while(i<= srodek && j<= maxIndeks){
            if(tablicaPomocnicza[i] <= tablicaPomocnicza[j]){
                tablica[k] = tablicaPomocnicza[i];
                i++;
            }
            else {
                tablica[k] = tablicaPomocnicza[j];
                j++;
            }
            k++;
        }
        // kopiuje pozostale elementy z lewej strony
        while (i<=srodek){
            tablica[k] = tablicaPomocnicza[i];
            k++;
            i++;
        }


    }
    public static void wypiszTablice(int [] tablica){
        int rozmiar = tablica.length;
        for(int i = 0; i<rozmiar;i++){
            System.out.println(tablica[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] tablica = {12,44,2,7,87};
        System.out.println("Tablica wejściowa: ");
        wypiszTablice(tablica);

        Algorytm mergeSort = new Algorytm();
        mergeSort.sort(tablica);
        System.out.println("Posortowana tablica : ");
        wypiszTablice(tablica);
    }
}
