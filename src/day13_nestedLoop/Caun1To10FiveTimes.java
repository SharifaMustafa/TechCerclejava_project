package day13_nestedLoop;

public class Caun1To10FiveTimes {

	public static void main(String[] args) {

		for (int iteration = 1; iteration < 6; iteration++) { /// outer loop --> one iteration
//          System.out.println(iteration);
//          System.out.println("Hello");
//          
//          if (iteration == 3) {
//              break;
//          }

			for (int i = 1; i < 11; i++) { // 1 ~ 10 // inner loop will run full iteration
				System.out.println(i);
			}

		}

		int rowCount = 6;
		int columnCount = 3;

		// cell(row,column)
		// cell(1,1) , cell(1,2) , cell(1,3)
		// cell(2,1) , cell(2,2) , cell(2,3)
		// cell(6,1) , cell(6,2) , cell(6,3)

		for (int row = 0; row <= rowCount; row++) {
			// System.out.println("Reading row #"+row);
			for (int column = 1; column <= columnCount; column++) {
				// System.out.println("Reading column#"+column);

				System.out.print("Cell(" + row + "," + column + ")  ");

			}
			System.out.println();
		}
	}
}
