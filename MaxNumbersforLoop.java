public class MaxNumbersforLoop{
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
				int ArrayLength = m.length;
				int newMax=m[0]; /*这一个为什么写进for loop 里面的第一行就会影响大line16的返回值呢？
				是因为被定死之后就不能进一步改变值了吗？
				*/
		for(int count=0 ; count < ArrayLength - 1 ; count = count + 1){
			
			if (newMax >= m[count + 1]){
				
			}
			else{
				newMax = m[count + 1];
			}
			
		}
        return newMax;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
	   System.out.println(max(numbers));
    }
}