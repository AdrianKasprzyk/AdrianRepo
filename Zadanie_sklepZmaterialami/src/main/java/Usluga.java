public class Usluga {
   private Klient klient;
   private Ubranie ubranie;

    public Usluga(Klient klient, Ubranie ubranie) {
        this.klient = klient;
        this.ubranie = ubranie;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Ubranie getUbranie() {
        return ubranie;
    }

    public void setUbranie(Ubranie ubranie) {
        this.ubranie = ubranie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usluga usluga = (Usluga) o;

        if (klient != null ? !klient.equals(usluga.klient) : usluga.klient != null) return false;
        return ubranie != null ? ubranie.equals(usluga.ubranie) : usluga.ubranie == null;
    }

    @Override
    public int hashCode() {
        int result = klient != null ? klient.hashCode() : 0;
        result = 31 * result + (ubranie != null ? ubranie.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Usluga{" +
                "klient=" + klient +
                ", ubranie=" + ubranie +
                '}';
    }
}
