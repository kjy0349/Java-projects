public class Assi1 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				if(j==9) {
					System.out.print(j+"*"+i+"="+i*j+"\n");
				}
				else {
					System.out.print(j+"*"+i+"="+i*j+","+"\t");
				}
			}
		}
	}
}
