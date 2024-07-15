import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest{

	@Test
	public void testForFactorial(){
		Factorial fact = new Factorial();
		int number =5;
		int total = fact.factorialNumber(number);
		assertEquals(120, total);
	}
	@Test
	public void testForFactorial2(){
		Factorial fact = new Factorial();
		int number =0;
		int total = fact.factorialNumber(number);
		assertEquals(1, total);
	}
	
	@Test
	public void testForReverse(){
		Reverse reverse = new Reverse();
		int number =12345;
		int total = reverse.reverseNumber(number);
		assertEquals(54321, total);
	}



}