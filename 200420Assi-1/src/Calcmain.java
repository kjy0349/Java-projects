import java.util.Scanner;
public class Calcmain {
	public static void  main(String[] args) {
		int a;
		int b;
		String c;
		Scanner scan= new Scanner(System.in);
		do {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.next();
		switch(c) {
		case "+":
			Add ad = new Add();
			ad.setValue(a, b);
			int result= ad.calculate();
			System.out.println(result);
			break;
		case "-":
			Sub sb = new Sub();
			sb.setValue(a, b);
			System.out.println(sb.calculate());
			break;
		case "*":
			Mul ml = new Mul();
			ml.setValue(a, b);
			System.out.println(ml.calculate());
			break;
		case "/":
			Div di = new Div();
			di.setValue(a, b);
			System.out.println(di.calculate());
			break;
		}
		}while(!(c.equals("@")));
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
}
