public class Fabryka {
    Fabryka(){
    }
public Pojazd utworzPojazd(Litera litera) throws Exception{
        switch (litera) {
            case K : {
                return new Kabriolet(4, "czerwony");
            }
            case L: {
                return new Limuzyna(4, "czarny");
            }
            case R : {
                return new Rower(2,"fioletowy");
            }default: {
                throw new Exception("Nie mamy takiego pojazdy");
            }
            }
        }

}

