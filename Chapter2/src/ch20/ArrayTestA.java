package ch20;

public class ArrayTestA {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
				
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}
}
