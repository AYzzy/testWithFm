import java.util.Arrays;
public class ArrayPractice{

	public static void main(String [] args){

	int [] numbers = {10, 20, 30, 40, 50}; //Stactic initialization method
	int [] scores = new int [5] ; // using the array constructor

	System.out.println("numbers = " +Arrays.toString(numbers));
	System.out.println("scores = " + Arrays.toString(scores));

	for(int index = 0;index< numbers.length; index++){
		System.out.println("index:"+ index+"  number: "+numbers[index]);
	}



	}


}