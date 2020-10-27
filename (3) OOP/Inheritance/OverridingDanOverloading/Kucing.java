package OverridingDanOverloading;

public class Kucing extends Hewan {
	
	private String ras;
	private String habitat;
	
	public Kucing(String ras, String habitat) {
		this.ras = ras;
		this.habitat = habitat;
	}
	
	
	//toString digunakan untuk merepresentasikan objek dalam bentuk string sangat berguna salah satunya untuk debugging
	@Override
	public String toString() {
		return "kucing ras: "+ ras + ",habitat: "+habitat;
	}
	
	
	//equals digunakan untuk membandingkan antara dua objek apakah mereka sama??
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kucing) {
			Kucing other = (Kucing) obj;
			return this.ras.equals(other.ras);
		}else {
			return false;
		}
	}
	
	public void makan() {//overriding
		System.out.println("kucing sedang makan...");
	}
	public void makan(String food) {//overloading
		System.out.println("kucing makan"+food);
	}
}
