import java.util.*;

public class Pattern5{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n= sc.nextInt();
		
	         char k='A';
			for(int i=1;i<=n;i++){
				
				for(int j=1; j<=i ; j++){
					 System.out.print(k+" ");
					
				}
				System.out.println();
				k++;
			}
			
	}
}