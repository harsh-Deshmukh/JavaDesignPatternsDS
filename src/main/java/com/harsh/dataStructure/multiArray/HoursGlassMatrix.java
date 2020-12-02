package com.harsh.dataStructure.multiArray;

public class HoursGlassMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] hrg = { { 1, 2, 3, 4, 8, 3 }, { 0, 1, 0, 4, 6, 9 }, { 7, 8, 9, 7, 2, 9 }, { 5, 4, 3, 0, 1, 2 },
//				{ 7, 5, 2, 8, 5, 4 }, { 4, 9, 3, 0, 1, 5 } };

//		int[][] hrg={{-1 ,-1 ,0 ,-9, -2, -2},
//		{-2 ,-1 ,-6 ,-8 ,-2 ,-5},
//		{-1 ,-1 ,-1 ,-2 ,-3 ,-4},
//		{-1 ,-9 ,-2 ,-4 ,-4 ,-5},
//		{-7 ,-3 ,-3 ,-2 ,-9 ,-9},
//		{-1 ,-3, -1, -2, -4, -5}};

//		int[][] hrg = { { -1, 1, -1, 0, 0, 0 }, { 0, -1, 0, 0, 0, 0 }, { -1, -1, -1, 0, 0, 0 }, { 0, -9, 2, -4, -4, 0 },
//				{ -7, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };

		int[][] hrg = { { -1, -1, 0, -9, -2, -2 }, { -2, -1, -6, -8, -2, -5 }, { -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 }, { -7, -3, -3, -2, -9, -9 }, { -1, -3, -1, -2, -4, -5 } };

		System.out.println(hrg.length + " " + hrg[0].length);

		for (int row = 0; row < hrg.length; row++) {
			System.out.println("");
			for (int col = 0; col < hrg[0].length; col++) {
				System.out.print(hrg[row][col] + " ");

			}
		}
		System.out.println("");
		int max = 0;
		for (int row = 0; row < hrg.length - 2; row++) {
			for (int col = 0; col < hrg[0].length - 2; col++) {
				int sum = hrg[row][col] + hrg[row][col + 1] + hrg[row][col + 2] + hrg[row + 1][col + 1]
						+ hrg[row + 2][col] + hrg[row + 2][col + 1] + hrg[row + 2][col + 2];

				System.out.print(sum + " =" + max + "  ");
				
					if ((row==0 && col==0 ) && max == 0) {
						max = sum;
					}else
					if (sum > max) {
						max = sum;
					}
				
			}
		}
		System.out.println("--->" + max);
	}
}