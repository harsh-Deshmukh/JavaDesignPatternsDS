package com.harsh.dataStructure.multiArray;

import java.util.List;

public class ArrayLeftRotation {
	/*
	 * Complete the 'rotateLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
	 */

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		// Write your code here

		int time = 1;
		for (int j = 0; j < arr.size(); j++) {

			if (time <= d) {
				for (int k = 0; k < arr.size(); k++) {
					int temp = arr.get(k);
					int t=arr.get(arr.size()-1);
//					if (k == 0) {
						arr.set(arr.size() - k, temp);
						arr.set(k, t);
						
//					}else {
//						arr.set(arr.size() - k, temp);
//					}

					System.out.println(temp + " " + t);
					time++;
				}
			} else {
				break;

			}

			//

		}

		return arr;
	}

}
