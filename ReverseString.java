import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for reverse");
		String s = sc.next();
		String s1 = new String(s);
		for(int i = s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i)+ " ");
		}
	}
}