
public class TVmain {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.168.0.1",64,4086);
		iptv.printProperty();
	}
}
