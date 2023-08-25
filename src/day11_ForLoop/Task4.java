package day11_ForLoop;

public class Task4 {

	public static void main(String[] args) {
      // 20 ~ 30
	  // for loop
//		for (int i=20; i<=30; i++) {
//			System.out.print(i + ", ");
//			
			
	  //do while loop		
			
			int sum = 0;
			for (int i=1; i<= 100; i++) {
				if (i%2 ==1) {
					sum +=i;
				}
				System.out.println(sum);
			}
			
			for (int i=1; i <= 100; i++) {
				if (i%2==1) {
					if (i !=99) {
						System.out.print(i+ " + ");
					}else {
						System.out.print(i + " = " + sum);
					}
				}
			}
		}
	}

