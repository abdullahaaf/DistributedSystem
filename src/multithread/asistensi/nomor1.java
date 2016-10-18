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
public class nomor1 extends Thread{
   private String threadName = "Penjumlahan Array";
   private int sum;
   private int num1,num2,num3;
   
   
    public void setNum(int n1, int n2, int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    
    public void run()
    {
        try
        {
            sum = num1 + num2 + num3;
            System.out.println(threadName+" "+num1+" + "+num2+" + "+num3+" = "+sum);
            Thread.sleep(100);
        }catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
            int[] arr1 = {6,9,1,2,3,5};
            int[] arr2 = {7,11,6,4,3,1};
            int[] arr3 = {5,4,3,2,1,11};
        
        for (int i = 0 ; i < arr1.length ; i++)
        {
            if ( i == 0)
            {
                nomor1 st = new nomor1();
                st.setNum(arr1[0], arr2[0], arr3[0]);
                st.start();
            
            }else if (i == 1)
            {
                nomor1 st1 = new nomor1();
                st1.setNum(arr1[1], arr2[1], arr3[1]);
                st1.start();
            }else if ( i == 2)
            {
                nomor1 st2 = new nomor1();
                st2.setNum(arr1[2], arr2[2], arr3[2]);
                st2.start();
            }else if ( i == 3)
            {
                nomor1 st3 = new nomor1();
                st3.setNum(arr1[3], arr2[3], arr3[3]);
                st3.start();
            }else if ( i == 4)
            {
                nomor1 st4 = new nomor1();
                st4.setNum(arr1[4], arr2[4], arr3[4]);
                st4.start();
            }else if ( i == 5)
            {
                nomor1 st5 = new nomor1();
                st5.setNum(arr1[5], arr2[5], arr3[5]);
                st5.start();
            }
        }
    }
}
