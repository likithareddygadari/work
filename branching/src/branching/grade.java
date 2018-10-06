package branching;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		int avg;
		System.out.println("Enter the average");
		Scanner sc = new Scanner(System.in);
		avg= sc.nextInt();
		if(avg<50)
		{
		System.out.println("F grade");
	    }
		else if(avg<60)
		{
		System.out.println("A grade");
		}
		else if(avg<70)
		{
			System.out.println("B grade");
		}
		else if(avg<80)
		{
			System.out.println("C grade");
		}
		else if(avg<90)
		{
			System.out.println("D grade");
		}
		else if(avg<100)
		{
			System.out.println("E grade");
		}
		else if(avg>=100)
		{
			System.out.println("O grade");
		}

	}

}
