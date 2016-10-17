package percobaan;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andina
 */
public class SocketServer {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ServerSocket ss = new ServerSocket(5136);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
           
            String respon = "Hello World\r\n";
           
            int c;
            while(true)
            {
                c=is.read();
                System.out.print((char)c);
               
                if((char)c=='\n')
                    break;
            }
            os.write(respon.getBytes());
            os.flush();
           
            os.close();
            is.close();
            s.close();
           
           
        } catch (IOException ex) {
            Logger.getLogger(SocketServer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}