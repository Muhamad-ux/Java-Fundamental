package Objek;

public class Hewan {
	String nama;
	int berat;
	int jumlahkaki;

	//ini merupakan konstruktor dari kelas hewan dan method pertama kali pada saat objek diciptakan
	public Hewan(String namaHewan) {
		nama=namaHewan;
	}
	
	public void beratHewan(int beratHewan) {
		berat=beratHewan;
	}
	
	public void jumlahkakiHewan(int jumlahkakiHewan) {
		jumlahkaki=jumlahkakiHewan;
	}
	
	public void cetakHewan() {
		System.out.println("Nama hewan :"+nama);
		System.out.println("Berat hewan :"+berat);
		System.out.println("jumlah kaki :"+jumlahkaki);
	}

}
