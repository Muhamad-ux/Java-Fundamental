package OverridingDanOverloading;

public class Main {
	public static void main(String[] args) {
		Hewan hewan = new Hewan();//memanggil construktor
		Kucing kucing = new Kucing(null, null);//memanggil construktor
		
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
	}

}
