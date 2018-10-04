package triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		double s1,s2,s3,s;
		double a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input s1: ");
		s1 = sc.nextInt();
		System.out.println("Input s2: ");
		s2 = sc.nextInt();
		System.out.println("Input s3: ");
		s3 = sc.nextInt();
		
		s= (s1+s2+s3) / 2;
		
		a= Math.sqrt(s * (s-s1) * (s-s2) * (s-s3));
		System.out.println(a);
		
		
		
		

	}

}
