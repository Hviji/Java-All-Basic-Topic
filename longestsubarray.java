public class smallestsubarray 
{
    public static void main(String[] args) 
    {
        int[] a = {10, 22, 33, 25, 32, 54, 64, 1};
        int len = a.length;
        int index = 0;
        int count = 1;
        int min = len + 1; 

        for (int i = 1; i < len; i++) 
        {
            if (a[i - 1] < a[i]) 
            {
                count++;
            } else {
                if (min > count && count > 1) 
                {
                    min = count;
                    index = i - min;
                }
                count = 1;
            }
            if (i == len - 1) 
            {
                if (min > count && count > 1) 
                {
                    min = count;
                    index = i - min + 1;
                }
            }
        }

        if (min == len + 1) 
        {
            min = 1;
            index = 0;
        }

        System.out.println("The smallest subarray count is = " + min);
        System.out.print("The smallest subarray of the numbers is = ");
        for (int i = index; i < index + min; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

