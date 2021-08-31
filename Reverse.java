3.)Write a code to reverse a number.

public class Reverse  
{  
public static void main(String[] args)   
{  
int n = 987654, r = 0;  
while(n!= 0)   
{  
int re = n % 10;  
r = r * 10 + re;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + r);  
}  
}  
