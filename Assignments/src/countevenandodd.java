
public class countevenandodd {

	public static void main(String[] args) {
		int a[]={11,12,13,14,15};
		int b=0;
		int c=0;
		System.out.println("Even count");
		for(int i=0;i<5;i++) 
		{
			if(a[i]%2==0)
			{
				b++;
			}
		}
				System.out.println(b);
		System.out.println("Odd count");
		for(int i=0;i<5;i++)
		{
			if(a[i]%2!=0)
			{
				c++;
			}
			}
				System.out.println(c);

	}

}
