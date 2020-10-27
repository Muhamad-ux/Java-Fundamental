package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

	public static void main(String[] args) {
		//deklarasi Array
		String[] heroes = new String[2];
		heroes[0] = "Tony stark";
		heroes[1] = "Peter parker";
		//heroes[2] = "Zeus"; //error ArrayIndexOutOfBoundsException karena ukuran Array tetap
		
		//menggunakan ArrayList
		List<String> planets = new ArrayList<>();
		planets.add("merkurius"); //method add adalah untuk menambah objek ke List
		planets.add("venus");
		planets.add("earth");
		planets.add("mars"); //objek lainya masih bisa terus ditambahkan ke List
		
		System.out.println("List planet awal:");
		for(int i=0; i<planets.size(); i++) { //method size() untuk mendapatkan ukuran List
			//method get() untuk melihat isi List pada index i
			System.out.println("\t index-"+ i +" = "+ planets.get(i));
			
		}
		
		planets.remove("venus"); //method remove() untuk mengeluarkan objek dari LIst
		
		System.out.println("List planets akhir:");
		for(int i=0; i<planets.size(); i++) {
			System.out.println("\t index-"+i+"="+planets.get(i));
		}
	}

}
