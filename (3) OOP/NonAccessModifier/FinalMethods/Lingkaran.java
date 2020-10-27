package FinalMethods;

public class Lingkaran {
	//metode yang dideklarasikan final maka tidak dapat di override oleh anak kelas.ini akan berguna jika kita ingin membuat metode yang tidak dapat diubah contohnya dibawah ini
	static final double PI = 3.141;
	
	int jari = 7;
	
	final double getLuas() {
		return PI * (jari*jari);
	}
}
