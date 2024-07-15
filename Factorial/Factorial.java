
public class Factorial{

	public int factorialNumber(int num){
		int number=1;
		for(int count = 1; count <=num; count++){
			number*=count;
		}
		if(num ==0)return 1;
		return number;
	}


}