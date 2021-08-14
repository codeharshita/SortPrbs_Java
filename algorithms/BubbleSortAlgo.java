package algorithms;

public class BubbleSortAlgo {

	public static void main(String[] args) {

		
		int[] a= {15, 16, 6, 8, 5};
		
		int n = 0;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<=n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j+1] = a[j];
					a[j]= temp;
					
					
				}
			}
			
		}
		
		System.out.println("The sorted Elemnets are:");
		for(int i = 0; i<4;i++) {
			System.out.println(a[i]);
		}
	}

}
