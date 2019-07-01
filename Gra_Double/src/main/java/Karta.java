import java.util.EnumSet;

public class Karta {
    EnumSet<Symbol> symbols;
    public Karta(){}

public Karta(EnumSet<Symbol> symbols){
    if (symbols.size()!=8){
        throw new RuntimeException("Invalid card");
    }
    this.symbols=symbols;
    }

    public EnumSet<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(EnumSet<Symbol> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "symbols=" + symbols +
                '}';
    }
}
