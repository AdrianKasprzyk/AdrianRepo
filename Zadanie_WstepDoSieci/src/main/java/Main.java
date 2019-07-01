import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception{
        InetAddress adresssIP= InetAddress.getLocalHost();
        System.out.println(adresssIP);

        adresssIP= InetAddress.getByName("allegro.pl");
        System.out.println(adresssIP);

        URL url = new URL("https://allegro.pl");





        System.out.println("Protokol : "+ url.getProtocol());
        System.out.println("Host : " +url.getHost());
        System.out.println("Content : "+url.getContent());
        System.out.println("Path : "+url.getPath());
        System.out.println("Port : "+ url.getPort());

        URLConnection urlConnection= url.openConnection();
        long dataModyfikacju = urlConnection.getLastModified();
        System.out.println(new Date(dataModyfikacju));
    }
}
