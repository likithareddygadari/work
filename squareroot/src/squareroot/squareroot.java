package squareroot;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		double a,b,c,d,i, root1, root2 ;
		Scanner sr = new Scanner(System.in);
		System.out.println("Input a: ");
		a=sr.nextDouble();
		System.out.println("Input b: ");
		b=sr.nextDouble();
		System.out.println("Input c: ");
		c=sr.nextDouble();
		d= (b * b - 4.0 * a * c);
		
		if(d > 0)
		{
			root1 = (-b + Math.sqrt(d) / (2*a));
			root2 = (-b - Math.sqrt(d) / (2*a));
			System.out.println("Two Distinct real roots exits: root1 = " + root1 + " and root2 = " + root2 );
		
		}
		else if(d == 0)
		{
			root1 = root2 = -b / (2 * a);
			System.out.println("Two Equal and real roots exists: root1 = " + root1 + " and root2 = " + root2);
		}
		else if(d < 0)
		{
			root1 = root2 = -b / (2 * a);
			i = Math.sqrt(-d) / (2 * a);
			System.out.println("Two Distinct complex roots exists: root1 = " + root1 + " + " + i + " and root2 = " + root2 +" - "+ i);
					
		}
		
	}

}
