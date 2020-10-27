package Objek;

public class Main {

	public static void main(String[] args) {
		Hewan Elang = new Hewan("Elang");
		Hewan Kucing = new Hewan("Kucing");
		
		Elang.beratHewan(5);
		Elang.jumlahkakiHewan(2);
		Elang.cetakHewan();
		
		Kucing.beratHewan(2);
		Kucing.jumlahkakiHewan(4);
		Kucing.cetakHewan();

	}

}
