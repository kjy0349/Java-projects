import java.util.Scanner;
public class Assi1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int ten=0,one=0;
		ten = input / 10;
		one = input - (ten*10);
		int count = 0;//ÀÚ¸´¼öº°·Î ÂÉ°³¼­ Ä«¿îÆ®ÇÔ
		if(ten == 3 || ten == 6 || ten == 9) count++;
		if(one == 3 || one == 6 || one == 9) count++;
		switch(count) {
		case 2:
			System.out.print("¹Ú¼öÂ¦Â¦");
			break;
		case 1:
			System.out.print("¹Ú¼öÂ¦");
			break;
		default:
			break;
		}
		scan.close();
	}
}
