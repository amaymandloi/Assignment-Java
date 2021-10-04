package com.yash.io;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple {
	
	public static void main(String args[])
	{
		String path = null;
		try{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter path of directory : ");
		path = input.next();
		
		}catch(InputMismatchException e)
		{
			System.out.println("Invalid path format");
		}
		
		File folder = new File(path);
		if(folder.isDirectory()==true)
		System.out.println("Given path is valid");
		else
		{
		System.out.println("Given path is not valid");
		System.exit(0);
		}
		int count=0;
		count = folder.list().length;
		System.out.println("Number of files in given directory : "+count);	
	}
	
}