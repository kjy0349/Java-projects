import java.util.Scanner;
public class Fraction {
	int numerator; //���� �ʵ�
	int denominator; //�и� �ʵ�
	public Fraction() {
		numerator = 1;
		denominator = 1;	
	} //�߰� } // ���ڿ� �и� 1�� �����ϴ� ������
	public Fraction(int d) {
		numerator = 1;
		denominator = d;
	} //�߰� } // ���ڴ� 1�� ����, �и�� d�� �����ϴ� ������
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	} //�߰� } //���ڴ� n, �и�� d�� �����ϴ� ������
	// �޼ҵ� �߰�
	public Fraction addFraction(Fraction a, Fraction b){
		numerator = (a.numerator * b.denominator) + (a.denominator * b.numerator);
		denominator = a.denominator * b.denominator;
		return this;
	}
	public Fraction subFraction(Fraction a, Fraction b) {
		numerator =(a.numerator * b.denominator) - (a.denominator * b.numerator);
		denominator = a.denominator * b.denominator;
		return this;
	}
	public Fraction mulFraction(Fraction a, Fraction b) {
		numerator = a.numerator * b.numerator;
		denominator = a.denominator * b.denominator;
		return this;
	}
	public Fraction divFraction(Fraction a, Fraction b) {
		numerator = a.numerator * b.denominator;
		denominator = a.denominator * b.numerator;
		return this;
	}
	public String printFraction() {
		return numerator + "/" + denominator;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("�м�1(���� �и�) �Է�: ");
		a = scan.nextInt();
		b= scan.nextInt();
		System.out.print("�м�2(���� �и�) �Է�: ");
		c = scan.nextInt();
		d = scan.nextInt();
		Fraction A = new Fraction(a,b);
		Fraction B = new Fraction(c,d);
		Fraction result = new Fraction();
		System.out.println(A.printFraction()+"+"+B.printFraction() +"=" + result.addFraction(A, B).printFraction());
		System.out.println(A.printFraction()+"-"+B.printFraction() +"=" + result.subFraction(A, B).printFraction());
		System.out.println(A.printFraction()+"x"+B.printFraction() +"=" + result.mulFraction(A, B).printFraction());
		System.out.println(A.printFraction()+"/"+B.printFraction() +"=" + result.divFraction(A, B).printFraction());
		scan.close();
	}
}