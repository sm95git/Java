package Basics;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=5;
		int count=0;
		
		for(int i=1;i<=num; i++)
		{
			if(num%i ==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(num+" is a Prime number");
		}
		else {
			System.out.println(num+" Not a prime number");
		}
		
	}

}