// Stworz klase samochod (marka model rok cena) , stworz komis -  lista wszystkich samochodow i utworz
// znajdz samochod do okreslonej kwoty, znajdz samochod okreslonej marki, znajdz samochod okreslonej marki modelu
// kupiono auto


public class Samochod {
 String marka;
 String model;
 int rok;
 double cena;

 @Override
 public String toString() {
  return "Samochod{" +
          "marka='" + marka + '\'' +
          ", model='" + model + '\'' +
          '}';
 }




 public void setMarka(String marka) {
  this.marka = marka;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public void setRok(int rok) {
  this.rok = rok;
 }

 public void setCena(double cena) {
  this.cena = cena;
 }

 public String getMarka() {
  return marka;
 }

 public String getModel() {
  return model;
 }

 public int getRok() {
  return rok;
 }

 public double getCena() {
  return cena;
 }



 public Samochod(String marka, String model, int rok, double cena) {
  this.marka = marka;
  this.model = model;
  this.rok = rok;
  this.cena = cena;
 }
}
