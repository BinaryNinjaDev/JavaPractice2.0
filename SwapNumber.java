import java.util.*;

class SwapNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t;
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}