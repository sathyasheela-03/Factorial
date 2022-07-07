package factorialnumber;

public class FactorialOfNumber {
	static int unit=6;
	static int fact=1;
//	FactorialOfNumber(int number, int number1) { //parameterized constructor
//		unit=number;
//		fact=number1;
//	}
	static void get_fact() {
		int i=1;
		while(i<=unit) {
			fact=fact*i; //factorial of 6 number 
			i++;
		}
		 
		System.out.println("Factorial Number is: "  +fact);
		
		
	}  
	public static void main(String[] args) {
		
//		FactorialOfNumber fn=new FactorialOfNumber(6,1);
//		fn.get_fact();
		FactorialOfNumber.get_fact();
		//get_fact(fact, fact);
		
	}
}