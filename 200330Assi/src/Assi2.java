import java.util.Scanner;
import java.util.InputMismatchException; // 더 많은 예외에 대하여 검색해본결과
public class Assi2 {			//잘못된 타입의 인풋도 예외처리 할 수 있는 클래스가 존재해서
							//해당 내용으로 예외처리 해보았습니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		do{
			try {
			input = scan.nextInt();
			}
			catch(InputMismatchException ime){
				System.out.println("잘못된 입력입니다.");
			}
			if(input == 0) {
				break;
			}
			if(input >=1 && input <= 127) {
				for(int i=0;i<input;i++) {
					for(int j=0;j<i+1;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i=1;i<input;i++) {
					for(int j=input-i;j>0;j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else {
				System.out.print("0~127까지만 입력해주세요");
				break;
			}
		}while(input!=0);
		
	}
}
