package Basics;

public class ReverseNumber {

	public static void main(String[] args) {
		int num =12345;
		int rev =0;
		//by loop
		
		while(num!=0)
		{
			int remainder=num%10;
			rev=rev*10 + remainder;
			num= num/10;			
		}
		
		System.out.println("reverse number is : " +rev);
		
		// by Stringbuffer 
		
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer r= sb.reverse();
//		System.out.println("reverse number : " +r);
		
		// by stringbuilder
//		StringBuilder sr= new StringBuilder();
//		sr.append(num);
//		StringBuilder rr= sr.reverse(); 
//		System.out.println(rr);
		
	}

}
