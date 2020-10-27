package Collection;

import java.util.*;

public class SetPlanet {

	public static void main(String[] args) {
		//menggunakan HasSet
		Set<String> planets = new HashSet<>();
		planets.add("merkurius");
		planets.add("venus");
		planets.add("earth");
		planets.add("earth"); //menambah objek "earth" beberapa kali
		planets.add("earth");
		planets.add("mars"); //objek bisa terus ditambahkan ke Set
		
		
		//method size() untuk mendapatkan ukuran Set
		System.out.println("Set planets awal: (Size = "+planets.size()+")");
		for(String planet : planets) {
			System.out.println("\t"+planet);
		}
		
		planets.remove("venus"); //method remove() untuk mengeluarkan objek dari Set
		
		System.out.println("Set planets akhir: (Size = "+planets.size()+")");
		for(Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
			//looping menggunakan Iterator
			System.out.println("\t"+ iterator.next());
		}
	}

}
