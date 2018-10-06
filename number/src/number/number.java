package number;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number to find even or odd");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        
		if (num%2==0) {
        System.out.println("The number is even");
	}
        else {
        	System.out.println("The number is odd");
	}
	
}

}