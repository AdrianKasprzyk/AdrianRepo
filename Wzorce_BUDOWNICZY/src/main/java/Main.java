public class Main {
    public static void main(String[] args) {


        Zarzadca z = new Zarzadca();
        Budowniczy1 b= new Budowniczy1();
        z.setBudowniczy(b );

        Zarzadca z2= new Zarzadca();
        Budowniczy2 b2= new Budowniczy2();
        z2.setBudowniczy(b2);

        Produkt_osoba p= z.tworzOsobe();
        System.out.println(p);

        Produkt_osoba l=z2.tworzOsobe2();
        System.out.println(l);

    }
}