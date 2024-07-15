import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MaxMinTest{

	@Test
	public void testForMax(){
		MaxMin max = new MaxMin();
		int total = max.maxminNumber(2,4,6,8,6,7,9,1);
		assertEquals(9, total);
	}


}