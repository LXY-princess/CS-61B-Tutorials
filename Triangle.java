/*public class Triangle{
	public static void main(String[] args){
		String x="*";
		int countnum=0;
		while (countnum<5){
			System.out.println(x);
			countnum = countnum + 1;
			x = x + "*" ;
		}
	}
}
*/
public class DrawTriangle{
	public static void drawTriangle(int N){
		String x="*";
		int countnum=0;
		while (countnum<N){
			System.out.println(x);
			countnum = countnum + 1;
			x = x + "*" ;
		}
	}
	public static void main(String[] args){
		drawTriangle(10);
	}
}