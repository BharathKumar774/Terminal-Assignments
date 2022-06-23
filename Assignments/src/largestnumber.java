
public class largestnumber {

	public static void main(String[] args) {
	int a[]= {10,5,-15,20,-30};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max) 
		{
			max=a[i];
		}
	}
	System.out.println("Lrgest number=:"+max);

	}

}
