public class Pojazd {
    private int id;
    private String marka;
    private String model;
    private double pojemnoscSilnika;
    private int moc;

    public static class Budowniczy{
        int id=0;
        String marka= null;
        String model=null;
        double pojemnoscSilnika=0.0;
        int moc=0;

        public Budowniczy id(int id){
            this.id=id;
            return this;
        }
        public Budowniczy marka(String marka){
            this.marka=marka;
            return this;
        }
        public Budowniczy model(String model){
            this.model=model;
            return this;
        }
        public Budowniczy pojemnoscSilnika(double pojemnoscSilnika){
            this.pojemnoscSilnika= pojemnoscSilnika;
            return this;
        }
        public Budowniczy moc(int moc){
            this.moc=moc;
            return this;
        }
        public Pojazd tworzNowyPojazd(){
            return new Pojazd(this);
        }

}

    public Pojazd(Budowniczy budowniczy) {
        this.id= budowniczy.id;
        this.marka=budowniczy.marka;
        this.model=budowniczy.model;
        this.pojemnoscSilnika=budowniczy.pojemnoscSilnika;
        this.moc=budowniczy.moc;
    }



    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public int getMoc() {
        return moc;
    }
    @Override
    public String toString() {
        return "Pojazd : " +
                + id +
                ", " + marka +
                ", " + model +
                ", " + pojemnoscSilnika +
                ", " + moc ;
    }
}
