import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GasMillageTest{

	@Test
	public void testCanCalculateMillagePerGallon(){
		//given
		GasMillage millage = new GasMillage();
		//when
		double numberOfMilesDriven = 30.00;
		double numberOfGallon = 20;
		double milePerGallon = millage.computeMilePerGallon(numberOfMilesDriven , numberOfGallon );
		//assert
		assertEquals(1.5, milePerGallon);
	}

}