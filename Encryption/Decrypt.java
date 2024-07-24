public class Decrypt{

	public String num(String number){
	
	int numbers= Integer.valueOf(number);
	
		int digit1 = numbers/1000;
		int digit2 = (numbers/100)%10;
		int digit3 = (numbers/10)%10;
		int digit4 = numbers%10;

		int decrypt1 = (digit1+3)%10;
		int decrypt2 = (digit2+3)%10;
		int decrypt3 = (digit3+3)%10;
		int decrypt4 = (digit4+3)%10;

		String newDecrypt1= String.valueOf(decrypt3);
		String newDecrypt2= String.valueOf(decrypt4);
		String newDecrypt3= String.valueOf(decrypt1);
		String newDecrypt4= String.valueOf(decrypt2);

		String numbers1 = String.valueOf( newDecrypt1 + newDecrypt2 + newDecrypt3 + newDecrypt4);
		return numbers1;

	}


}