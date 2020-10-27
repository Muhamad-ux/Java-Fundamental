package StaticVariable;

//berdiri sendiri tanpa perlu instance dari kelas
public class Main {
	
	public static void main(String[] args) {
		System.out.println("NIlainya adalah "+Perhitungan.nilai);
		
		for(int x=0; x<5; x++) {
			new Perhitungan();
		}
		
		System.out.println("sampai "+Perhitungan.nilai);
	}

}
