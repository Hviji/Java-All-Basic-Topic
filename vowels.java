   /*1. Write a program to check if a vowel is present in the string.
            Input: aAnt Output: true 

            Input: Brklmn Output: false*/






import java.util.Scanner;

public class vowels
{
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean is  = false;
        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 'a' - 'A');
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                is = true;
                break;
            }
        }
        System.out.println("Vowels:  " + is);

    }
}

