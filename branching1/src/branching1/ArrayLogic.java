package branching1;
import java.util.Scanner;

public class ArrayLogic {

	public static void main(String[] args) {

		int[] arr = new int[100];
		 
		int n;
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the number of elements to use");
		 
		n = sc.nextInt();
		 
		int i;
		 
		// input
		 
		System.out.println("Enter the numbers one by one");
		 
		for (i = 0; i < n; i++) {
		 
		System.out.println("Enter the next number");
		 
		arr[i] = sc.nextInt();
		 
		}
		 

		// logic
		for(i=0;i<n;i++) {
		if (arr[i] % 2 == 0) {
			arr[i] = arr[i] /2;
		}
		else {
			arr[i]=arr[i] * 2;
			
		}
		}

		// output
		 
		System.out.println("Array Contents after modification is ");
		 
		for (i = 0; i < n; i++) {
		 
		System.out.println(arr[i]);
		 
		}
		 
		}
}
