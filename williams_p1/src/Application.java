import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Read a four-digit integer
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a 4 digit number: ");
		int data = stdin.nextInt();
	
		// Add 7 to the digit and get the remaining after a divide by 10
		// Swap the first digit with the third, swap the second with the fourth 
		int encryption = Encrypter.encrypt(data);
		
		// Print the encrypted integer
		System.out.printf("\nThe Encrypted Integer is: %d", encryption);
		
		// Decrypt the integer using a reverse encryption scheme.
		int decryption = Decrypter.decrypt(encryption);
		
		// Print the original number.
		System.out.printf("\nThe Decrypted Integer is: %d", decryption);
	}
}
