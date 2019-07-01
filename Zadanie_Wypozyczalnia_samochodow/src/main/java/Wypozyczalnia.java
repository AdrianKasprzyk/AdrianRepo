import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Wypozyczalnia  {
Map<Samochod, OsobaWypozyczajaca> mapaSamochodow = new HashMap<Samochod, OsobaWypozyczajaca>();
private OsobaWypozyczajaca wolnySamochod= new OsobaWypozyczajaca("wolny", "samochod");

public Wypozyczalnia(){};

    public Wypozyczalnia(Map<Samochod, OsobaWypozyczajaca> mapaSamochodow) {
        this.mapaSamochodow = mapaSamochodow;
    }

    public Wypozyczalnia(OsobaWypozyczajaca wolnySamochod) {
        this.wolnySamochod = wolnySamochod;
    }

    public Map<Samochod, OsobaWypozyczajaca> getMapaSamochodow() {
        return mapaSamochodow;
    }

    public void setMapaSamochodow(Map<Samochod, OsobaWypozyczajaca> mapaSamochodow) {
        this.mapaSamochodow = mapaSamochodow;
    }

    public OsobaWypozyczajaca getWolnySamochod() {
        return wolnySamochod;
    }

    public void setWolnySamochod(OsobaWypozyczajaca wolnySamochod) {
        this.wolnySamochod = wolnySamochod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wypozyczalnia that = (Wypozyczalnia) o;

        return wolnySamochod != null ? wolnySamochod.equals(that.wolnySamochod) : that.wolnySamochod == null;
    }

    @Override
    public int hashCode() {

        return wolnySamochod != null ? wolnySamochod.hashCode() : 0;
    }
    public void uzupelnijMape(Samochod samochod, OsobaWypozyczajaca osobaWypozyczajaca){
        mapaSamochodow.put(samochod, osobaWypozyczajaca);

}
    public List<Samochod> znajdzSamochodPoMarce(String marka) {
        List<Samochod> samochodPoMarce= new ArrayList<Samochod>();

        for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis : mapaSamochodow.entrySet()) {

                if (wpis.getKey().getMarka().equals(marka)) {

                    samochodPoMarce.add(wpis.getKey());



            }
        }
    return samochodPoMarce;

    }
    public List<Samochod> znajdzSamochodPoModelu(String model) {
        List<Samochod> samochodPoModelu= new ArrayList<Samochod>();
        for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis : mapaSamochodow.entrySet()){
            if(wpis.getKey().getModel().equals(model)){
                samochodPoModelu.add(wpis.getKey());

            }
        }
        return samochodPoModelu;

    }
    public List<Samochod> znajdzWolnySamochod(OsobaWypozyczajaca wolnySamochod){
    List<Samochod> wolneSamochody= new ArrayList<Samochod>();
    for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis : mapaSamochodow.entrySet()){
        if( wpis.getValue().equals(wolnySamochod)){
            wolneSamochody.add(wpis.getKey());

        }
    }
    return wolneSamochody;
    }
    public List<Samochod> wypiszZajeteSamochody(){
        List<Samochod> zajeteSamochody= new ArrayList<Samochod>();
        for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis : mapaSamochodow.entrySet()){
            if(!wpis.getValue().equals(wolnySamochod)){
               zajeteSamochody.add(wpis.getKey());

            }
        }
        return zajeteSamochody;
    }
    public int kosztWypozyczenia(OsobaWypozyczajaca osobaWypozyczajaca,  int przebiegPrzyOddaniu){
        int koszt;
        int stawka= 2;
        for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis: mapaSamochodow.entrySet()){
            koszt=(przebiegPrzyOddaniu-wpis.getKey().getPrzebieg())*stawka;
            return koszt;
        }
        return 0;
    }
    public List<Samochod> znajdzPonizejJakiegosPrzebiegu(int przebieg){
        List<Samochod> listaSamochodowPonizejPrzebiegu= new ArrayList<Samochod>();
        for(Map.Entry<Samochod,OsobaWypozyczajaca> wpis: mapaSamochodow.entrySet()){
            if(wpis.getKey().getPrzebieg()<przebieg){
                listaSamochodowPonizejPrzebiegu.add(wpis.getKey());
            }
        }
        return listaSamochodowPonizejPrzebiegu;
    }
    public Queue<Samochod> znajdzSamochodznajwyzszymPrzebiegiem(int przebieg){
        Queue<Samochod> kolejkaSamochodowPowyzejDanegoPrzebiegu= new PriorityQueue<Samochod>(Samochod.WG_PRZEBIEGU);
        for (Map.Entry<Samochod,OsobaWypozyczajaca> wpis: mapaSamochodow.entrySet()){
            if(wpis.getKey().getPrzebieg()>przebieg){
                kolejkaSamochodowPowyzejDanegoPrzebiegu.offer(wpis.getKey());


            }
        }
        return kolejkaSamochodowPowyzejDanegoPrzebiegu;
    }
    public void zapisDoPliku (Map<Samochod, OsobaWypozyczajaca> mapaSamochodow){
        List<Samochod> listaSamochodow= mapaSamochodow.keySet()
                .stream()
                .collect(Collectors.toList());

        try {
            PrintWriter fw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Admin\\Desktop\\ListaSamochodow.txt", true), "UTF-8"), true);
            fw.println("seimandas");
            for(Samochod s : listaSamochodow){
                fw.println(s.toString());
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Wypozyczalnia wypozyczalnia= new Wypozyczalnia();


        Samochod samochod1= new Samochod("Audi", "A3",12000 );
        Samochod samochod2= new Samochod("Audi", "A3",23456 );
        Samochod samochod3= new Samochod("Audi", "A6",234234 );
        Samochod samochod4= new Samochod("Mercedes", "A180", 23452);
        Samochod samochod5= new Samochod("Mercedes", "C63 AMG",62344 );
        Samochod samochod6= new Samochod("Mazda", "323",324234 );
        Samochod samochod7= new Samochod("Audi", "R8",23232 );
        Samochod samochod8= new Samochod("BMW", "E30",233332 );
        Samochod samochod9= new Samochod("BMW", "M3", 23424);
        Samochod samochod10= new Samochod("Audi", "A5",12323 );
        Samochod samochod11= new Samochod("Audi", "A4", 24231);
        Samochod samochod12= new Samochod("Audi", "A7", 4214124);
        Samochod samochod13= new Samochod("Audi", "A3", 24124124);
        Samochod samochod14= new Samochod("Porsche", "911",412423124 );
        Samochod samochod15= new Samochod("Ferrari", "458 Itallia",241241234 );
        Samochod samochod16= new Samochod("Ferrari", "F40",242134124 );
        Samochod samochod17= new Samochod("Audi", "A3",24124124 );

        OsobaWypozyczajaca osobaWypozyczajaca1= new OsobaWypozyczajaca("Adrian", "Kasprzyk");
        OsobaWypozyczajaca osobaWypozyczajaca2= new OsobaWypozyczajaca("Adam", "Kot");
        OsobaWypozyczajaca osobaWypozyczajaca3= new OsobaWypozyczajaca("Tomasz", "Kasprzyk");
        OsobaWypozyczajaca osobaWypozyczajaca4= new OsobaWypozyczajaca("Katarzyna", "Kowalska");
        OsobaWypozyczajaca osobaWypozyczajaca5= new OsobaWypozyczajaca("Sebastian", "Fort");
        OsobaWypozyczajaca osobaWypozyczajaca6= new OsobaWypozyczajaca("Marzena", "Augystynowicz");
        OsobaWypozyczajaca osobaWypozyczajaca7= new OsobaWypozyczajaca("Zbigniew", "Laport");
        OsobaWypozyczajaca osobaWypozyczajaca8= new OsobaWypozyczajaca("Franc", "Schauber");




        wypozyczalnia.mapaSamochodow.put(samochod1,osobaWypozyczajaca1);
        wypozyczalnia.mapaSamochodow.put(samochod2,osobaWypozyczajaca2);
        wypozyczalnia.mapaSamochodow.put(samochod5,osobaWypozyczajaca3);
        wypozyczalnia.mapaSamochodow.put(samochod9,osobaWypozyczajaca4);
        wypozyczalnia.mapaSamochodow.put(samochod15,osobaWypozyczajaca5);
        wypozyczalnia.mapaSamochodow.put(samochod14,osobaWypozyczajaca6);
        wypozyczalnia.mapaSamochodow.put(samochod1,osobaWypozyczajaca7);
        wypozyczalnia.mapaSamochodow.put(samochod11,osobaWypozyczajaca8);
        wypozyczalnia.mapaSamochodow.put(samochod3, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod4, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod6, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod7, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod8, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod10, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod12, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod13, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod16, wypozyczalnia.wolnySamochod);
        wypozyczalnia.mapaSamochodow.put(samochod17, wypozyczalnia.wolnySamochod);

        System.out.println(" I TEST: "+ wypozyczalnia.mapaSamochodow);
        System.out.println("II TEST: "+ wypozyczalnia.znajdzSamochodPoMarce("Audi"));
        System.out.println("III TEST: "+ wypozyczalnia.znajdzSamochodPoModelu("M3"));
        System.out.println("IV TEST: "+ wypozyczalnia.kosztWypozyczenia(osobaWypozyczajaca8, 25345)+ " zł");
        System.out.println("V TEST: "+ wypozyczalnia.wypiszZajeteSamochody());
        System.out.println("VI TEST: "+ wypozyczalnia.znajdzWolnySamochod(wypozyczalnia.wolnySamochod));
        System.out.println("VII TEST: "+ wypozyczalnia.znajdzPonizejJakiegosPrzebiegu(12345));
        System.out.println("VIII TEST: "+ wypozyczalnia.znajdzSamochodznajwyzszymPrzebiegiem(232323));
        wypozyczalnia.zapisDoPliku(wypozyczalnia.mapaSamochodow);










    }
}
