package zazzo;
import java.util.Scanner;
public class java1 {
	public static void main(String[] args)
	{
		int i,j,c;
		char a[]=new char[20];
		Scanner sc= new Scanner(System.in);
		a=sc.next().toCharArray();
		c=a.length;
		for(i=0;i<c;i++)
		{
			if('a'<=a[i] && 'z'>=a[i])
			{
				a[i] -=32;
			}
			System.out.print(a[i]);
		}
		

	}

}
