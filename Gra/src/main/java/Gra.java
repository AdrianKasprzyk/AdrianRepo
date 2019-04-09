import java.util.*;

public class Gra {
     int tablicaLiczb[] = new int[10];


    public void wypelnienieTablicy() {
        Random random= new Random();
        Gra gra= new Gra();

        for (int i=0; i<tablicaLiczb.length; i++){
            tablicaLiczb[i]= random.nextInt(100);
            System.out.println(tablicaLiczb[i]);


        }
        System.out.println();
        System.out.println();
        System.out.println();

    }
    public void sortujTablice(){
        Arrays.sort(tablicaLiczb);
        for(int i=0; i<tablicaLiczb.length; i++){
            System.out.println(tablicaLiczb[i]);
        }
    }
    public void trafLiczbe(){
        Scanner odczytLiczby= new Scanner(System.in);
        int podanaLiczba= odczytLiczby.nextInt();
        if(tablicaLiczb.length<1) {
            return;
        }
        for (int i= 0; i<tablicaLiczb.length; i++){
            if (podanaLiczba!= tablicaLiczb[i]){
                System.out.println("Sprobuj jeszcze raz!");
                trafLiczbe();
            }else{

                System.out.println("Brawo, trafiles !!!");
                return;

            }
        }
    }

    public static void main(String[] args) {
        Gra gra= new Gra();
        long czasStartu= System.currentTimeMillis();
        gra.wypelnienieTablicy();
        gra.sortujTablice();
        gra.trafLiczbe();
        System.out.println(System.currentTimeMillis()-czasStartu);
    }
}
