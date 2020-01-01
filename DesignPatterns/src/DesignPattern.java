
public class DesignPattern {
	public static void main(String args[]) {
		Singleton s1 = Singleton.getInstance();
		System.out.println("hello 1");
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("hello 2");
	}
}
