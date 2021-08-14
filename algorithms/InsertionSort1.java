package algorithms;

public class InsertionSort1 {

	public static void main(String[] args) {
		
		int arr[]= {45,63,12,76,33,58,90,66};
		
		for(int i = 1 ;i < 7 ; i++) {
			int temp = arr[i];
			 int j = i-1;
			 
			 while( j >=0 && arr[j]> temp) {
				 arr[j+1]=arr[j];
				 j--;
				 
			 }
			 arr[j+1]= j;
		}
		for(int i = 0 ;i < 7 ; i++) {
		System.out.println("The sorted Elements are:"+ arr[i]);
		}

	}

}
