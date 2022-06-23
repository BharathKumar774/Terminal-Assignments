
public class Averageofelements {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,51};
		int sum=0;
		for (int i=0;i<=5-1;i++)
		{
			sum =sum+a[i];
		}
		System.out.println("Sum of array elements= 10+20+30+40+51="+sum);
		double average=(double)sum/5;
		System.out.print("the average of numbers = 151/5="+average);
	}
}