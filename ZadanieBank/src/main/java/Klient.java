public class Klient {



    private String imie;
    private String nazwisko;
    private int stanKonta;

    public Klient() {}

    @Override
    public String toString() {
        return "{" +
                "'" + imie + '\'' +
                ", '" + nazwisko + '\'' +
                ", stanKonta : " + stanKonta +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klient klient = (Klient) o;

        if (stanKonta != klient.stanKonta) return false;
        if (imie != null ? !imie.equals(klient.imie) : klient.imie != null) return false;
        return nazwisko != null ? nazwisko.equals(klient.nazwisko) : klient.nazwisko == null;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + stanKonta;
        return result;
    }
    public static class KlientBuilder{



         String imie=null;
         String nazwisko=null;
         int stanKonta=0;

         public KlientBuilder imie(String imie){
             this.imie= imie;
             return this;

         }public KlientBuilder nazwisko(String nazwisko){
             this.nazwisko= nazwisko;
             return this;

         }public KlientBuilder stanKonta(int stanKonta){
             this.stanKonta=stanKonta;
             return this;
         }
         public Klient tworzKlienta(){

             return new Klient(this);


         }



    }
    public Klient(KlientBuilder klientBuilder){
        this.imie= klientBuilder.imie;
        this.nazwisko=klientBuilder.nazwisko;
        this.stanKonta=klientBuilder.stanKonta;
    }



}
