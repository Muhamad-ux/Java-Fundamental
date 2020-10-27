package Default;

public class Kucing extends Hewan {
	public Kucing() {
		super();//akan tetap memanggil constructor dari parent class
		System.out.println("construct kucing");
	}
}
