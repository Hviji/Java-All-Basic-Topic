import java.util.Scanner;
public class stringoccurance
{
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter a charater :");
  char n = sc.next().charAt(0);
  sc.nextLine();
   System.out.println("Enter a string :");
  String str = sc.nextLine();
      String res ="";
      int len = str.length();
           System.out.println("The occurance of the given string is = " );
     for(int i=0;i<len;i++)
     {
        // n = sc.next().charAt(0);
       if(str.charAt(i)==n||str.charAt(i)==n-32||str.charAt(i)==n+32){
         // continue;
       }else
       res=res+str.charAt(i);
         
       
     }
     System.out.println(res);
 }
     }
   



