import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cennik {



        private String nazwaProduktu;
        double cena;


        @Override
        public String toString () {
            return "Cennik{" +
                    "nazwaProduktu='" + nazwaProduktu + '\'' +
                    ", cena=" + cena +
                    '}';
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cennik cennik = (Cennik) o;

            if (Double.compare(cennik.cena, cena) != 0) return false;
            return nazwaProduktu != null ? nazwaProduktu.equals(cennik.nazwaProduktu) : cennik.nazwaProduktu == null;
        }

        @Override
        public int hashCode () {
            int result;
            long temp;
            result = nazwaProduktu != null ? nazwaProduktu.hashCode() : 0;
            temp = Double.doubleToLongBits(cena);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        public String getNazwaProduktu () {
            return nazwaProduktu;
        }

        public void setNazwaProduktu (String nazwaProduktu){
            this.nazwaProduktu = nazwaProduktu;
        }

        public double getCena () {
            return cena;
        }

        public void setCena ( double cena){
            this.cena = cena;
        }

    public Cennik(String nazwaProduktu, double cena){
            this.nazwaProduktu = nazwaProduktu;
            this.cena = cena;
        }


    public static void main(String[] args) {


        Map<String , Double> mapaProduktow = new HashMap<String, Double>();
        Cennik cennik1 = new Cennik("platki", 2.00);
        Cennik cennik2 = new Cennik("chleb", 5.00);
        Cennik cennik3 = new Cennik("woda", 2.50);
        Cennik cennik4 = new Cennik("szynka", 7.00);
        Cennik cennik5 = new Cennik("bulka", 1.00);
        mapaProduktow.put(cennik1.getNazwaProduktu(), cennik1.getCena());
        mapaProduktow.put(cennik2.getNazwaProduktu(), cennik2.getCena());
        mapaProduktow.put(cennik3.getNazwaProduktu(), cennik3.getCena());
        mapaProduktow.put(cennik4.getNazwaProduktu(), cennik4.getCena());
        mapaProduktow.put(cennik5.getNazwaProduktu(), cennik5.getCena());

        System.out.println(mapaProduktow);

        System.out.println("Podaj produkt , ktorego cene chcesz poznac");
        Scanner odczyt= new Scanner(System.in);
        String odczytProduktu = odczyt.nextLine();


            if(mapaProduktow.containsKey(odczytProduktu)){
            System.out.println(mapaProduktow.get(odczytProduktu));
            }else{
            System.out.println("W cenniku nie ma takiego produktu");
        }




    }
}