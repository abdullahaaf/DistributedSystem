
package percobaan;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andina
 */
public class SocketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket s = new Socket("localhost", 5136);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
           
            String pesan = "Hello\r\n";
           
            os.write(pesan.getBytes());
           

            int c;
            while(true)
            {
                c=is.read();
                System.out.print((char)c);
               
                if((char)c=='\n')
                    break;
            }
           
            is.close();
            os.close();
            s.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(SocketClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SocketClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
