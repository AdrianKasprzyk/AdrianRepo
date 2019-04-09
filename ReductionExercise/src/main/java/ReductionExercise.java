import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class Produckt{
    String name;
    double price;

    public Produckt(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
public class ReductionExercise {
    public static void main(String[] args) {
        Stream.of("Ala", "Natalia", "Basia","Wiola")
                .reduce("",(a,e)-> a+" "+e);



        List<Produckt> producktList= Arrays.asList(
                new Produckt("Iphone", 3700),
                new Produckt("Dell", 33700),
                new Produckt("Acer", 700),
                new Produckt("Asus", 300),
                new Produckt("LG", 360),
                new Produckt("Samsung", 1700),
                new Produckt("Xiomi", 4700)
        );
       double productPriceSum= producktList.stream()
                .map(produckt -> produckt.getPrice())
                .reduce(0.0,(acc,e)-> acc+e);


        System.out.println(productPriceSum);
    }
}
