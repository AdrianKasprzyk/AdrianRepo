public class UzytkownikFacebook implements UzytkownikFB_interface {
    String imie;
    String nazwisko;

    public UzytkownikFacebook(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "UzytkownikFacebook{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public void powiadom(Dzien dzien) {

        System.out.println("Dzien dobry! :  " + getImie()+ ", " + dzien  );


    }
}
