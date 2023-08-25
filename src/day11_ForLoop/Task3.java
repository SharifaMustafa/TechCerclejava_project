package day11_ForLoop;

public class Task3 {

	public static void main(String[] args) {
// 3 tin jalinip mangan hesaplash usoli 3, 6, 9, 12;
//		for (int i=1; i < 101; i++  ) {
//			if (i % 3 ==0) {
//				System.out.println(i);
		
//	}}
	// 5 tin jalinip mangan hesaplash usoli.5, 10, 15, 20;
//		
//		for (int i=1; i<101; i++) {
//			if (i % 5 ==0) {
//				System.out.println(i);
//			}
//		}
		
//		3 yaki 5 = 15 tin jalinip mangan hesaplash usoli;
		
		for (int i=1; i<101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
