/*
Write a program to find out if the given string (ignore the spaces in the string) is palindrome or not.

            Input: abBa Output: true

            Input: a     b  cba Output: true

            Input: ab Output: false
*/

public class palindromespace
{
public static void main(String[]agrs)
{
String s="Mala YALam";
String newstring="";
int k=0;
int c=0;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch!=' ')
{
newstring=newstring+ch;
}
}
for(int i=0,j=newstring.length()-1;i<newstring.length();i++,j--)
{
if(newstring.charAt(i)==newstring.charAt(j)||newstring.charAt(i)==(char)(newstring.charAt(j)+32)||newstring.charAt(i)==(char)(newstring.charAt(j)-32))
c++;
}
if(c==newstring.length())
System.out.println("True");
else
System.out.println("False");
}
}
