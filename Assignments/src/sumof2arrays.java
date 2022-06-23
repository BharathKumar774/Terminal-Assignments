
public class sumof2arrays {

	public static void main(String[] args) {
		int sum;
		int a[]= {10,20,30,40,50};
		int b[]= {9,18,27,36,45};
		System.out.print("sum of 2 arrays:");
		for(int i=0;i<a.length;i++)
		{
			sum= a[i] + b[i];
			System.out.print(" "+sum);
		}
	}

}
