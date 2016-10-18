/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_uts;
import java.net.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author vectorr
 */
public class chatServer {
    static Vector clientsockets;
    static Vector loginName;

    public chatServer() throws Exception {
        ServerSocket sok = new ServerSocket(5217);
        clientsockets = new Vector();
        loginName = new Vector();
        
        while (true) {            
            Socket soc = sok.accept();
           acceptclient obClient = new acceptclient(soc);
        }
    }
    
    public class acceptclient extends Thread
    {
        Socket clientSocket;
        DataInputStream din;
        DataOutputStream dout;

        public acceptclient(Socket soc) throws Exception {
            clientSocket = soc;
            din = new DataInputStream(clientSocket.getInputStream());
            dout = new DataOutputStream(clientSocket.getOutputStream());
            
            String loginname = din.readUTF();
            
            System.out.println("User logged in : "+loginname);
            loginName.add(loginname);
            clientsockets.add(clientSocket);
            start();
        }
        
        public void run()
    {
        while (true) {            
            try
            {
                String msgFromClient = new String();
                msgFromClient = din.readUTF();
                StringTokenizer st = new StringTokenizer(msgFromClient);
                String sendto = st.nextToken();
                String msgtype = st.nextToken();
                
                int icount = 0;
                
                    if (msgtype.equals("Logout"))
                    {
                        for (icount = 0 ; icount < loginName.size(); icount++)
                        {
                            if (loginName.elementAt(icount).equals(sendto))
                            {
                                loginName.removeElementAt(icount);
                                clientsockets.removeElementAt(icount);
                                System.out.println("user "+sendto+" logged out");
                                break;
                            }
                        }
                    }else
                    {
                        String msg = "";
                        while(st.hasMoreTokens())
                        {
                            msg = msg+ " " + st.nextToken();
                        }
                        for (icount = 0 ; icount < loginName.size() ; icount++)
                        {
                            if (loginName.elementAt(icount).equals(sendto))
                            {
                                Socket tsoc = (Socket)clientsockets.elementAt(icount);
                                DataOutputStream tdout = new DataOutputStream(tsoc.getOutputStream());
                                tdout.writeUTF(msg);
                                break;
                            }
                        }
                        
                        if (icount== loginName.size())
                        {
                            dout.writeUTF("i am offline");
                        }else
                        {
                            
                        }
                    }
                    if (msgtype.equals("LOGOUT"))
                    {
                        break;
                    } 
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
        
    }
    
    
    
    public static void main(String[] args) throws Exception {
        chatServer ob = new chatServer();
    }
    
}
