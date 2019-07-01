import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Talia talia = new Talia();
        Karta karta1 = talia.dajKarte();



        Scanner odczyt = new Scanner(System.in);
        System.out.println("Witamy! Zacznasz gre w DOBBLE.");
        while (talia.czyKoniec()) {
            String polecenie = odczyt.nextLine();
            System.out.println("-------");
            if (polecenie.equals("start")) {
                talia.potasuj();
                gra(talia, karta1, odczyt);


            }

        }
    }

    public static void gra(Talia talia, Karta karta1, Scanner odczyt) {

        Karta karta2 = talia.dajKarte();
        System.out.println(karta1);
        System.out.println(karta2);
        System.out.println("Podaj wspolny symbol:");
        String symbol = odczyt.nextLine();
        if (karta1.symbols.contains(symbol) && karta2.symbols.contains(symbol)) {
            System.out.println("Brawo, udalo sie!");
            gra(talia, karta1, odczyt);
            karta1 = karta2;


        }
    }
}
