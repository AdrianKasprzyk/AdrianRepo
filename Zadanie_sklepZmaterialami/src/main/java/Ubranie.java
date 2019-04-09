public class Ubranie {
    Mareriał marerial;
    private String rodzaj;
    private String kolor;

    public Ubranie(Mareriał marerial, String rodzaj, String kolor) {
        this.marerial = marerial;
        this.rodzaj = rodzaj;
        this.kolor = kolor;
    }

    public Mareriał getMarerial() {
        return marerial;
    }

    public void setMarerial(Mareriał marerial) {
        this.marerial = marerial;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ubranie ubranie = (Ubranie) o;

        if (marerial != ubranie.marerial) return false;
        if (rodzaj != null ? !rodzaj.equals(ubranie.rodzaj) : ubranie.rodzaj != null) return false;
        return kolor != null ? kolor.equals(ubranie.kolor) : ubranie.kolor == null;
    }

    @Override
    public int hashCode() {
        int result = marerial != null ? marerial.hashCode() : 0;
        result = 31 * result + (rodzaj != null ? rodzaj.hashCode() : 0);
        result = 31 * result + (kolor != null ? kolor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ubranie{" +
                "marerial=" + marerial +
                ", rodzaj='" + rodzaj + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
