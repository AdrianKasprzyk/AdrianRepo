import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    double a;
    double b;
    double c;
    double delta;
    double x1;
    double x2;
    char liczbaPierwiastkow;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void pobranieDanych() throws IOException {

        System.out.println("Podaj liczbe a:");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Niedozwolona wartosc!");
            System.exit(1);
        } else {
            System.out.println("Podaj liczbe b:");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj liczbe c:");
            c = Double.parseDouble(br.readLine());
        }
    }

    public void obliczPierwiastki() {
        delta = b * b - 4 * a * c;
        if (delta < 0) liczbaPierwiastkow = 0;
        if (delta == 0) liczbaPierwiastkow = 1;
        if (delta > 0) liczbaPierwiastkow = 2;

        switch (liczbaPierwiastkow) {
            case 1:
                x1 = -b / (-2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }


    }

    public void wyswietlWynik() {
        switch (liczbaPierwiastkow) {
            case 0:
                System.out.println("Brak pierwiastkow!");
                break;

            case 1:
                System.out.println(x1);
            case 2: {
                System.out.println(x1 + " oraz " + x2);
            }
        }
    }
}


