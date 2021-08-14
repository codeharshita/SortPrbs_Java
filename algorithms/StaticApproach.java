package algorithms;
import java.util.*;
public class StaticApproach {
	
	static int B, H, area;
	static  boolean flag = true;
	
	

	static {
		Scanner sc = new Scanner (System.in);
		B = sc.nextInt();
		H = sc.nextInt();

	
	try {
		if (H <= 0 ||  B <= 0 )
			flag = false;
			throw new Exception("Breadth and height must be positive");
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.exit(0);
			}	
	}
	    
	public static void main(String[] args) {
			if (flag) {
			int area = B*H;
				System.out.println(area);
			}
			
				

	}
			

}



	
