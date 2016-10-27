/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_c_p;
import java.io.*;
import java.net.*;
/**
 *
 * @author vectorr
 */
public class Client implements Runnable {
    private static Socket clientSocket = null;
    private static PrintStream os = null;
    private static DataInputStream is = null;
    private static BufferedReader inputline = null;
    private static boolean close = false;
    
    public static void main(String[] args) {
        int service_port = 13;
        String host = "localhost";
//        if (args.length < 2)
//        {
//            
//        }

    try
    {
        clientSocket = new Socket(host, service_port);
        inputline = new BufferedReader(new InputStreamReader(System.in));
        os = new PrintStream(clientSocket.getOutputStream());
        is = new DataInputStream(clientSocket.getInputStream());
    }catch (UnknownHostException uhe)
    {
        System.err.println("ga tau host nya bro");
    }catch (IOException e)
    {
        System.err.println("");
    }
    
        if (clientSocket != null && os != null && is != null)
        {
            try
            {
                new Thread(new Client()).start();
                while (!close)
                {
                    os.println(inputline.readLine().trim());
                }
                
                os.close();
                is.close();
                clientSocket.close();
            }catch (IOException e)
            {
                
            }
        }
    
    }
    
    public void run()
    {
        String respon;
        try
        {
            while ((respon = is.readLine()) != null)
            {
                System.out.println(respon);
                if (respon.indexOf("good bye") != -1)
                {
                    break;
                }
                close = true;
            }
        }catch (IOException e)
        {
            e.getMessage();
        }
    }
    
}
