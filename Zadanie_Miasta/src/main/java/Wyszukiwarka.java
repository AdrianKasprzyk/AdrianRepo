// Program ma reagować na 3 komendy:
// list_people -> wylistuje zawartość listy people
// search <what> -> zwróci listę osób której imię bądź nazwisko zawiera wyrażenie what
// sort_people [asc|desc] - jeśli podamy asc lista zostanie posortowana rosnąco po nazwisku,imieniu, jeśli
//                          desc wtedy malejąco po nazwisku,imieniu

// sort_people by firstname [asc|desc]


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Wyszukiwarka {
    public static void main(String[] args) {
        List<Miasto> listaMiast= Arrays
                .asList(new Miasto("Klobuck", "Slaskie"), new Miasto("Czestochowa", "Slaskie"), new Miasto("Opole","Opolskie"),
                        new Miasto("Warszawa", "Mazowieckie"), new Miasto("Krakow", "Malopolskie"), new Miasto("Poznan", "Wielkopolskie"),
                        new Miasto("Gdansk", "Pomorksie"), new Miasto("Wroclaw", "Dolnoslaskie"), new Miasto("Rzeszow", "Podkarpackie"),
                        new Miasto("Katowice", "Slaskie"), new Miasto("Lodz", "Lodzkie"));

        Scanner odczyt= new Scanner(System.in);
        while (true){
            System.out.println(">");
            String komenda= odczyt.nextLine();
            if (komenda.equals("wylistuj miasta")){
                listaMiast.stream()
                        .forEach(System.out::println);
            }else if(komenda.startsWith("szukaj")){
                String tokens[]= komenda.split(" ",12);
                listaMiast.stream()
                        .filter(miasto -> miasto.zawiera(tokens[1]))
                        .forEach(System.out::println);
            }else if(komenda.startsWith("sortuj")){
                listaMiast.stream()
                        .sorted((m1,m2)->(m1.compareAscending(m2)))
                        .forEach(System.out::println);

                }else {
                System.out.println("Nieobslugiwane polecenie!");
            }
            }
        }
    }

