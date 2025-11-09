// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double futureValue = principal * Math.pow(1 + rate / 100.0, years);
		System.out.println("Future value after " + years + " years is: " + futureValue); 

	}
	
}