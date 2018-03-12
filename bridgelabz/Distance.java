import java.util.*;

public class Distance {
 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	double x=sc.nextInt();
	double y=sc.nextInt();
	double dist = Math.pow((x*x+y*y),.5);
	System.out.println(dist);
	

}
}
