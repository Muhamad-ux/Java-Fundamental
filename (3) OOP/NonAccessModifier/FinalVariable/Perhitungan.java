package FinalVariable;

public class Perhitungan {
	final int nilai = 5;
	
	void ubahNilai() {
		//kode dibawah akan error karena kita mencoba untuk mengganti variable nilai dengan objek baru
		nilai = 10;
	}

}
