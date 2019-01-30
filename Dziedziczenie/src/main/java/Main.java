class Osoba{
    String imie;
    String nazwisko;

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
 class Pracowanik extends Osoba{
    private long ID;
    private String[] uprwawnienia;

     public long getID() {
         return ID;
     }

     public String [] getUprwawnienia() {
         return uprwawnienia;
     }

     public Pracowanik(String imie, String nazwisko, long ID, String [] uprwawnienia) {
         super(imie, nazwisko);
         this.ID = ID;
         this.uprwawnienia = uprwawnienia;
     }


}
class Klient extends Osoba{
    int znizka;

    public String getZnizka() {
        return znizka + "%";
    }

    public Klient(String imie, String nazwisko, int znizka) {
        super(imie, nazwisko);
        this.znizka = znizka;

    }


}
public class Main {
    public static void main(String[] args) {
        Pracowanik p = new Pracowanik("Adrian", "Kasprzyk", 234234, new String[]{"Project menager"});
        Klient k = new Klient("Tomasz", "Mostowiak", 9);

        System.out.println(k.imie + k.znizka);
        System.out.println(p );


    }
}
