
public class Assi2 {
	public static void main(String[] args) {
		int i=2;
		int j=1;
		while(i<10) {
			while(j<10) {
				if(j==9) {
					System.out.print(i+"*"+j+"="+i*j+"\n");
					j=1;
					break;
				}
				else {
					System.out.print(i+"*"+j+"="+i*j+",\t");
					j++;
				}
			}
			i++;
		}
	}
}
