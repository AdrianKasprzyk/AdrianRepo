public class SilnikFb {
    public static void main(String[] args) {


        Facebook facebook = new Facebook();

        UzytkownikFacebook uzytkownikFacebook = new UzytkownikFacebook("Adrian", "Kasprzyk");
        UzytkownikFacebook uzytkownikFacebook2 = new UzytkownikFacebook("Marzena", "Augustynowicz");

        Wydarzenie wydarzenie1= new Wydarzenie("Treing pilki noznej");
        Wydarzenie wydarzenie2= new Wydarzenie("Kocnert PW");
        Wydarzenie wydarzenie3= new Wydarzenie("Premiera filmu");

        Urodziny urodziny1= new Urodziny("Tomasz");
        Urodziny urodziny2= new Urodziny("Waldek");
        Urodziny urodziny3= new Urodziny("Piotr");

        Dzien dzien1= new Dzien("poniedzialek",wydarzenie1, urodziny1  );
        Dzien dzien2= new Dzien("wtorek", wydarzenie2,urodziny2);
        Dzien dzien3= new Dzien("sroda", wydarzenie3, urodziny3);

        facebook.zaloguj(uzytkownikFacebook);
        facebook.zaloguj(uzytkownikFacebook2);

        facebook.aktualizujDzien(dzien1);
        facebook.wyloguj(uzytkownikFacebook2);
        facebook.aktualizujDzien(dzien3);
        facebook.zaloguj(uzytkownikFacebook2);
        facebook.aktualizujDzien(dzien2);

    }
}