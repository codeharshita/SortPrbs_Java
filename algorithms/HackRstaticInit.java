package algorithms;
import java.util.Scanner;

public class HackRstaticInit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter length.");
			int length= sc.nextInt();
				
			System.out.println("Enter Breadth.");
			int breadth = sc.nextInt();
			
			
			if (length >= 0 && breadth >0) 
			{
			
					int area = length *breadth;
					System.out.println("The area is: " + area);
			}else {
				
				System.out.println("Breadth and height must be positive.");
			}
	
	}
	
			

}
