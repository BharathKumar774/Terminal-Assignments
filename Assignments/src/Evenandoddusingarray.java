
public class Evenandoddusingarray {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};
		System.out.println("Even numbers");
		for(int i=0;i<6;i++) //6
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Odd numbers");
		for(int i=0;i<6;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}

	}

}
