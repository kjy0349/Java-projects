
public class PenMain {
	public static void main(String[] args) {
		SharpPencil sp = new SharpPencil();
		BallPen bp = new BallPen();
		FountainPen fp = new FountainPen();
		sp.setAmount(3);//샤프의 양 3
		bp.setAmount(5);//볼펜의 양 5
		bp.setColor("BLACK");//볼펜의 색 검정
		fp.setAmount(7);//만년필의 양 7
		fp.setColor("YELLOW"); // 만년필의 색 노랑
		fp.refill(10);//만년필의 용량 10으로 리필
		System.out.println("샤프펜슬의 남은 양은 "+sp.getAmount()+"입니다.");
		System.out.println("볼펜의 남은 양은 "+bp.getAmount()+"이고, 색깔은 "+bp.getColor()+"입니다." );
		System.out.println("만년필의 남은 양은"+fp.getAmount()+"이고, 색깔은 "+fp.getColor()+"입니다.");
	}
}
