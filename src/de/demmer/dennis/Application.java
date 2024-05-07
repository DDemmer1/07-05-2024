package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		
		int[] iArr = new int[20];
		testMethod();
		iArr[5] = 250;
		Item i1 = new Item(123, 9.99, "Mauspad");
		
		System.out.println(iArr[2]);
		
		
		
	}
	
	
	
	static void testMethod() {
		System.out.println("test");
	}

}
