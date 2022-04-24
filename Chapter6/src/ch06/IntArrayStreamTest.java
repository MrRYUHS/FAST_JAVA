package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int num :arr) {
			System.out.println(num);
		}
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}