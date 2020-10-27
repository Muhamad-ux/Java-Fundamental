package Default;

public class Main {
	public static void main(String[] args) {
		Hewan hewan = new Hewan();//memanggil constructor
		System.out.println("apakah hewan 15-A Objek ->" + (hewan instanceof Object));
		System.out.println("apakah hewan 15-A Hewan ->" + (hewan instanceof Hewan));
		System.out.println("apakah hewan 15-A Kucing ->" + (hewan instanceof Kucing));
		
		System.out.println("-------------------------------");
		
		Kucing kucing = new Kucing();//memanggil construktor
		System.out.println("apakah hewan 15-A Objek ->" + (kucing instanceof Object));
		System.out.println("apakah hewan 15-A Hewan ->" + (kucing instanceof Hewan));
		System.out.println("apakah hewan 15-A Kucing ->" + (kucing instanceof Kucing));
	}
}
