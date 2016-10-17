package tcp;

import com.sun.xml.internal.ws.resources.SenderMessages;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Malik
 */
public class no3_Server {

    public static final int SERVICE_PORT = 7;

    public static void main(String[] args) throws IOException {

        try {
            ServerSocket ss = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime Server Started");
            String pesan;String SendMessage;
            for (;;) {
                Socket nextClient = ss.accept();
                System.out.println("Received Request From : " + nextClient.getInetAddress() + ":" + nextClient.getPort());
                
                InputStream input = nextClient.getInputStream();
                BufferedReader bf = new BufferedReader(new InputStreamReader(input));

                pesan = bf.readLine();
                System.out.println("Pesan Masuk : " + pesan);

                OutputStream out = nextClient.getOutputStream();
                PrintWriter pwriter = new PrintWriter(out, true);

                if (pesan.equals("Assalamualaikum")) {
                    SendMessage = "Waalaikumsalam";
                    pwriter.println(SendMessage);
                } else {
                    SendMessage = pesan + "\tJuga";
                    pwriter.println(SendMessage);
                }

//                OutputStream out = nextClient.getOutputStream();
//                PrintStream p = new PrintStream(out);
//                p.print(new java.util.Date());
//                out.flush();
//                out.close();
                nextClient.close();
            }
        } catch (BindException b) {
            System.err.println("Service already running on port : " + b);
        } catch (IOException e) {
            System.err.println("I/O Error : " + e);
        }
    }
}
