
public class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip,int size,int color) {super(size,color); this.ip = ip;}
	public void printProperty() {System.out.println("���� IPTV�� "+ip+" �ּ��� "+getSize()+"��ġ "+getColor()+" �÷�");}
	
}
