
public class OsObjectFactory {
	public OS returnOS(String os) {
		if(os.equals("android")) {
			return new Android();
		}
		else if (os.equals("ios")) {
			return new IOS();
		}
		else if (os.equals("windows")) {
			return new Windows();
		}
		else
			return null;
	}
}
