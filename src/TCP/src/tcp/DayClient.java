package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Malik
 */
public class DayClient {

    public static final int SERVICE_PORT = 7;

    public static void main(String[] args) throws IOException {
        try {
            String hostname = "localhost";
            Socket daytime = new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection Is Estabilished");

            daytime.setSoTimeout(2000);
            BufferedReader b = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
            System.out.println("Result : " + b.readLine());
            daytime.close();
        } catch (IOException e) {
            System.err.println("Error : " + e);
        }
    }
}
