package Exception;

import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try {
			//mencoba membaca berkas latihan.txt
			File file = new File("D://latihan.txt");
			FileReader fr = new FileReader(file);
			//jika berhasil maka tampilkan pesan
			System.out.println("Read file berhasil");
			
		} catch (Exception e) {
			//jika terjadi kesalahan makan tampilkan pesan
			System.out.println(e.getMessage());
		}

	}

}
