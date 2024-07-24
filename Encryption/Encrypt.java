public class Encrypt{

	public String numbers(String number){
	
	int numbers= Integer.valueOf(number);
		if(numbers>1000 && numbers<10000){
			int digit1 = numbers/1000;
			int digit2 = (numbers/100)%10;
			int digit3 = (numbers/10)%10;
			int digit4 = numbers%10;

			int encrypt1 = (digit1 + 7)%10;
			int encrypt2 = (digit2 + 7)%10;
			int encrypt3 = (digit3 + 7)%10;
			int encrypt4 = (digit4 + 7)%10;

			String newEncrypt1= String.valueOf(encrypt3);
			String newEncrypt2 = String.valueOf(encrypt4);
			String newEncrypt3 = String.valueOf(encrypt1);
			String newEncrypt4 = String.valueOf(encrypt2);
	
			String numbers1 = String.valueOf( newEncrypt1 + newEncrypt2 + newEncrypt3 + newEncrypt4);
			return numbers1;
		}
		return "invalue input";
	}

}