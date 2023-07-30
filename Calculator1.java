import java.util.*;
class Calculator1
{
	public static void main(String args[])
	{
		String yn;
		do
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
		System.out.println("Do you want to continoue(Press y for Yes and n for No)");
		yn = sc.next();
		}while(yn.equals("y") || yn.equals("Y"));
	}
}