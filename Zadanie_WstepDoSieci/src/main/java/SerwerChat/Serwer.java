package SerwerChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Serwer {
    ArrayList klientArrayList;
    PrintWriter printWriter;



    public static void main(String[] args) {
        Serwer serwer= new Serwer();
        serwer.start();
    }

    public void start(){
        klientArrayList= new ArrayList();

        try {
            ServerSocket serverSocket= new ServerSocket(5000);
            while (true){
                Socket socket= serverSocket.accept();
                System.out.println("Slucham "+ socket);
                printWriter= new PrintWriter(socket.getOutputStream());
                klientArrayList.add(printWriter);

                Thread thread= new Thread(new SerwerKlient(socket));
                thread.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    class SerwerKlient implements Runnable{
        Socket socket;
        BufferedReader bufferedReader;

        public SerwerKlient(Socket socketKlient) {
            try {
                System.out.println("Polaczony");
                socket= socketKlient;
                bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        public void run() {
            String str;
            PrintWriter pw = null;
            try {
                while ((str= bufferedReader.readLine())!=null){
                    System.out.println("Odebrano "+ str);

                    Iterator it = klientArrayList.iterator();
                    while (it.hasNext()){
                        pw= (PrintWriter) it.next();
                        pw.println(str);
                        pw.flush();
                    }

                }
            }catch (Exception exc){
                exc.printStackTrace();
            }

        }
    }
}
