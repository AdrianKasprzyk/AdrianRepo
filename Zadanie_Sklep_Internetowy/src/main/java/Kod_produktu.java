public class Kod_produktu {
    private int kod;

    public Kod_produktu(int kod) {
        this.kod = kod;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kod_produktu that = (Kod_produktu) o;

        return kod == that.kod;
    }

    @Override
    public int hashCode() {
        return kod;
    }

    @Override
    public String toString() {
        return "kod_produktu{" +
                "kod=" + kod +
                '}';
    }
}
