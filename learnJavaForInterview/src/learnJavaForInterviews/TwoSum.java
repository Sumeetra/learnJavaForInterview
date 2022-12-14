package learnJavaForInterviews;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	// Given an array of integers, return indices of the two numbers such that they
	// add up to a specific target.
	// you may assume that each input would have exactly one solution,
	// and you may not use the same element twice
	// Given nums = [2,7,11,15], target = 9,
	// because nums[0] + nums[1] = 2+7=9,
	// return[0,1]

	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 3, 7, 4, 8 };
		int target = 7;
		int[] result = getTwosum(numbers, target);
		System.out.print(result[0] + " " + result[1]);
	}

	public static int[] getTwosum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int delta = target - numbers[i];
			if (visitedNumbers.containsKey(delta)) {
				return new int[] { i, visitedNumbers.get(delta) };
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int[] { -1, -1 };
	}
}
