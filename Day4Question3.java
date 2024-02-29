/*import java.util.Scanner;
class Day4Question3{
			public static void main(String []args)
			{ int t=0;
			  int sum =0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number");
				int n=sc.nextInt();
				for(int i=1;i<n;i++)
				{
					t=2*(i-1);
					if(t%3==0)
					{
						sum+=t;
					}
				}
				System.out.println("sum of multiples of 3 in a sequence of number"+sum);
				
			}

}*/

import java.util.Scanner;
public class Day4Question3 {
    public static void main(String[] args) {
        
        int start = 1;
        

        
        int sum = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();

       
        for (int i = 0; i <= n; i++) {
		int t=2*(i-1);
            
            if (i % 3 == 0) {
                
                sum += i;
            }
        }

        
        System.out.println("Sum of multiples of 3 in the sequence: " + sum);
    }
}
