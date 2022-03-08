package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("혜린");
		String android = new String("형수");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
