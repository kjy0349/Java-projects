import java.util.Scanner;
public class Assi3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="";
		int price = 0,result=0;
		String coffeename[]= {"����������","īǪġ��","ī���","�Ƹ޸�ī��"};
		int coffeeprice[]= {2000,3500,3500,2500};
		int count[] = new int[4];//0�� ���������� 1�� īǪġ�� 2�� ī��� 3�� �Ƹ޸�ī��
		for(int i=0;i<5;i++) {
			System.out.print("������ �帱���? ");
				name = scan.nextLine();
			switch(name){
				case "����������":
					count[0]++;
					price = coffeeprice[0];
					break;
				case "īǪġ��":
					count[1]++;
					price = coffeeprice[1];
					break;
				case "ī���":
					count[2]++;
					price = coffeeprice[2];
					break;
				case "�Ƹ޸�ī��":
					count[3]++;
					price = coffeeprice[3];
					break;
			}
			result+=price;		
		} // �迭�� 3���� �Ἥ ������ �޴������� ���� �̸� �־���
		System.out.println("<��꼭>");
		System.out.println("ǰ��\t�ܰ�\t����\t�ݾ�");
			for(int i=0;i<4;i++) {
				if(count[i]!=0) {
					System.out.println(coffeename[i]+"\t"+coffeeprice[i]+"\t"+count[i]+"\t"+coffeeprice[i]*count[i]);
				}
			}
		System.out.println("�հ�\t\t\t"+result);
	}
}
