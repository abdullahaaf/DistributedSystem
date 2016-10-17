package tugas;


import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient {
	private static InetAddress host;
	private static final int PORT = 1234;
	public static void main(String[] args) {
		try {
			host = InetAddress.getLocalHost();
		}
		catch(UnknownHostException uhEx) {
			System.out.println("Host ID tidak ditemukan!");
			System.exit(1);
		}
		accessServer();
	}

	private static void accessServer() {
		Socket link = null; //Step 1.
		try {
			link = new Socket(host,PORT); //Step 1.
			Scanner input = new Scanner(link.getInputStream()); //Step 2.
			PrintWriter output = new PrintWriter( link.getOutputStream(),true); //Step 3.
			//men set up stream untuk input keyboard.
			Scanner userEntry = new Scanner(System.in);
			String message, response;
			System.out.println("Selamat Datang di d3ptzz's Client.\nSilahkan Masukkan kata kunci:\n  NAMA : untuk melihat data nama.\n  NIM  : untuk melihat data NIM. \n  EXIT : untuk keluar dari d3ptzz's Client. \n Kata kunci anda : ");
		
			do {
				message = userEntry.nextLine();
				output.println(message); //Step 4
				response = input.nextLine(); //Step 5.
				System.out.println("SERVER> "+response);
			}
			while (!message.equals("EXIT"));//step 6
		}
		catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	
		finally {
			try {
				System.out.println("\n* Memutus konkesi ke server... *");
				link.close(); //Step 7.
			}
			catch(IOException ioEx) {
				System.out.println("Gagal memutuskan koneksi!");
				System.exit(1);
			}
		}
	}
}