/*
Write a program to generate Fibonacci series up to given number 'n'. 
*/
import java.util.Scanner;
public class fibn
{
	public static void main(String[] args) {
	    int c;
	    Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the num 1");
 int a =sc.nextInt();
 System.out.println("Enter the num 2");
 int b=sc.nextInt();
  System.out.println("Enter the num limit");
 int fib =sc.nextInt();
      	      		System.out.println("The fibonacis series is " );

 for(int i=0;i<fib;i++)
 {

     c=a+b;
     a=b;
     b=c;

 
 
 
		System.out.println( c );
	}

}
}

