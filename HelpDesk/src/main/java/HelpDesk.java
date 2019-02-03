import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {


    private final Queue<Zgloszenie> zgloszenia = new ArrayDeque<>();

    public void zgloszenie(final Klient klient, final Kategoria kategoria) {
        zgloszenia.offer(new Zgloszenie(klient, kategoria));

    }

    public void procesujWszystkieZgloszenia() {
        Zgloszenie zgloszenie;
        while ((zgloszenie = zgloszenia.poll()) != null) {
            if (zgloszenie.getKlient().getPlec().equals("M")) {
                zgloszenie.getKlient().odpowiedz("Czy probowales wlaczyc i wylaczyc?");
            } else {
                zgloszenie.getKlient().odpowiedz("Czy probowalas wlaczyc i wylaczyc?");
            }
        }

    }
    public void procesujZgloszeniaDrukarek(){
        final Zgloszenie zgloszenie = zgloszenia.peek();
        if(zgloszenie!= null && zgloszenie.getKategoria()== Kategoria.DRUKARKA){
            zgloszenia.remove();
            zgloszenie.getKlient().odpowiedz("Czy nie skonczyl sie papier?");
        }else{
            System.out.println("Nie ma zgloszen");
        }
    }
    public void procesujZgloszeniaGeneralne(){
        final Zgloszenie zgloszenie = zgloszenia.peek();
        if(zgloszenie!= null && zgloszenie.getKategoria()!= Kategoria.DRUKARKA){
            zgloszenia.remove();
            zgloszenie.getKlient().odpowiedz("Czy probowales wlaczyc i wylaczyc");
        }else{
            System.out.println("Nie ma zgloszen");
        }
    }

        public static void main (String[]args){
            HelpDesk helpDesk = new HelpDesk();
            helpDesk.zgloszenie(Klient.AGATA, Kategoria.KOMPUTER);
            helpDesk.zgloszenie(Klient.AGNIESZKA, Kategoria.DRUKARKA);
            helpDesk.zgloszenie(Klient.JACEK, Kategoria.TELEFON);
            helpDesk.zgloszenie(Klient.JACEK, Kategoria.DRUKARKA);
            helpDesk.zgloszenie(Klient.AGATA, Kategoria.DRUKARKA);

            helpDesk.procesujZgloszeniaDrukarek();
            helpDesk.procesujZgloszeniaGeneralne();
            helpDesk.procesujZgloszeniaDrukarek();
        }
    }

