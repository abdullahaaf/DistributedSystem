/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;
import javax.swing.JOptionPane;
/**
 *
 * @author vectorr
 */
public class no4 {
    public static void main(String[] args) {
    int i = 1;
    String bilN = JOptionPane.showInputDialog(null, "masukkan nilai n");
    int angkaN = Integer.parseInt(bilN);
    String bilX = JOptionPane.showInputDialog(null, "masukkan bilangan x");
    int angkaX = Integer.parseInt(bilX);
    
    int hasil = 0;
    int kali = 2 * i;
    int jumlah = angkaX + kali;
        
        for (int a = i ; a < angkaN ; a++)
        {
//            jumlah++;
            hasil += jumlah;
        }
    JOptionPane.showMessageDialog(null, "hasil penjumlahan = "+hasil);
    }
}
    
