import java.util.Scanner;
public class Assi3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="";
		int price = 0,result=0;
		String coffeename[]= {"에스프레소","카푸치노","카페라떼","아메리카노"};
		int coffeeprice[]= {2000,3500,3500,2500};
		int count[] = new int[4];//0번 에스프레소 1번 카푸치노 2번 카페라떼 3번 아메리카노
		for(int i=0;i<5;i++) {
			System.out.print("무엇을 드릴까요? ");
				name = scan.nextLine();
			switch(name){
				case "에스프레소":
					count[0]++;
					price = coffeeprice[0];
					break;
				case "카푸치노":
					count[1]++;
					price = coffeeprice[1];
					break;
				case "카페라떼":
					count[2]++;
					price = coffeeprice[2];
					break;
				case "아메리카노":
					count[3]++;
					price = coffeeprice[3];
					break;
			}
			result+=price;		
		} // 배열을 3개를 써서 각각의 메뉴에대한 값을 미리 넣어줌
		System.out.println("<계산서>");
		System.out.println("품명\t단가\t수량\t금액");
			for(int i=0;i<4;i++) {
				if(count[i]!=0) {
					System.out.println(coffeename[i]+"\t"+coffeeprice[i]+"\t"+count[i]+"\t"+coffeeprice[i]*count[i]);
				}
			}
		System.out.println("합계\t\t\t"+result);
	}
}
