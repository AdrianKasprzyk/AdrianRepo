import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Operacje {

    final double STOPA_OPROCENTOWANIA= 0.075;

    Main_bank main_bank= new Main_bank();
    Klient k= new Klient();


public void dodajKlienta(Klient klient){

    main_bank.listaKlientow.add(klient);
}


public List<Klient> klienciDebet(int granica){
    List<Klient> klientsWithD= new ArrayList<>();
    klientsWithD=main_bank.listaKlientow.stream()
            .filter(k-> k.getStanKonta()< granica)
            .collect(Collectors.toList());

    return klientsWithD;

}
public String przelewPrzychodzacy (Klient klient , int wysokosciPrzelewu){
    for(Klient k: main_bank.listaKlientow ){
        if (k.equals(klient)){
            klient.setStanKonta(klient.getStanKonta()+wysokosciPrzelewu);
        }
    }
    return "Otrzymano przelew. Aktualny stan konta " + klient.getImie()+" "+ klient.getNazwisko()+ " to "+ klient.getStanKonta();
}


}
