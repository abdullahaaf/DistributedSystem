/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.IOException;

/**
 *
 * @author vectorr
 */
public class terimathread extends Thread{
    public void run()
    {
        System.out.println("Angka genap sebanyak 10 kali");
        int genap;
        for (genap = 1 ; genap <= 20 ; genap++)
        {
            if (genap % 2 == 0)
            {
                System.out.println(genap);
            }
        }
    }
    
    public static void main(String[] args) {
        Thread bb = new terimathread();
        bb.start();
    }
}
