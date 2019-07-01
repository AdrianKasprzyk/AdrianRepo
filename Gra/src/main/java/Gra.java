import java.util.*;

public class Gra {
     List<Integer> listaLiczb= new ArrayList<Integer>();


    public void wypelnienieTablicy() {
        Random random= new Random();
        Gra gra= new Gra();

        for (int i=0; i<10; i++){
            listaLiczb.add( random.nextInt(100));
        }
        System.out.println(listaLiczb);
        System.out.println();
        System.out.println();
        System.out.println();

    }
    public void sortujTablice(){
        Collections.sort(listaLiczb);

    }
    public void trafLiczbe(){
        Scanner odczytLiczby= new Scanner(System.in);
        int podanaLiczba= odczytLiczby.nextInt();


            if (listaLiczb.contains(podanaLiczba)){
                System.out.println("Brawo, trafiles!");

            }else{

                System.out.println("Sprobuj jeszcze raz!");
                trafLiczbe();
                return;

            }
        }


    public static void main(String[] args) {
        Gra gra= new Gra();
       // long czasStartu= System.currentTimeMillis();
        //gra.wypelnienieTablicy();
       // gra.sortujTablice();
        //gra.trafLiczbe();



        Scanner scanner= new Scanner(System.in);
        while (true) {
            long czasStartu= System.currentTimeMillis();
            String polecenie= scanner.nextLine();
            System.out.println("-----------");
            if (polecenie.equals("start")){
                gra.wypelnienieTablicy();
                gra.sortujTablice();
                gra.trafLiczbe();
                System.out.println((System.currentTimeMillis()-czasStartu)/1000 + "s");
            }else{
                System.out.println("Niepoprawna komenda!");
            }

        }
    }
}
