public class Miasto {
    String nazwa;
    String wojewodztwo;

    public Miasto(String nazwa, String wojewodztwo) {
        this.nazwa = nazwa;
        this.wojewodztwo = wojewodztwo;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Miasto miasto = (Miasto) o;

        if (nazwa != null ? !nazwa.equals(miasto.nazwa) : miasto.nazwa != null) return false;
        return wojewodztwo != null ? wojewodztwo.equals(miasto.wojewodztwo) : miasto.wojewodztwo == null;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (wojewodztwo != null ? wojewodztwo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Miasto=" +
                "nazwa: " + nazwa  +
                ", wojewodztwo: " + wojewodztwo  ;
    }

    public boolean zawiera(String token) {
        String toLoweredCaseToken= token.toLowerCase();
        return nazwa.toLowerCase().contains(toLoweredCaseToken)|| wojewodztwo.toLowerCase().contains(toLoweredCaseToken);
    }
    public int compareAscending(Miasto m2) {
        int lastNamesDifference = this.nazwa.compareTo(m2.nazwa);
        return lastNamesDifference == 0 ?
                this.wojewodztwo.compareTo(m2.wojewodztwo) : lastNamesDifference;
    }

}
