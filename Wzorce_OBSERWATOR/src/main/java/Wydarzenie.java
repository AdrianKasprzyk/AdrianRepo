public class Wydarzenie{
    String nazwa;

    public Wydarzenie(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
