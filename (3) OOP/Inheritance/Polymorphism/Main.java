package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Hewan hewan = new Hewan();//memanggil construktor
		Kucing kucing = new Kucing(null, null);//memanggil construktor
		Mamalia mamalia = new Kucing();
		
		hewan.makan();//kucing mewarisi metode makan() dari parent class hewan
		kucing.makan();
		kucing.makan(" daging ikan");
		
		System.out.println("----------------------");
		
		Kucing meow = new Kucing("ocicat","tropis");
		Kucing puss = new Kucing("ocicat","subtropis");
		Kucing popo = new Kucing("anggora","subtropis");
		
		System.out.println(meow.toString());
		System.out.println(puss.toString());
		System.out.println(popo.toString());
		
		System.out.println("meow equals puss ? "+meow.equals(puss));
		System.out.println("meow equals popo ? "+meow.equals(popo));
		
		System.out.println("------------------------");
		
		Object o = new Kucing();//kucing adalah objek
		Hewan h = new Kucing();//kucing adalah hewan
		Kucing k = new Kucing();//kucing adalah kucing
		
		//o.makan(); //terjadi error karena method makan() tidak ada pada kelas objek
		h.makan();
		k.makan();
		
		Object objek = k;//bisa langsung di assign
		Hewan hewank = k;//bisa langsung di assign
		
		//objek.makan(); //tejadi error karena method makan() tidak ada pada kelas objek
		hewank.makan();
		
		Kucing kucingk = (Kucing) h; //tidak bisa langsung di assign, perlu casting
		kucingk.makan();
		
		Hewan harimau = new Hewan();
		Kucing anggora = (Kucing) harimau; //compile ok tetapi runtime error ClassCastException
		
		
	}

}
