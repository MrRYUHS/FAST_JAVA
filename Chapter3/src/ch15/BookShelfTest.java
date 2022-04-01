package ch15;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("여우1");
		bookQueue.enQueue("늑대2");
		bookQueue.enQueue("곰3");
		bookQueue.enQueue("사자4");
		bookQueue.enQueue("호랑이5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}