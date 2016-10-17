/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;
import javax.swing.JOptionPane;
/**
 *
 * @author sofie
 */
public class no3
{
    public static void main(String[] args) {
        String angkaMin = JOptionPane.showInputDialog(null, "masukkan angka minimal");
        String angkaMax = JOptionPane.showInputDialog(null, "masukkan angka maksimal");
        int angkaMinimal = Integer.parseInt(angkaMin);
        int angkaMaximal = Integer.parseInt(angkaMax);
        int jumlahgenap = 0;
        int jumlahganjil = 0;
        for (int i = angkaMinimal ; i <= angkaMaximal ; i++)
        {
            if ( i%2 ==0)
            {
               jumlahgenap++;
               //jumlahgenap+=i;
            }else
            {
                jumlahganjil++;
                //jumlahganjil+=i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "jumlah angka genap = "+jumlahgenap+"\njumlah ganjil = "+jumlahganjil);
    }
    
}
