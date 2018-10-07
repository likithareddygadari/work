package branching1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	int i,a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	i = sc.nextInt();
	System.out.println("Enter the first number");
	a = sc.nextInt();
	System.out.println("Enter the second number");
	b = sc.nextInt();
	
	double result=0;
	
	switch(i)
	{
	case 1:
	result=a+b;
	break;
	case 2:
	result=a-b;
	break;
	case 3:
	result=a*b;
	break;
	case 4:
		if(b==0)
		{
		System.out.println("Division not possible");
		break;
		}
		else 
	      result=a/b;
	default:
		System.out.println("Wrong choice");
	}
	System.out.println("Result = "+result);
}
}
	