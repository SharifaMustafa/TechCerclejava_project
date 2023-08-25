package day07_ControlFlowStatements;

public class IFStatement {
	public static void main(String[] args) {

//		syntax:
//			if (conditin ) { true blico
//				
//			}else {
//				false block
//			}

		int num = 5;
		if (num > 3) {
			System.out.println(num + "is greater than 3");
		} else {
			System.out.println(num + "is less then 3");
		}

		long num2 = 57;
		
		System.out.println(num2 % 2);
		
		if (num2 %2 == 0) {
			System.out.println(num2 +" is an even number");
		}else {
			System.out.println(num2 +" is an odd number");
		}
       
		
		
		int count = 27;
		int total = 4;
		if (count < 3) {
			total = 0;
		}else {
			total += count; // total = total + count;
		}
		System.out.println("Value of total is "+ total);
		
		
		int number = 5 ;
		
		if (number  < 0) {
			System.out.println(number + "is a negative");
			
		}else {
			System.out.println((number + "is a positive"));
		}
		
		   
		
		
		
	}

}
