package algorithms;

public class SortAlgo {

	public static void main(String[] args) {
		
		
		int a[]= {3,6,1,5};
		
		for(int i = 1;i<4;i++) {
			
			int  temp = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]> temp) {
				a[j+1]= a[j];
				j--;
			}
			
			a[j+1]= temp;
			
		}
		
		System.out.println("Th sorted elemnts are");

	
	for(int k =0;k<4;k++) {
		
		System.out.print(a[k] + ", ");
		
		
		
		
		
	}
	


	}
}
