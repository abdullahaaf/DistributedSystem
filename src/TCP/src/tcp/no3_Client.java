
package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Malik
 */
public class no3_Client {
    public static final int SERVICE_PORT = 7;

    public static void main(String[] args) throws IOException {
        String SendMessage;
        String pesan;
        try {
            String hostname = "localhost";
            Socket ss = new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection Is Estabilished");
            
            
            OutputStream out = ss.getOutputStream();
            PrintWriter pwriter = new PrintWriter(out, true);
            System.out.println("Tulis Pesan : ");
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            SendMessage = b.readLine();
            pwriter.println(SendMessage);
            
            InputStream in = ss.getInputStream();
            BufferedReader f = new BufferedReader(new InputStreamReader(in));
            
            while ((pesan= f.readLine())!=null){
                System.out.println("Balasan : "+pesan);
            }
//            daytime.setSoTimeout(2000);
//            BufferedReader b = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
//            System.out.println("Result : " + b.readLine());
//            daytime.close();
        } catch (IOException e) {
            System.err.println("Error : " + e);
        }
    }
}
