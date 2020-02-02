
public class Decrypter {
	public int decrypt(int code){
		int res, temp, digitOne, digitTwo, digitThree, digitFour;
		//Separate our digits using mod.
		temp = data%1000;
		digitOne = (data-(temp))/1000;
		digitTwo = (temp-(temp%100))/100;
		temp = temp%100;
		digitThree = (temp-(temp%10))/10;
		digitFour = temp%10;
		
		//Work backwards to decrypt our code
		//Swap digit one with three and two with four
		temp = digitOne;
		digitOne = digitThree;
		digitThree = temp;
		
		temp = digitTwo;
		digitTwo = digitFour;
		digitFour = temp;
		
		//Add 3 and mod by 10 to ensure the digits are in the ones place
		digitOne = (digitOne+3)%10;
		digitTwo = (digitTwo+3)%10;
		digitThree = (digitThree+3)%10;
		digitFour = (digitFour+3)%10;
		
		//Re-form the four digit number
		res = (digitOne*1000)+(digitTwo*100)+(digitThree*10)+digitFour;
		return res;
	}
}
