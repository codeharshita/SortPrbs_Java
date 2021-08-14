package algorithms;
import java.util.Scanner;


public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five elements");
		
		for(int i = 0 ; i < 5 ; i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("Apply Selection Sort to it.");
		
		// Selection sort
		
		int n = 0;
		for(int k= 0 ; k < n-1 ; k++) {
			int min = k;
			
			for(int j = k+1 ; k<n ; j++ ) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			if(min != k) {
			 int  temp = a[k];
			 a[k]= a[min];
			 a[min]= temp;
			}
		}
		
		System.out.println("The sorted Array is:");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(a[i]);
		}
		

	}

}
