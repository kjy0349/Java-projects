import java.util.Scanner;
public class Assi3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��Ͻÿ�(���� ��):");
		double won = scan.nextDouble();
		System.out.print((int)won+"���� "+won/1280.00+"�޷�");
		scan.close();
	}
}
