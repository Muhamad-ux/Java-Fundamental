package InputOuput;

import java.util.Scanner;

public class InputOutputFunction {
	
	public static void main(String[] args) {
		System.out.println("BIODATA");
		Scanner deteksi = new Scanner(System.in);
		
		System.out.println("Nama depan anda");
		String namadepan = deteksi.next();
		System.out.println("Nama belakang anda");
		String namabelakang = deteksi.next();
		
		String namalengkap = namadepan + namabelakang;
		System.out.println("Nama lengkap anda adalah "+namalengkap);


}
}
