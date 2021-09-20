import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Simple {
	
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<>();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter any five name");
		
		for(int i=0;i<5;i++)
		{
			String name= input.nextLine();
			names.add(name);
			
		}
		System.out.println("Input given by user");
		System.out.println(names);
		
		String[] nameArray = new String[names.size()];
		names.toArray(nameArray);
		
		for(String x: nameArray)
		{
			System.out.println(x.toUpperCase());
			
		}
	}

}