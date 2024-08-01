/*
Write a program to find third largest number in an array.

            Input: {10, 5, 11, 100, 15, 12, 13}                                              Output: 13

            Input: {0, 1}                                                                                Output: -1

            Input: {1, 1, 1, 1}                                                                          Output: 1
        */

public class thirdlargest
{
	public static void main(String[] args) 
	{
		    int a[]={24,14,76,90,34};
	    int secondmax=a[0];
	    int  thirdmax=a[0];
	    int max=a[0];

	           for(int i=0;i<a.length;i++)
	           {
	 if(a[i]>max)
	    {
	        thirdmax=secondmax;
	        secondmax=max;
	        max=a[i];
	    }
	    
	    else if(a[i]>secondmax)
	    {
	    thirdmax=secondmax;
	    secondmax=a[i];
	    }
	    
	       else if (a[i]>thirdmax) 
	       {
                thirdmax = a[i];
            } 
	           }
	    
	    	
	    	if(thirdmax==0)
	    	{
	    	    System.out.println("-1");
	    	}
	    	else
	    	System.out.println("The third maximum is " + thirdmax);
	}
}



        
        
            
            


