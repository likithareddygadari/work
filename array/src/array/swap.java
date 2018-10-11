package array;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int i,j;
		int arr[] = new int[8];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	
	for (i=0; i< 8; i++) {
		arr[i] = sc.nextInt();
		
	}
	
	i=0;
	while (i < 8-1) {
		j = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = j;
		i = i+2;
		
	}
	
	System.out.println("After the swap is :");
	for (i=0; i< 8; i++) {
		System.out.println("" + arr[i]);
	}
	

	}

}
