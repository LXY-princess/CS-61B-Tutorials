public class HelloNumbers {
    public static void main(String[] args) {
	        int x = 0; 
		int sum=0;
        while (x < 10) {
            System.out.print(x+" ");
            sum=sum+x;
			x=x+1;
		        }
		System.out.print(sum+" ");
		/*System.out.printIn(x+"10"); cannot print out because
		x+"10" will be seen as string but x is previously declared
		to be int.If x is not defined then it will print out 1010 which is 10 concatenate 10
		/*System.out.print(x+10); it prints out 20 which is 10+10=20*/
		/*
		x= "horse" ; strins cannot be converted into int
		*/
    }
}