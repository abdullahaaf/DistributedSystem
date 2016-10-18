/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_uts;
import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.*;
/**
 *
 * @author vectorr
 */
public class chatClient extends Frame implements Runnable{
    Socket soc;
    TextField tf;
    TextArea ta;
    Button btnSend,btnClose;
    String sendTo;
    String loginName;
    Thread t = null;
    DataOutputStream dout;
    DataInputStream din;
        
        chatClient(String loginName,String chatWith) throws Exception
        {
          super(loginName);
          this.loginName = loginName;
          sendTo = chatWith;
          tf = new TextField(50);
          ta = new TextArea(50, 50);
          btnSend = new Button("Send");
          btnClose = new Button("Close");
          soc = new Socket("127.0.0.1", 5217);
          
          din = new DataInputStream(soc.getInputStream());
          dout = new DataOutputStream(soc.getOutputStream());
          dout.writeUTF(loginName);
          
          t = new Thread(this);
          t.start();
        }
        
        void setup()
        {
            setSize(600,400);
            setLayout(new GridLayout(2, 1));
            
            add(ta);
            Panel p = new Panel();
            
            p.add(tf);
            p.add(btnSend);
            p.add(btnClose);
            add(p);
            show();
        }
        
        public boolean action (Event e , Object o)
        {
            if (e.arg.equals("Send"))
            {
                try
                {
                    dout.writeUTF(sendTo+" "+" Data "+" "+tf.getText().toString());
                    ta.append("\n"+loginName+" says : " +tf.getText().toString());
                    tf.setText("");
                }catch (Exception ex)
                {
                    
                }
            }else if (e.arg.equals("Close"))
            {
                try
                {
                    dout.writeUTF(loginName + "Logout");
                    System.exit(1);
                }catch (Exception ex)
                {
                    
                }
            }
            return super.action(e, o);
        }
        
        public static void main(String[] args) throws Exception {
        
            chatClient c1 = new chatClient(args[0], args[1]);
            c1.setup();
    }
        
        public void run()
        {
            while (true) {                
                try
                {
                    ta.append("\n" + sendTo + " says : "+din.readUTF());
                    
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        }
}
