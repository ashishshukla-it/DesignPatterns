import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public final class Singleton {
	public static int count = 0;
	private Singleton() {
		count ++;
		System.out.println(count);
	}
	
	static Singleton instance = null;
	
	public static Singleton getInstance() {
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
}

