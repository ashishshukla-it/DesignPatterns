
public class DesignPattern {
	// Factory design pattern
	public static void main(String args[]) {
		OsObjectFactory oof = new OsObjectFactory();
		OS os = oof.returnOS("ios");
		os.specification();
	}
}
