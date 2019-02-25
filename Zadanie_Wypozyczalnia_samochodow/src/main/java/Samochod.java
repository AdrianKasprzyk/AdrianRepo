import java.util.Comparator;

public class Samochod {
    private String marka;
    private String model;
    private int przebieg;

    public Samochod(String marka, String model, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Samochod samochod = (Samochod) o;

        if (przebieg != samochod.przebieg) return false;
        if (marka != null ? !marka.equals(samochod.marka) : samochod.marka != null) return false;
        return model != null ? model.equals(samochod.model) : samochod.model == null;
    }

    @Override
    public int hashCode() {
        int result = marka != null ? marka.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + przebieg;
        return result;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", przebieg=" + przebieg +
                '}';
    }

    public static Comparator<Samochod> WG_PRZEBIEGU = new Comparator<Samochod>() {
        public int compare(Samochod o1, Samochod o2) {
            if (o1.getPrzebieg() > o2.getPrzebieg()) {
                return 1;
            }
            if (o1.getPrzebieg() == o2.getPrzebieg()) {
                return 0;

            } else return -1;


        }


    };
}
