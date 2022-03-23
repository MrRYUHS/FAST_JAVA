package ch03;

public class TestBloockTest {

	public static void main(String[] args) {

		String testBlocks = """
				Hello,
				hi,
				how r u""";
		System.out.println(testBlocks);
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>				
					<body>
						<span>example test </span>
					</body>
				</html>""";
	}
}