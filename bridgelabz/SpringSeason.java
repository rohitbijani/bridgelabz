import java.util.*;
public class SpringSeason {
 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	int m=sc.nextInt();
	boolean flag=false;

	if((m>=3&&m<=6)&&(d<=20))
	{
	 flag=true;
	}

	if(flag==true)
	System.out.println("TRUE");
	else
	System.out.println("FALSE");

}
}	

