package DateTime;

import java.util.Calendar;

public class ExampleSplitCalender {

	public static void main(String[] args) {
		//menampilkan waktu sekarang
		Calendar calender = Calendar.getInstance();
		System.out.println("waktu sekarang adalah "+calender.getTime());
		
		//menampilkan spesifik waktu yang diinginkan 
		System.out.println("tanggal : "+calender.get(Calendar.DATE));
		System.out.println("bulan : "+calender.get(Calendar.MONTH));
		System.out.println("tahun : "+calender.get(Calendar.YEAR));

	}

}
