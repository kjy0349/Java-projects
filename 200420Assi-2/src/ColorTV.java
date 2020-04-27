
public class ColorTV extends TV {
	private int color;
	public ColorTV(int color,int size) {super(size);this.color = color;}
	protected int getColor() {return color;}
}
