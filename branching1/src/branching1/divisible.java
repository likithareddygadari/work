package branching1;
import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
						 int num;
						System.out.println("Enter the number");
						Scanner sc= new Scanner(System.in);
						num = sc.nextInt();
						if (num%3==0 && num%5==0) {
						System.out.println("The given number is divisible by 3 and 5");
						}
						else if(num%3==0 && num%5!=0) {
						System.out.println("The given number is divisible by 3 but not by 5");
						}
						else if(num%3!=0 && num%5==0) {
						System.out.println("The given number is divisible by 5 but not by 3");
						}	
						else if(num%3!=0 && num%5!=0) {
							System.out.println("The given number is divisible by neither 5 nor 3");
							}
						}
	
					
	
	
				

	}


