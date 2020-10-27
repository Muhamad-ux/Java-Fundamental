package FileNavigation;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String dirname = "/java/latihan1";
		File file = null;
		String[] paths;
		
		try {
			//inisialisasi objek file
			file = new File(dirname);
			
			//ambil list file dan masukan ke string patchs
			paths = file.list();
			
			//tampilkan semua path yang ada
			for(String path : paths) {
				System.out.println(path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
