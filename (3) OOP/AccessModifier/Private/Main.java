package Private;

public class Main {
	
	public static void main (String[] args) {
		KelasA kelasA = new KelasA();
		
		//error terjadi karena memberA dan functionA bersifat private
		//System.out.println(kelasA.memberA);
		//System.out.println(kelasA.functionA());
		
		System.out.println(kelasA.functionB());
	}

}
