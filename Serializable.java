import java.io.Serializable;
public class Simple implements Serializable{
	
	private int personId;
	private String personName;
	public int personAge;
	public String personAddress;
	
	public Simple()
	{
		
	}
	
	public Simple(int personId, String personName, int personAge, String personAddress)
	{
		this.personId=personId;
		this.personAge=personAge;
		this.personName=personName;
		this.personAddress=personAddress;
	}
	
	public void setPersonId()
	{
		this.personId=personId;
	}
	
	public int getPersonId()
	{
		return personId;
	}
	
	public void setPersonName()
	{
		this.personName=personName;
	}
	
	public String getPersonNAme()
	{
		return personName;
	}
	
	public void setPersonAge()
	{
		this.personAge=personAge;
	}
	
	public int getPersonAge()
	{
		return personAge;
	}
	
	public void setPersonAddress()
	{
		this.personLocation=personAddress;
	}
	
	public String getPersonAddress()
	{
		return personAddress;
	}
	
}
//Second part

package com.assignments;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Simple S1 =new Simple();
		Class classData1= S1.getClass();
		
		ClassLoader loader1 = ClassLoader.getSystemClassLoader();
		Class classData2 = loader1.loadClass("com.assignments.Simple");
		
		Class classData3= Class.forName("com.assignments.Simple");
		
		Constructor[] constructors= classData1.getConstructors();
		
            //constructor

		for(Constructor consobj : constructors)
		{
			System.out.println(consobj);
		}
		
	//Dynamic object 
		Simple S2= (Simple)classData3.newInstance();
		
	
		Class[] inf= classData2.getInterfaces();
		if(inf.equals("Serializable"))
		{
			System.out.println("Simple class implements Serializable interface");
		}
		else
		{
			System.out.println("Simple class does not implement Seializable interface");
		}
		
		Field[] fields = classData3.getFields();
		for(Field fieldsInPerson : fields)
		{
			System.out.println(fieldsInPerson);
		}
		
		
		//Checking setter() and getter()
		
		Method[] methods = classData3.getMethods();
		for(Method method : methods)
		{
			System.out.println(method);
		}
		
		for(int i=0; i<methods.length;i++)
		if(methods[i].startsWith("get"))
		{
			System.out.println("Simple class has getter methods");
		}
		
		for(int i=0; i<methods.length;i++)
			if(methods[i].startsWith("set"))
			{
				System.out.println("Simple class has setter methods");
			}
		
		
	}
}