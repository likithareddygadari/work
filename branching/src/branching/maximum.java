package branching;

import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		double a,b,c;
		System.out.println("Enter the three numbers");
		Scanner sc =new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if (a>b && a>c)
		{
		System.out.println("The maximum is a");
		}
		else if (b>c && b>a)
		{
			System.out.println("The maximum is b");
		}
		else if (c>a && c>b)
		{
			System.out.println("The maximum is c");
		}

	}

}
