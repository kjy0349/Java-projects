import java.util.Scanner;
import java.util.InputMismatchException; // �� ���� ���ܿ� ���Ͽ� �˻��غ����
public class Assi2 {			//�߸��� Ÿ���� ��ǲ�� ����ó�� �� �� �ִ� Ŭ������ �����ؼ�
							//�ش� �������� ����ó�� �غ��ҽ��ϴ�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		do{
			try {
			input = scan.nextInt();
			}
			catch(InputMismatchException ime){
				System.out.println("�߸��� �Է��Դϴ�.");
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
				System.out.print("0~127������ �Է����ּ���");
				break;
			}
		}while(input!=0);
		
	}
}
