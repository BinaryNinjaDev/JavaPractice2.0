import java.util.*;

class SwapNumber2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}