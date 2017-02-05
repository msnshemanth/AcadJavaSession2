import java.util.*;
public class Assign24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		int max;
        Scanner Scan = new Scanner(System.in);
        
        try{
        System.out.print("Enter number of elements in the array : ");
        
        n = Scan.nextInt();
        
        
        int a[] = new int[n];
        
        System.out.println("Enter elements of array : ");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = Scan.nextInt();
        }
        
        
        max = a[0];
        
        
        
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        
        System.out.println("Maximum value:"+max);
    }finally 
        {
    	Scan.close();
    	}
	
	}
}




