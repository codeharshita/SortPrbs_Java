
package algorithms;
import java.util.Scanner;

public class ProblemArray1 {

	public static void main(String[] args) {
		
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements.");
			int n = sc.nextInt();
		
			//int sum1 = 0;
			int [] arr = new int [4];
			for(int i = 0 ; i<3; i++) {
				arr[i]= sc.nextInt();
			}
			
			int sum1 = 0;
			for(int i = 0; i<n; i++) {
				sum1 = sum1 + i;
				
			System.out.println("The sum is:");
			System.out.println(sum1);
			}
		
			
			}

	}

