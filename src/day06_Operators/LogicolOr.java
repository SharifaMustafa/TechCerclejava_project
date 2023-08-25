package day06_Operators;

public class LogicolOr {
	
	public static void main (String []args) {
		// Logical OR  ||
		
		//ConditionA  ConditionB  Result
		
		//true         false      true
		//false        true       true
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		boolean result = a > b || a + b == c;
		System.out.println(result);
		
		result = a * b <= c || c < a || c < b;
		System.out.println(result);
		
		boolean conditionA = false;
		boolean conditionB = false;
		boolean conditionC = false;
		boolean conditionD = true;
		boolean conditionE = a + b + c < b*c;
		
		//result = conditionA || conditionB || conditionC || conditionD || && conditionE;
		
		
		
		
		
	}

}
