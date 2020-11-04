
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
		
		//here the number inside the bracket specifies the number upto which we want to check basically the range from 1-n
		//example in this case n=100
	   	Test(100);
	}
}
