package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("혜린♡");
		String android = new String("형수");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));
	}
}