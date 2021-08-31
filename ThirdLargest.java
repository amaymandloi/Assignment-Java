2.) From an array find 3rd highest value

public class ThirdLargest{  
public static int get(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-3];  
}  
public static void main(String args[]){  
int b[]={66,44,33,88,77,99};  
System.out.println("Third Largest: "+get(b,6));  
}}  