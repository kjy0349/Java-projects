
public class PenMain {
	public static void main(String[] args) {
		SharpPencil sp = new SharpPencil();
		BallPen bp = new BallPen();
		FountainPen fp = new FountainPen();
		sp.setAmount(3);//������ �� 3
		bp.setAmount(5);//������ �� 5
		bp.setColor("BLACK");//������ �� ����
		fp.setAmount(7);//�������� �� 7
		fp.setColor("YELLOW"); // �������� �� ���
		fp.refill(10);//�������� �뷮 10���� ����
		System.out.println("�����潽�� ���� ���� "+sp.getAmount()+"�Դϴ�.");
		System.out.println("������ ���� ���� "+bp.getAmount()+"�̰�, ������ "+bp.getColor()+"�Դϴ�." );
		System.out.println("�������� ���� ����"+fp.getAmount()+"�̰�, ������ "+fp.getColor()+"�Դϴ�.");
	}
}
