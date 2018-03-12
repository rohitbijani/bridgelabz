

public class SumOfTwoDice {
 
	public static void main(String[] args) {
	
	Random rn = new Random();
	int a=rn.nextInt(6)+1;
	int b=rn.nextInt(6)+1;
	System.out.println(a+" and "+b);
	System.out.println(a+b);
}
}

