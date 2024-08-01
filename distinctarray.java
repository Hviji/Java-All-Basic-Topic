/******************************************************************************

7. Write a program to print the distinct numbers from an integer array.
Input : {1, 4, 5, 3, 1, 5}
Output: {4, 3}
Input : {1, 4, 5, 3}
Output: {1, 4, 5, 3}
Input : {1, 1}
Output: {}

*******************************************************************************/
public class distinctarray
{
	public static void main(String[] args) {
    int  a[]= {1, 4, 5, 3, 1, 5};

	    boolean s;
	    int i=0;int j=0;
	    for( i=0;i<a.length;i++)
	    {
	    s=true;
	    
	        for( j=0;j<a.length;j++)
	        {
	        if(i!=j && a[i]==a[j])
	        {
	        s =false;
	        	        break;
	        }
}
	    
	    if(s)
	    {
	    	        		System.out.print("{" + a[i] + "}" );
	    	        		
	    }
	    
	    
	    }
	    
	}
}

	    
        
