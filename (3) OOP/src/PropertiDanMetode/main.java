package PropertiDanMetode;

public class main {
	
	public static void main(String[] args) {
		//kita tambahkan dengan argumen int 2
		//nilai tersebut digunakan untuk menginisialisasikan variable umur
		Hewan kucing = new Hewan(2);
		kucing.makan();
		kucing.jalan();
		kucing.lari();
		
		//contoh penggunaaan fungsi getumur
		System.out.println("umurnya adalah"+kucing.getumur());
		
		//perhitungan indeks massa tubuh (BMI)
		//berat(kg) / (tinggi(m) / tinggi(m))
		double bmi = kucing.getberat() / ((kucing.gettinggi()*0.01) * ((kucing.gettinggi()*0.01)));
		System.out.println("indeks massa tubuhnya adalah "+bmi);
	}

}
