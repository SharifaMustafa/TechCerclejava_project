package day16_4threview;

public class Task14_week3 {

	public static void main(String[] args) {

//		- size of each row, is increment by 2
//	     *  - white space, getting smaller 3 2 1, respectively
//	     *    1
//	     *   222
//	     *  33333
//	     * 4444444
//	     *
//	     */
//
//	    /**
//	     * ---1
//	     * --2(3)
//	     * -3(5)
//	     * 4(7)
//	     */

//	    String name = "Leng";
//	    System.out.println(name.repeat(2));

		String space = " ";
		int size = 9;
		for (int i = 1; i <= size; i++) {
			for (int j = (size - 1) - i; j >= 0; j--) { // run 4 3 2 1 times,
				System.out.print(space);
			}
			for (int j = 1; j <= (i * 2) - 1; j++) { // j = 1,3,5,7
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
