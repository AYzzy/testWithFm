import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReverseTest{
	@Test
	public void testForReverse(){
		Reverse reverse = new Reverse();
		int number =12345;
		int total = reverse.reverseNumber(number);
		assertEquals(54321, total);
	}

}