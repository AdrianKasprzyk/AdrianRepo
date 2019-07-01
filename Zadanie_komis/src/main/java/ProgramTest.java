import java.util.Scanner;

public class ProgramTest {
    Samochod samochod1= new Samochod("Audi", "A3", 2003, 25500);
    Samochod samochod2= new Samochod("Audi", "A3", 2009, 45500);
    Samochod samochod3= new Samochod("Audi", "A6", 2005, 25500);
    Samochod samochod4= new Samochod("Mercedes", "A180", 2015, 65500);
    Samochod samochod5= new Samochod("Mercedes", "C63 AMG", 2007, 95500);
    Samochod samochod6= new Samochod("Mazda", "323", 2003, 25500);
    Samochod samochod7= new Samochod("Audi", "R8", 2013, 245500);
    Samochod samochod8= new Samochod("BMW", "E30", 1986, 55500);
    Samochod samochod9= new Samochod("BMW", "M3", 2003, 45500);
    Samochod samochod10= new Samochod("Audi", "A5", 2008, 35500);
    Samochod samochod11= new Samochod("Audi", "A4", 2013, 65500);
    Samochod samochod12= new Samochod("Audi", "A7", 2011, 85900);
    Samochod samochod13= new Samochod("Audi", "A3", 2003, 26500);
    Samochod samochod14= new Samochod("Porsche", "911", 1986, 225500);
    Samochod samochod15= new Samochod("Ferrari", "458 Itallia", 2003, 525500);
    Samochod samochod16= new Samochod("Ferrari", "F40", 1987, 4250500);
    Samochod samochod17= new Samochod("Audi", "A3", 2001, 1500);

    Komis komis= new Komis();



    public void dodanieDoListy(){

        komis.dodajSamochodDoListy(samochod1);
        komis.dodajSamochodDoListy(samochod2);
        komis.dodajSamochodDoListy(samochod3);
        komis.dodajSamochodDoListy(samochod4);
        komis.dodajSamochodDoListy(samochod5);
        komis.dodajSamochodDoListy(samochod6);
        komis.dodajSamochodDoListy(samochod7);
        komis.dodajSamochodDoListy(samochod8);
        komis.dodajSamochodDoListy(samochod9);
        komis.dodajSamochodDoListy(samochod10);
        komis.dodajSamochodDoListy(samochod11);
        komis.dodajSamochodDoListy(samochod12);
        komis.dodajSamochodDoListy(samochod13);
        komis.dodajSamochodDoListy(samochod14);
        komis.dodajSamochodDoListy(samochod15);
        komis.dodajSamochodDoListy(samochod16);
        komis.dodajSamochodDoListy(samochod17);

        System.out.println("Samochody w sprzedazy: " + komis.listaSamochodow );
    }
    public void wyszukiwarkaCenowa1(){
        komis.znajdzSamochodCena1();
    }
    public void wyszukiwarkaCenowa2(){
        komis.znajdzSamochodCena2();
    }
    public void wyszukiwarkaMarki(){
        komis.znajdzPoMarce();
    }
    public void wyszukiwarkaModelu(){
        komis.znajdzPoModelu();
    }

    public static void main(String[] args) {
        ProgramTest programTest = new ProgramTest();
        programTest.dodanieDoListy();
       //programTest.wyszukiwarkaCenowa1();
        //programTest.wyszukiwarkaCenowa2();
        //programTest.wyszukiwarkaMarki();
        //programTest.wyszukiwarkaModelu();
        Scanner scanner= new Scanner(System.in);

        while(true){
            String polecenie= scanner.nextLine();
            System.out.println("----------");
            if(polecenie.equals("znajdzie po cenie od")){
                programTest.wyszukiwarkaCenowa1();
            }else if(polecenie.startsWith("znajdz po cenie do")){
                programTest.wyszukiwarkaCenowa2();
            }else if(polecenie.startsWith("znajdz po marce")){
                programTest.wyszukiwarkaMarki();
            }else if(polecenie.startsWith("znajdz po modelu")){
                programTest.wyszukiwarkaModelu();
            }else{
                System.out.println("Nieznana komenda!");
            }
        }
    }
}
