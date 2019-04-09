import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
Fabryka f= new Fabryka();
Pojazd p1= f.utworzPojazd(Litera.L);
Pojazd p2= f.utworzPojazd(Litera.K);
Pojazd p3= f.utworzPojazd(Litera.R);
        List<Pojazd> listaPojazdow= new ArrayList<Pojazd>();
        Collections.addAll(listaPojazdow,p1,p2,p3);
        for (Pojazd pojazd: listaPojazdow){
            System.out.println(pojazd);
        }
    }
}
