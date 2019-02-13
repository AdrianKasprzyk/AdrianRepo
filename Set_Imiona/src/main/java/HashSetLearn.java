
import java.util.*;

public class HashSetLearn {


    SortedSet<Osoba> osobaSet = new TreeSet<>(Osoba.BY_WIEK());

    public void dodajOsobe(Osoba osoba) {

        osobaSet.add(osoba);
    }

    public void usunOsobe(Osoba osoba){
        osobaSet.remove(osoba);
    }

    public Set<Osoba> zwrocSubSeta(Osoba osobaOd, Osoba osobaDo)
    {
        Set<Osoba> nowySet = osobaSet.subSet(osobaOd,osobaDo);
        return nowySet;
    }

    public void usunZSeta(Set<Osoba> set){
        osobaSet.removeAll(set);

    }

    public void usunZSetaListe(List<Osoba> lista){
        osobaSet.removeAll(lista);
    }


    public String toString() {
        return osobaSet.toString();
    }
}
