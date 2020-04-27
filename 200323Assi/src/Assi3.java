import java.util.Scanner;
public class Assi3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하시오(단위 원):");
		double won = scan.nextDouble();
		System.out.print((int)won+"원은 "+won/1280.00+"달러");
		scan.close();
	}
}
