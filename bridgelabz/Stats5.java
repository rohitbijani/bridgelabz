public class Stats5 {
 
	public static void main(String[] args) {
	
	Random rn = new Random();
	double arr[]=new double[5];	
	for(int i=0;i<5;i++)
	{
	double a=rn.nextDouble();
	arr[i]=a;	
	}
	
double max=arr[0]; double min=arr[0]; double sum=0;
	for(int i=0;i<5;i++)
	{
	System.out.println(arr[i]);
	sum+=arr[i];
	max=Math.max(max,arr[i]);
	min=Math.min(min,arr[i]);
	}

System.out.println(sum/5);
System.out.println("Max is "+max);
System.out.println("Min is "+min);
}
}

