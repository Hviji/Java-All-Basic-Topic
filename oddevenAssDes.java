/*
5.Write a program to sort the elements in odd positions in descending order and elements in even positions in ascending order
*/

public class oddevenAssDes
{
 
    public static void main(String[] args) 
    {
   
        int a[] ={1, 2, 3, 4, 5, 6, 7, 8, 9};


           int  temp1,temp2;
        for(int i = 0;i<a.length;i++)
        {
            if(i%2==0)
            {
                for(int j = 0;j<a.length-2;j+=2)
                {
                if(a[j]<a[j+2])
                {
                    temp1 = a[j];
                    a[j] = a[j+2];
                    a[j+2] = temp1;
                }
            }
            }
            else
            {
                for(int j = 1;j<a.length-2;j+=2)
                {
                if(a[j]>a[j+2])
                {
                    temp2 = a[j];
                    a[j] = a[j+2];
                    a[j+2] = temp2;
                }
            }
          }
        }
        for(int i:a)
        System.out.print(i + "  ");
    }
}

