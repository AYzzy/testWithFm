public class Reverse{

	public int reverseNumber(int number){

	int digit = number /10000;
	int digit1 = (number /1000)%10;
	int digit2=(number / 100)%10;
	int digit3 = (number / 10)%10;
	int digit4 =number%10;

	return (digit,digit1,digit2,digit3,digit4);

	}

}