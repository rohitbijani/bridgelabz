import java.util.*;
public class Quadratic {
 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	double delta=(b*b)-(4*a*c);
	double rt=Math.sqrt(delta);
	double r1=(-b+rt)/(a*2);
	double r2=(-b-rt)/(a*2);
	System.out.println("roots are "+r1+" and "+r2);
}
}	
	
