public class Klient {

    private String imie;
    private String plec;

    public String getPlec() {
        return plec;
    }

    public Klient(String imie, String plec) {
        this.imie = imie;
        this.plec = plec;
    }
    public void odpowiedz(String wiadomosc){

        System.out.println(imie + ":" + wiadomosc);

    }
    public static final Klient JACEK= new Klient("Jacek", "M");
    public static final Klient AGNIESZKA= new Klient("Agnieszka", "K");
    public static final Klient AGATA= new Klient("Agata", "K");
}
