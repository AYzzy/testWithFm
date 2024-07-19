public class TaxCalculator{

	public static double calculateTax( double earning){
		double tax = 0.0;
		//if(earning >= 0) throw new RuntimeException("invalid amount input");
		if(earning <= 30_000){  tax = 0.15 * earning ;}
		else{ tax = 0.2 * earning;}
		return tax;
	}


}