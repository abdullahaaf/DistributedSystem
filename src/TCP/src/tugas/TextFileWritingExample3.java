package tugas;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;





public class TextFileWritingExample3 {

	public static void main(String[] args) {
		try {
			FileOutputStream outputStream = new FileOutputStream("D://MyFile.txt");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("salam");
			bufferedWriter.newLine();
			bufferedWriter.write("kami");
			
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
