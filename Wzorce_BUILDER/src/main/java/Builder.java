public class Builder {
    public static void main(String[] args) {
        Pojazd p1= new Pojazd.Budowniczy()
        .id(1)
        .marka("BMW")
        .model("325i")
        .pojemnoscSilnika(2.5)
        .moc(170)
        .tworzNowyPojazd();
        System.out.println(p1);

        Pojazd p2 = new Pojazd.Budowniczy()
                .id(2)
                .marka("OPEL")
                .model("Astra")
                .pojemnoscSilnika(2.0)
                .moc(125)
                .tworzNowyPojazd();
        System.out.println(p2);
    }
}
