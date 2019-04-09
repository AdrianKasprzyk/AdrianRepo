import java.util.ArrayList;
import java.util.List;

public class Facebook implements Facebook_interface {

    List<UzytkownikFacebook> listaUzytkownikow= new ArrayList<UzytkownikFacebook>();


    public void aktualizujDzien(Dzien dzien){
        System.out.println("Facebook mowi Ci ");
        obslugaUzytkownikow(dzien);

    }


    public void zaloguj(UzytkownikFacebook fbu) {
        listaUzytkownikow.add(fbu);

    }

    public void wyloguj(UzytkownikFacebook fbu) {
        listaUzytkownikow.remove(fbu);
    }



    public void obslugaUzytkownikow(Dzien dzien) {

        for(UzytkownikFacebook fbu: listaUzytkownikow){
            fbu.powiadom( dzien);
    }


    }




}
