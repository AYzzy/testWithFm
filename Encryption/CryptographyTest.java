import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest{

	@Test
	public void testToEncrypt(){
	
		Cryptography encrypt = new Cryptography();
		
		int numberEncrypt = encrypt.encryption(5678);

		assertEquals(4523,numberEncrypt);

	}
	@Test
	public void testToDecrypt(){

		Decryption decrypt = new Decryption();
		
		int numberDecrypt = decrypt.decryptNumber(4523);

		assertEquals(5678,numberDecrypt);

	}
	@Test
	public void testToEncrypt2(){
		Encrypt encrypt = new Encrypt();

		String num = encrypt.numbers("5678");

		assertEquals("4523", num);


	}
	@Test
	public void testToDecrypt2(){

		Decrypt decrypt = new Decrypt();
		
		String numberDecrypt = decrypt.num("4523");

		assertEquals("5678",numberDecrypt);

	}


}