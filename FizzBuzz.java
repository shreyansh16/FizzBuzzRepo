import java.util.Scanner;

public class FizzBuzz {
  
	public static void Test(int n)
	{
		for(int i=1;i<=n;i++)
		{   
			//to check if the number is a multiple of 3 and 5
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			//to check if the the number is a multiple of 3
			else
				if(i%3==0)
					System.out.println("Fizz");
			//to check if the the number is a multiple of 5
			else
				if(i%5==0)
					System.out.println("Buzz");
			else
					System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{   
		
		//user friendly input taken 
	   	int n;
	   	Scanner sc = new Scanner(System.in);
	   	
	   	n=sc.nextInt();
	   	Test(n);
	}
}
