package algorithms;
import java.util.Scanner; 

class BubbLe2 {

	public static void main(String[] args) {
		int a[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 elements:");
		
		
		for(int i = 0;i<10;i++) {
			a[i]= sc.nextInt();
			
		}
		
		System.out.println("Write in unsorted elements.");
		for(int i = 0;i<10-1;i++) {
			
			System.out.print(a[i]+", ");
			
		}
		
		System.out.println();
		//Bubble sort.
		
		for(int i = 0; i< 10-1; i++) {
			for (int j = 0; j< 10-i-1; j++) {
				
				if(a[j]> a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
				
				
			}
		}
		System.out.println("The sorted list are:");
		for(int i = 0;i <10;i++) {
			System.out.print(a[i]+", ");
		}

	}

}
