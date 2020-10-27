package Protected2;

import Protected.KelasA;

//kelas ini merupakan turunan dari KelasA pada protected package
public class KelasB extends KelasA{
	
	@Override
	protected void methodC() {
		super.methodC();
		
		System.out.println("contoh pemanggilan protected dari package luar");
	}

}
