package Private;

//private tidak dapat diakses oleh kelas lain meskipun satu package (hanya sebatas dalam kelas saja)
public class KelasA {
	
	private int memberA = 5;
	
	private int functionA() {
		return memberA;
	}
	
	int functionB() {
		//Pemanggilan private member dan private function
		int hasil = functionA() + memberA;
		return hasil;
	}

}
