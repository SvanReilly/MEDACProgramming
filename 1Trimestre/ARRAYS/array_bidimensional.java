package ARRAYS;

public class array_bidimensional {
	public static void main(String[] args) {

		int[][] arrayhard = { { 1, 2 }, { 3, 4 }, {6,7}};
		int[][] arraymulti = new int[5][6];

		for (int i = 0; i < arrayhard.length; i++) {
			for (int j = 0; j < arrayhard[i].length; j++) {
				arrayhard[i][j] = i + j;

			}
		}
		for (int i = 0; i < arrayhard.length; i++) {
			for (int j = 0; j < arrayhard[i].length; j++) {
				System.out.println(arrayhard[i][j]);

			}
			System.out.println();
		}

	}

}
