import java.util.Scanner;

public class BMICalculator {
	/*
	public int readUserData(){
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Would you like to calculate BMI using the imperial system or the metric system?\n Enter 1 for Imperial or 2 for Metric: ");
		private int scale = stdin.nextInt();
	
		System.out.print("\nWhat is your weight?: ");
		private int weight = stdin.nextInt();
		
		System.out.print("\nWhat is your height?: ");
		private int height = stdin.nextInt();
		
	}
	
	private readUnitType(){
		
	}
	
	private readMeasurementData(){
		
	}
	
	private readMetricData(){
		
	}
	
	private readImperialData(){
		
	}
	
	private readUnitType(){
		
	}
	
	
	private calculateBmiCategory(){
		
	}
	
	
	public int getWeight(){
		return this.weight;
	}
	
	private void setWeight(){
		this.weight = weight;
		if(this.weight < 0) {
			this.weight = 0;
		}
	}
	
	public int getHeight(){
		return height;
	}
	
	private void setHeight(){
		this.height = height;
		if(this.height < 0) {
			this.height = 0;
		}
	}
	
	public int getBmi{
		return this.bmi;
	}
	
	public String getBmiCategory{
		return BmiCategory;
	}
	*/
	public static String displayBmi(double BMI){
		if (BMI < 18.5) {
			return "You are currently underweight.";
		}
		else if (BMI > 24.9) {
			return "You are currently overweight.";
		}
		else {
			return "Your weight is perfect.";
		}
	}
	
	public static double calculateBmi(int weight, int height, int scale){
		double BMI;
		
		if (scale == 2) {
			BMI = weight/(height*height);
		}
		else {
			BMI = (703 * weight)/(height * height);
		}
		
		return BMI;
	}
	
	public static void main(String[] args) {
		// Read the user's weight and height
		// Provide a choice of formula 1 or formula 2.
		// Calculate the BMI
		// Print the result		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Are you using the imperial system or metric system? Enter 1 for imperial or 2 for metric: ");
		int scale = scanner.nextInt();
		
		System.out.printf("\nWhat is your height?: ");
		int height = scanner.nextInt();
		if (height < 0) {
			System.exit(0); 
		}
		
		System.out.printf("\nWhat is your weight?: ");
		int weight = scanner.nextInt();
		if (weight < 0) {
			System.exit(0);
		}
		
		double BMI = calculateBmi(weight, height, scale);
		System.out.print("Your BMI is: ");
		System.out.println(BMI);
		System.out.println(displayBmi(BMI));
		/*BMICalculator app = new BMICalculator();
	    app.readUserData();
	    double BMI = app.calculateBmi(height, weight, scale);
	    app.displayBmi(BMI);*/
		scanner.close();
	}
}

