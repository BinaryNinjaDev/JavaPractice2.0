import java.util.*;
class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for table");
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num*i);
		}
	}
}