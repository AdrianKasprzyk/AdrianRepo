import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hotel {

    private String nazwa;
    private String miasto;
    private Map<Pokój,Gosc> mapaPokoi = new HashMap<>();

    public Hotel(String nazwa, String miasto, Map<Pokój, Gosc> mapaPokoi) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.mapaPokoi = mapaPokoi;
    }

    public Hotel(){};

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Map<Pokój, Gosc> getMapaPokoi() {
        return mapaPokoi;
    }

    public void setMapaPokoi(Map<Pokój, Gosc> mapaPokoi) {
        this.mapaPokoi = mapaPokoi;
    }

    public static int getNieMaTakiegoPokoju() {
        return NIE_MA_TAKIEGO_POKOJU;
    }

    public Gosc getDefaultGosc() {
        return defaultGosc;
    }

    public void setDefaultGosc(Gosc defaultGosc) {
        this.defaultGosc = defaultGosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(nazwa, hotel.nazwa) &&
                Objects.equals(miasto, hotel.miasto) &&
                Objects.equals(mapaPokoi, hotel.mapaPokoi) &&
                Objects.equals(defaultGosc, hotel.defaultGosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, miasto, mapaPokoi, defaultGosc);
    }

    @Override
    public String toString() {
        return
                "n"+"Hotel{" +
                        "nazwa='" + nazwa + '\'' +
                        ", miasto='" + miasto + '\'' +
                        ", mapaPokoi=" + mapaPokoi +
                        ", defaultGosc=" + defaultGosc +
                        '}';
    }

    private static final int NIE_MA_TAKIEGO_POKOJU = -1;

    private Gosc defaultGosc = new Gosc("nikt", "ważny");

    public void zameldujGoscia(Pokój pokój, Gosc gosc){

        mapaPokoi.put(pokój,gosc);
    }

    public void wymeldujGoscia(Pokój pokój){
        mapaPokoi.put(pokój,defaultGosc);
    }

    public Gosc znajdzGosciaPoNrPokoju (int numerPokoju){

        for(Map.Entry<Pokój,Gosc> wpis : mapaPokoi.entrySet()){
            if(wpis.getKey().getNumerPokoju() == numerPokoju){
                return wpis.getValue();
            }
        }
        return null;
    }

    public int znajdzNumerPokojuPoNazwiskuGoscia (String nazwisko){

        for(Map.Entry<Pokój,Gosc> wpis : mapaPokoi.entrySet()){
            if(wpis.getValue().getNazwisko().equals(nazwisko)){
                return wpis.getKey().getNumerPokoju();
            }
        }
        return NIE_MA_TAKIEGO_POKOJU;
    }

    public List<Pokój> znajdzWolnePokojeWPOdanymStandardzie(Standard standard){
        List<Pokój> listaPokoi = new ArrayList<>();
        for (Map.Entry<Pokój,Gosc> wpis : mapaPokoi.entrySet()){
            if(wpis.getKey().getStandard().equals(standard) && wpis.getValue().equals(defaultGosc)){
                listaPokoi.add(wpis.getKey());
            }
        }
        return listaPokoi;
    }
    public List<Pokój> znajdzWolneWstandradzie( Gosc defaultGosc,Standard standard){
        List<Pokój> zajetePokoje= new ArrayList<>();
        for(Map.Entry<Pokój , Gosc> wpis : mapaPokoi.entrySet()){
            if (wpis.getValue().equals(defaultGosc)){
                zajetePokoje.add(wpis.getKey());
            }
        }
        zajetePokoje= zajetePokoje.stream()
                .filter(p -> p.getStandard().equals(standard))
                .collect(Collectors.toList());
        return zajetePokoje;

    }


    public static void main(String[] args) {

        Pokój pokojPodstawa1 = new Pokój(1,Standard.PODSTAWOWY);
        Pokój pokojPodstawa2 = new Pokój(2, Standard.PODSTAWOWY);
        Pokój pokojPodstawa3 = new Pokój(3, Standard.PODSTAWOWY);
        Pokój pokojPodstawa4 = new Pokój(4, Standard.PODSTAWOWY);
        Pokój pokojPodstawa5 = new Pokój(5, Standard.PODSTAWOWY);
        Pokój pokojPodwyzszony1 = new Pokój(6,Standard.PODWYŻSZONY);
        Pokój pokojPodwyzszony2 = new Pokój(7,Standard.PODWYŻSZONY);
        Pokój pokojPodwyzszony3 = new Pokój(8,Standard.PODWYŻSZONY);
        Pokój pokojApartament1 = new Pokój(9,Standard.APARTAMENT);
        Pokój pokojApartament2 = new Pokój(10,Standard.APARTAMENT);

        Gosc janNowak = new Gosc("Jan", "Nowak");
        Gosc krystynaJanda = new Gosc("Krystyna", "Janda");
        Gosc zenonZet = new Gosc("Zenon","Zet");
        Gosc padTad = new Gosc("Pad","Tad");
        Gosc jackJoe = new Gosc("Jack", "Joe");
        Gosc flipFlap = new Gosc("Flip","Flap");

        Hotel hotel = new Hotel();

        hotel.zameldujGoscia(pokojApartament1,hotel.defaultGosc);
        hotel.zameldujGoscia(pokojApartament2,hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodstawa1, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodstawa2,hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodstawa3, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodstawa4, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodstawa5, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodwyzszony1, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodwyzszony2, hotel.defaultGosc);
        hotel.zameldujGoscia(pokojPodwyzszony3,hotel.defaultGosc);

        System.out.println(hotel.mapaPokoi);

        hotel.zameldujGoscia(pokojApartament1,jackJoe);
        hotel.zameldujGoscia(pokojPodstawa2,janNowak);
        hotel.zameldujGoscia(pokojPodwyzszony3,krystynaJanda);
        hotel.zameldujGoscia(pokojPodstawa5,zenonZet);
        hotel.zameldujGoscia(pokojApartament2,flipFlap);
        hotel.zameldujGoscia(pokojPodstawa3,padTad);

        System.out.println("I test: zameldowanie: " + hotel.mapaPokoi);

        System.out.println("II test: " + hotel.znajdzGosciaPoNrPokoju(9));


        System.out.println("III test: " + hotel.znajdzNumerPokojuPoNazwiskuGoscia("Tad"));

        System.out.println("IV test: " + hotel.znajdzWolnePokojeWPOdanymStandardzie(Standard.PODWYŻSZONY));
        System.out.println("V TEST : " + hotel.znajdzWolneWstandradzie(hotel.defaultGosc, Standard.PODSTAWOWY));
    }
}
