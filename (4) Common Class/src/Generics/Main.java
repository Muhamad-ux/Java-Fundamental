package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List lo = new ArrayList(); //list tanpa paramater
		lo.add("lo - String 1"); //lo menampung objek string
		lo.add(new Planet("Mercury", 0.06)); //lo menampung objek Planet
		
		for (Object o :lo) {
			Planet p = (Planet) o; //perlu type-casting dari Object ke planet
			p.print();
		}
		
		List<Planet> lp = new ArrayList(); //list dengan parameter
		lp.add(new Planet("Mercury", 0.06)); //lo menampung objek Planet
		lp.add("lp - String"); //baris ini error , lp tidak diijinkan menampung objek String
		
		for (Planet p : lp) {
			p.print();
		}
	}

}
