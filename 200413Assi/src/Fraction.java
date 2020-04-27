import java.util.Scanner;
public class Fraction {
	int numerator; //분자 필드
	int denominator; //분모 필드
	public Fraction() {
		numerator = 1;
		denominator = 1;	
	} //추가 } // 분자와 분모를 1로 지정하는 생성자
	public Fraction(int d) {
		numerator = 1;
		denominator = d;
	} //추가 } // 분자는 1로 지정, 분모는 d로 지정하는 생성자
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	} //추가 } //분자는 n, 분모는 d로 지정하는 생성자
	// 메소드 추가
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
		System.out.print("분수1(분자 분모) 입력: ");
		a = scan.nextInt();
		b= scan.nextInt();
		System.out.print("분수2(분자 분모) 입력: ");
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