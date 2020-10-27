package PropertiDanMetode;

public class Hewan {
	//properti atau fields
	//inisialisasi dengan nilai inisial
	double tinggi=30;
	double berat=3;
	
	//inisialisasi melalui konstruktor
	int umur;
	
	
	//konstruktor dengan parameter
	Hewan(int umur){
		this.umur=umur;
	}
	
	
	//methode tanpa nilai balik (void)
	void lari(){
		System.out.println("berlari dengan cepat...");
	}
	void jalan() {
		System.out.println("berjalan menggunakan kaki...");
	}
	void makan() {
		System.out.println("makan menggunakan mulut...");
	}
	
	
	//methode menggunakan nilai balik (return)
	double getberat() {
		return berat;
	}
	double gettinggi() {
		return tinggi;
	}
	double getumur() {
		return umur;
	}
}
