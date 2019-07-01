import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Serwer2{
    BufferedReader czytacz;
    PrintWriter wysylacz;
    Socket socket;
    ArrayList listaUzytkownikow;
    public static void main(String[] args) {
Serwer2 serwer2= new Serwer2();
serwer2.start();
    }

    private void start() {
        listaUzytkownikow= new ArrayList();
        try {
            ServerSocket gniazdroSerwera= new ServerSocket(4999);
            while (true){
                socket=gniazdroSerwera.accept();
                wysylacz= new PrintWriter(socket.getOutputStream());
                listaUzytkownikow.add(wysylacz);

                Thread t= new Thread(new ObslugaKlientow(socket));
                t.start();


            }


        }catch (Exception e){
            System.out.println("Zerwano polaczenie!");
        }
    }
    class ObslugaKlientow implements Runnable {
        Socket socket;
        BufferedReader czytacz;

        public ObslugaKlientow(Socket socketUzytkownik){
            try {


                socket = socketUzytkownik;
                czytacz= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        public void run() {
            String wiadomosc;
            PrintWriter pisarz;
            try{
                while((wiadomosc=czytacz.readLine())!=null){
                    System.out.println("Odebrano wiadomosc: "+ "\n"+ wiadomosc);
                    rozeslijWiadomosc(wiadomosc);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
    public void rozeslijWiadomosc(String wiadomosc){
        PrintWriter pisarz;
        Iterator it= listaUzytkownikow.iterator();
        while (it.hasNext()){
            try {
                pisarz= (PrintWriter)it.next();
                pisarz.println(wiadomosc);
                pisarz.flush();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }


    }