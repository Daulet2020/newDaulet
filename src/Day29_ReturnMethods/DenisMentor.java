package Day29_ReturnMethods;

public class DenisMentor {
	
	public static void main(String[] args) {
		a(10, 50);
		b(40, 70);
		int c = b(10, 30);
		System.out.println(c);
		
		
		
	}

	public static void a(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int b (int a, int b) {
		return a+b;
	}
}
