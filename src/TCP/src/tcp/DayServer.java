package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Malik
 */
public class DayServer {

    public static final int SERVICE_PORT = 7;

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime Server Started");
            for (;;) {
                Socket nextClient = ss.accept();
                System.out.println("Received Request From : " + nextClient.getInetAddress() + ":" + nextClient.getPort());
                OutputStream out = nextClient.getOutputStream();
                PrintStream p = new PrintStream(out);
                p.print(new java.util.Date());
                out.flush();
                out.close();
                nextClient.close();
            }
        } catch (BindException b) {
            System.err.println("Service already running on port : " + b);
        } catch (IOException e) {
            System.err.println("I/O Error : " + e);
        }
    }
}
