/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.asistensi;

/**
 *
 * @author vectorr
 */
public class nomor2 extends Thread{
   
    private String dokter = "pasien diperiksa dokter";
    private String perawat1 = "pasien dirawat perawat 1";
    private String perawat2 = "pasien dirawat perawat 2";
    private String kasir = "pasien membayar ke kasir";
    
    public void setString (String d, String p1, String p2, String k)
    {
        dokter = d;
        perawat1 = p1;
        perawat2 = p2;
        kasir = k;
    }
    
    @Override
    public void run()
    {
        try
        {
            System.out.println(dokter+perawat1+perawat2+kasir);
            Thread.sleep(1000);
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
//        if (i == 1)
//        {
//            for (int a = 1 ; a <= 10 ; a++)
//            {
//                System.out.println("pasien ke "+a+" dirawat oleh dokter");
//            }
//        }
//        if ( i == 2)
//        {
//            for (int a = 1 ; a <= 5 ; a++)
//            {
//                System.out.println("pasien ke "+a+" dirawat oleh perawat 1");
//            }
//        }
//        if (i==3)
//        {
//            for (int a = 6 ; a<= 10 ; a++)
//            {
//                System.out.println("pasien ke "+a+" dirawat oleh perawat 2");
//            }
//        }
//        
//        if (i==4)
//        {
//            for (int a = 1 ; a <= 10 ; a++)
//            {
//                System.out.println("pasien ke "+a+" bayar ke kasir");
//            }
//        }
        

    }
    
    public static void main(String[] args) throws InterruptedException {
        
        for ( int i = 0 ; i <= 10 ; i++)
        {
            if ( i == 0 && i <= 10)
            {
                nomor3 st = new nomor3();
                //st.setName(dok);
                
            }
        }
        
    }
}
