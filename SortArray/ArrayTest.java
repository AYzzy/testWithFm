import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest{

	@Test
	public void testToSquareAndSortArray(){

		SquareSortArray array = new SquareSortArray();

		int[] numbers = array.arrayNumbers({4,2,5,3,8,5});

		assert.Equals({4,9,16,25,64}, numbers);


	}

}