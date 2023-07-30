import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter second no");
		int b = sc.nextInt();
		System.out.println("select symbol(+,-,*,/)");
		String sym = sc.next();
		int res;
		
		switch(sym)
		{
			case "+": res=a+b;
			          System.out.println("add is :" + res);
					  break;
			case "-": res=a-b;
			          System.out.println("sub is :" + res);
					  break;
			case "*": res=a*b;
			          System.out.println("multi is :" + res);
					  break;
			case "/": res=a/b;
			          System.out.println("div is :" + res);
					  break;
			default : System.out.println("invalid symbol");
					  break;
		}
	}
}