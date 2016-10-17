package tugas;


import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer  {
	private static ServerSocket servSock;
	private static final int PORT = 1234;
        private String nim;
        private String nama;
        private String jurusan;
        private String asal;
 
    public String getJurusan() {
        return jurusan;
    }
 
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getNim() {
        return nim;
    }
 
    public void setNim(String nim ) {
        this.nim = nim;
    }
 
    public String getAsal() {
        return asal;
    }
 
    public void setAsal(String asal) {
        this.asal = asal;
    }
 
        
	public static void main(String[] args) {
	
            
            System.out.println("Membuka port...\n");
		try {
		servSock = new ServerSocket(PORT); //Step 1.
		System.out.println("Berhasil membuka port!\n\nServer Hidup. Menunggu koneksi dari klien!");
		}
		catch(IOException ioEx) {
			System.out.println("Tidak dapat membuka port!");
			System.exit(1);
		}
		do {
			handleClient();
		}
		while (true);
	}

	public static void handleClient() {
		
            
            Socket link = null; //Step 2.
		try {
			link = servSock.accept(); //Step 2.
			Scanner input = new Scanner(link.getInputStream());//Step 3.
			PrintWriter output = new PrintWriter(link.getOutputStream(),true); //Step 3.
			int numMessages = 0;
			String message = input.nextLine(); //Step 4.
			while (!message.equals("EXIT")) {
				System.out.println("Message received: " + message);
				numMessages++;
				//step 5
				if(message.compareTo("NAMA")==0){
                                    String nama1 = getNama();
                                    output.println(nama1);
				}
				
				
				else {
					output.println("Kata kunci anda salah. Mohon ulangi kembali.");
				}
			
				message = input.nextLine();
			}
			output.println(numMessages + " kata kunci diterima.");
		}
		catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
		finally {
			try {
				System.out.println("\n* Memutus koneksi... *");
				link.close(); //Step 6.
			}
			catch(IOException ioEx) {
				System.out.println("Gagal memutus koneksi!");
				System.exit(1);
			}
		}
	}
}