
public class Encrypter {
	public int encrypt(int data){
		int res, temp, digitOne, digitTwo, digitThree, digitFour;
		//Separate our digits using mod.
		temp = data%1000;
		digitOne = (data-(temp))/1000;
		digitTwo = (temp-(temp%100))/100;
		temp = temp%100;
		digitThree = (temp-(temp%10))/10;
		digitFour = temp%10;
		
		//Encrypt each digit
		//Step One: Add 7 to digit, mod by 10
		digitOne = (digitOne + 7)%10;
		digitTwo = (digitTwo + 7)%10;
		digitThree = (digitThree + 7)%10;
		digitFour = (digitThree + 7)%10;
		
		//Step Two: Swap digit one with three and two with four
		temp = digitOne;
		digitOne = digitThree;
		digitThree = temp;
		
		temp = digitTwo;
		digitTwo = digitFour;
		digitFour = temp;
		
		//Re-form the four digit number
		res = (digitOne*1000)+(digitTwo*100)+(digitThree*10)+digitFour;
		return res;
	}
}
