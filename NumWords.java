// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);

		String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] tensNames = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		int hundredsDigit = num / 100;
		int tens = (num / 10) % 10;
		int ones = num % 10;

		if (hundredsDigit > 0) {
			System.out.print(units[hundredsDigit] + " hundred");
			if (tens > 0 || ones > 0) System.out.print(" "); 
		}

		if (tens == 1) {
			System.out.print(teens[ones]);
		}
		else {
		    if (tens > 1) {	
			   System.out.print(tensNames[tens]);
			   if (ones > 0) System.out.print(" ");
		}	

		if (tens != 1 && ones > 0) {
			System.out.print(units[ones]);

		}
	}

	System.out.println();

	}
}