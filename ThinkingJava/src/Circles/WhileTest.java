package Circles;

public class WhileTest {
	static boolean conditions () {
		boolean result = Math.random () < 0.5;
		System.out.print(result + ", ");
		return result;
	}

	public static void main(String[] args) {
		while (conditions())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
	}

}
