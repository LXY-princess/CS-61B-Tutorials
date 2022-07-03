public class MaxNumbers {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
		int ArrayLength = m.length;
		int count=0;
		int newMax=m[count];
		while(count < ArrayLength - 1){
			if (newMax >= m[count + 1]){
				
			}
			else{
				newMax = m[count + 1];
			}
			count = count + 1;
		}
        		/*System.out.println(newMax);should be replaced by returen newMax  and in the mian to print it out*/
				return newMax;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
	   System.out.println(max(numbers));
	   /*max(numbers); here should be Sytem.out.println(Max(numbers));*/
    }
}