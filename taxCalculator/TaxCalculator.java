public class TaxCalculator{


	public static double calculateTax( double yearlyEarning){
		if(yearlyEarning <=0) throw new RuntimeException("invalid amount input");
		double tax = 0.15 * yearlyEarning ;
		return tax;
	}


}