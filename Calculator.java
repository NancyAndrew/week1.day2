package week1.day2;

public class Calculator {

public int add(int num1, int num2, int num3) {
		
		int sum = num1+num2+num3;
		return sum;
		
	}
	
	public int sub (int num1, int num2) {
		
		int subtraction = num1-num2;
		return subtraction;
		
	}
	
	public double mul (int num1, int num2) {
		double product = num1*num2;
		return product;
		
	}
	
	public float divide (float num1, float num2) {
		float division = num1 / num2;
		return division;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Calculator cal = new Calculator();
			System.out.println("Addition of 3 Numbers" +cal.add(10, 20, 30));
			System.out.println("Subtraction of 2Numbers" +cal.sub(10, 20));
			System.out.println("Multiplication of 2Numbers" +cal.mul(15, 4));
			System.out.println("Division of 2 Numbers" +cal.divide(60, 2));

}
}
