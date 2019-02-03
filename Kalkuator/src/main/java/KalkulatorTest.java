
public class KalkulatorTest {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("I TEST: "+ kalkulator.oblicz("1")+ "powinien byc 1");
        System.out.println("II TEST: "+ kalkulator.oblicz("1 + 2")+ " powinno byc 3");
    }
}
