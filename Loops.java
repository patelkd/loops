public class Loops {
	public static void main(String[] args) {



		// String s = "My String";
		// int length = findLength(s);
		// System.out.println(length);


		// int x = 1; //start	
		// while (x <=100) {
		// 	System.out.println(x);
		// 	x++; 
		// }

		// for (int i=1; i <= 100; i++) {
		// 	System.out.println(i);
		// }

		// int i=45;

		// while (i>=20) {
		// 	System.out.println(i);
		// 	i=i-5;
		// }


		// for (int i=24; i<=68; i+=2) {
		// 	System.out.println(i);
			
		// }

	}


	// public static int findLength(String str) {
	// 	int l =0;
	// 	for (int i=0; i<str.length(); i++) {
	// 		len++;
	// 	}

	// 	return len;
	// }
	// 
	
	public static double DrugPotency(String str) {
		double i=100.0;
		double m=0;

		while (i>=50.0) {
			System.out.println("Month:" + m);
			System.out.println("Effectiveness:" + i);

			i=i-(i*.04);
			m++;
		}
	}
	
}