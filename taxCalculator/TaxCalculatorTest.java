import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxCalculatorTest{

	@Test
	public void testCalculatorTax(){
		TaxCalculator calculator = new TaxCalculator();
		double tax = calculator.calculateTax(30000 );
		assertEquals(4500,tax);
	}

	@Test
	public void testCalculatorTaxOnNegative(){
		TaxCalculator calculator = new TaxCalculator();
		assertThrows(RuntimeException.class, ()-> calculator.calculateTax(-30000) );
	}

}