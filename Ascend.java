// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	 int min = 1;
	 int max = 100;
	 int a = (int)(Math.random() * (max - min + 1)) + min;
	 int b = (int)(Math.random() * (max - min + 1)) + min;
	 int c = (int)(Math.random() * (max - min + 1)) + min;

	 if ( a > b ) {
     int temp = a; a = b; b = temp;
	 }

     if ( b > c ) {  
	 int temp = b; b = c; c = temp;
	}	

     if ( a > b ) {
	 int temp = a; a = b; b = temp;
	 }

     System.out.println( a + " " + b + " " + c);

	}
}
	