package day07_ControlFlowStatements;

public class LonaApplication {
	public static void main (String [] args) {
		
		int salary = 15000;
		int jobHistory = 1 ;
		int creditScore = 680 ;
		
		if (salary >= 25000) {
			if (jobHistory >= 2) {
				if (creditScore >= 680) {
					System.out.println("You are qualify for this loan!");
				}else {
					System.out.println("You must have at least 680 credit score!");
				}
			
			}else {
				System.out.println("You must be on the job at least for 2 tears!");
			}
			
		}else {
			System.out.println("You must have minumum of $25000 salary frist");
		
		
		}
		
		
	}

}
