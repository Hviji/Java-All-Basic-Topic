/*
Write a program to print the index of the given element in an array.

            Input : {1, 5, 3, 7}, 1

            Output: 0

            Input : {10, 22, 33, 25, 32, 54, 64, 1}, 100

            Output: -1
*/
import java.util.Scanner;

public class arrayindex
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        
        int[] array = new int[size];

       
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

       
        System.out.println("Enter the element to find");
        int element = sc.nextInt();

        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        System.out.println("Index of the element: " + index);
    }
}

