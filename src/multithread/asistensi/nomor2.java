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
    int i;
    public nomor2 (int i)
    {
        this.i = i;
    }
    
    @Override
    public void run()
    {
        if (i == 1)
        {
            for (int a = 1 ; a <= 10 ; a++)
            {
                System.out.println("pasien ke "+a+" dirawat oleh dokter");
            }
        }
        if ( i == 2)
        {
            for (int a = 1 ; a <= 5 ; a++)
            {
                System.out.println("pasien ke "+a+" dirawat oleh perawat 1");
            }
        }
        if (i==3)
        {
            for (int a = 6 ; a<= 10 ; a++)
            {
                System.out.println("pasien ke "+a+" dirawat oleh perawat 2");
            }
        }
        
        if (i==4)
        {
            for (int a = 1 ; a <= 10 ; a++)
            {
                System.out.println("pasien ke "+a+" bayar ke kasir");
            }
        }
        

    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread rumahsakit = new nomor2(1);
        rumahsakit.start();
        Thread.sleep(1000);
        
        Thread perawat1 = new nomor2(2);
        perawat1.start();
        Thread.sleep(1000);
        
        Thread perawat2 = new nomor2(3);
        perawat2.start();
        Thread.sleep(1000);
        
        Thread kasir = new nomor2(4);
        kasir.start();
        Thread.sleep(1000);
        
    }
}
