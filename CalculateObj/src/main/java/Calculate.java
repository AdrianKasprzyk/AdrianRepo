import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Ints dodawanie= (a,b)->a+b;
        Ints odejmowanie= (a,b)->a-b;
        Ints mnozenie= (a,b)->a*b;
        Ints dzielenie= (a,b)->a/b;
        Strings polacz= (a,b)->a+b;
        Strings dlugosc=(a,b)-> String.valueOf((int)((a+b).length()));
        Chars chary =(a,b)-> a==b;




        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.println("---------------");
            String polecenie= scanner.nextLine();
            if(polecenie.equals("dodaj")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                int a= odczytb.nextInt();
                int b= odczyta.nextInt();
                System.out.println(dodawanie.oblicz(a,b));

            }else if(polecenie.startsWith("odejmij")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                int a= odczytb.nextInt();
                int b= odczyta.nextInt();
                System.out.println(odejmowanie.oblicz(a,b));

            }else if(polecenie.startsWith("pomnoz")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                int a= odczytb.nextInt();
                int b= odczyta.nextInt();
                System.out.println(mnozenie.oblicz(a,b));

            }else if(polecenie.startsWith("podziel")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                int a= odczytb.nextInt();
                int b= odczyta.nextInt();
                System.out.println(dzielenie.oblicz(a,b));

            }else if(polecenie.startsWith("polacz stringi")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                String a= odczytb.nextLine();
                String b= odczyta.next();
                System.out.println(polacz.laczenie(a,b));

            }else if(polecenie.startsWith("dlugos wyrazu")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                String a= odczytb.nextLine();
                String b= odczyta.next();
                System.out.println(dlugosc.laczenie(a,b));

            }else if(polecenie.startsWith("char")){
                Scanner odczyta= new Scanner(System.in);
                Scanner odczytb= new Scanner(System.in);
                String a= odczytb.next();
                String b= odczyta.next();
                System.out.println(chary.polacz(a,b));
            }else if (polecenie.equals("koniec")){
                break;
            }
        }
    }
}
