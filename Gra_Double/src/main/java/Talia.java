import java.util.Collections;
import java.util.EnumSet;
import java.util.Stack;

public class Talia {
    Stack<Karta> talia= new Stack<>();

    public Talia(Stack <Karta> talia){
        if(talia.size()!=7){
            throw new RuntimeException("Zbyt mala liczba kart");
        }
    }
    public Stack<Karta> potasuj(){
        Collections.shuffle(talia);
        return talia;
    }
    public Karta dajKarte(){
        return talia.pop();

    }
    public boolean czyKoniec(){
        return !talia.isEmpty();
    }
    public Talia(){
        talia.push(new Karta(EnumSet.of(Symbol.ZEBRA, Symbol.KOSTKA,
                Symbol.PIES, Symbol.SERCE, Symbol.KSIEZYC, Symbol.KOTWICA,
                Symbol.BOMBA, Symbol.BUTLA)));

        talia.push(new Karta(EnumSet.of(Symbol.DELFIN, Symbol.PAJAK,
                Symbol.BOMBA, Symbol.KLUCZ, Symbol.MLOT, Symbol.SLONCE,
                Symbol.OLOWEK, Symbol.LUDZIK)));

        talia.push(new Karta(EnumSet.of(Symbol.DELFIN, Symbol.MARCHEW,
                Symbol.SNIEZKA, Symbol.DRZEWO, Symbol.KROPLA, Symbol.PIES,
                Symbol.OKULARY, Symbol.STOKROTKA)));

        talia.push(new Karta(EnumSet.of(Symbol.OLOWEK, Symbol.PIES,
                Symbol.KLUCZ, Symbol.DRZEWO, Symbol.BOMBA, Symbol.BUTLA,
                Symbol.LUDZIK, Symbol.SERCE)));

        talia.push(new Karta(EnumSet.of(Symbol.DELFIN, Symbol.OKULARY,
                Symbol.SNIEZKA, Symbol.SLONCE, Symbol.KROPLA, Symbol.PIES,
                Symbol.LUDZIK, Symbol.STOKROTKA)));

        talia.push(new Karta(EnumSet.of(Symbol.KOTWICA, Symbol.MARCHEW,
                Symbol.SNIEZKA, Symbol.DRZEWO, Symbol.KROPLA, Symbol.PIES,
                Symbol.KSIEZYC, Symbol.PAJAK)));

        talia.push(new Karta(EnumSet.of(Symbol.DELFIN, Symbol.SERCE,
                Symbol.MLOT, Symbol.KOSTKA, Symbol.KROPLA, Symbol.OLOWEK,
                Symbol.OKULARY, Symbol.ZEBRA)));
    }


}
