import java.util.Scanner;
public class Assi4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,result = 0;
		String opr;
		while(true) {
			num1=scan.nextInt();
			opr=scan.next();
			num2=scan.nextInt();
			switch(opr) {
			case "+": result = num1+num2;break;
			case "-": result = num1-num2;break;
			case "*": result = num1*num2;break;
			case "/": result = num1/num2;break;
			case "%": result = num1%num2;break;
			default:break;
			}
			if(opr.equals("=")) {
				break;
			}
			else {
				System.out.println("°á°ú: "+result);
			}
		}
		scan.close();
	}

}
