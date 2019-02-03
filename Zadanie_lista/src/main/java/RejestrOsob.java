import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RejestrOsob {
    List<Osoba> rejestrOsob = new ArrayList<Osoba>();


    public List<Osoba> getRejestrOsob() {
        return rejestrOsob;
    }

    public void setRejestrOsob(List<Osoba> rejestrOsob) {
        this.rejestrOsob = rejestrOsob;
    }

    public void dodajOsobe(Osoba osoba) {
        rejestrOsob.add(osoba);
    }

    public void usunOsobe(Osoba osoba) {
        rejestrOsob.remove(osoba);
    }


    public void wypiszOsoby() {
        Iterator<Osoba> iterator = rejestrOsob.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());


        }
    }

    public Osoba zwrocOsobePoNazwisku(String nazwisko) {
        for (Osoba osoba : rejestrOsob) {
            if (osoba.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return osoba;
            }
        }
        System.out.println("Na liscie nie ma osob o takim nazwisku");
        return null;
    }

    public int sredniWiek() {
        int wiekSuma = 0;
        int wiekSredni;
        for (Osoba osoba : rejestrOsob) {
            wiekSuma += osoba.getWiek();
        }
        wiekSredni= wiekSuma/rejestrOsob.size();
        return wiekSredni;

    }
    public Osoba maxWiek(){
        Osoba najstarszaOsoba = rejestrOsob.get(0);
        for(Osoba osoba: rejestrOsob){
            if( osoba.getWiek()> najstarszaOsoba.getWiek()){
                najstarszaOsoba=osoba;
            }

        }
        return najstarszaOsoba;

    }public Osoba minWiek(){
        Osoba najmlodszaOsoba = rejestrOsob.get(0);
        for(Osoba osoba: rejestrOsob){
            if( osoba.getWiek()< najmlodszaOsoba.getWiek()){
                najmlodszaOsoba=osoba;
            }

        }
        return najmlodszaOsoba;

    }

    public String toString(){
        return rejestrOsob.toString();
    }
}