-----------------------------------------------------------------------//Electronic//--------------------------------------------------------------------------
public class Electronic 
{

   private int Id;
   private String Name;
   private String Decription;
   private int Price;
   
   public Electronic() 
   {
		super();
		
	}
   
   public Electronic(int id, String name, String decription, int price) 
   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDecription() {
	return Decription;
}

public void setDecription(String decription) {
	Decription = decription;
}

public int getPrice() {
	return Price;
}

public void setPrice(int price) {
	Price = price;
}

@Override
public String toString() {
	return "Electronic [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
}
   
}

------------------------------------------------------------------//Sport//-------------------------------------------------------------------------------


package Com.Shopping;

public class Sport{
	
	  
	   private int Id;
	   private String Name;
	   private String Decription;
	   private int Price;
	   
	   public Sport() 
	    {
			super();
			// TODO Auto-generated constructor stub
		}
	   
	   public Sport(int id, String name, String decription, int price)
	   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	   }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Sport [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
	}
    
	   
}

------------------------------------------------------------//Gadgets//------------------------------------------------------------------------------------
public class Gadgets
{
	   private int Id;
	   private String Name;
	   private String Decription;
	   private int Price;
	   
	   public Gadgets()
	   {
		super();
		// TODO Auto-generated constructor stub
	   }
	   
	   public Gadgets(int id, String name, String decription, int price)
	   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	   }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Gadgets [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
	}
	   
	   
}
--------------------------------------------------------------------//Furniture//----------------------------------------------------------------------------
package Com.Shopping;

public class Furniture 
{
	  
	   private int Id;
	   private String Name;
	   private String Decription;
	   private int Price;
	   
	   public Furniture() 
	   {
			super();
			// TODO Auto-generated constructor stub
		}
	  
	   public Furniture(int id, String name, String decription, int price) 
	   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	   }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Furniture [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
	}

--------------------------------------------------------------------Repository------------------------------------------------------------------------------

package Com.Shopping;

import java.util.ArrayList;

public class Repository
{
  public static ArrayList<Electronic> list1;
  public static ArrayList<Sport> list2;
  public static ArrayList<Furniture> list3;
  public static ArrayList<Gadgets> list4;
  
  public static void Repo() 
  {
	  	  
	  list1 = new ArrayList<Electronic>();
	  
	  Electronic electronic1 = new Electronic();
	  electronic1.setId(1);
	  electronic1.setName("mixer");
	  electronic1.setDecription("Gopi m543 ");
	  electronic1.setPrice(12898);
	  list1.add(electronic1);
	  
	  Electronic electronic2 = new Electronic();
	  electronic2.setId(2);
	  electronic2.setName("Jio Hosport");
	  electronic2.setDecription("M2");
	  electronic2.setPrice(1850);
	  list1.add(electronic2);
	  
	  Electronic electronic3 = new Electronic();
	  electronic3.setId(3);
	  electronic3.setName("Fan");
	  electronic3.setDecription("Hevalls");
	  electronic3.setPrice(2599);
	  list1.add(electronic3);
	  
	  Electronic electronic4 = new Electronic();
	  electronic4.setId(4);
	  electronic4.setName("Extension Board");
	  electronic4.setDecription("Model 876");
	  electronic4.setPrice(599);
	  list1.add(electronic4);
	  
	  Electronic electronic5 = new Electronic();
	  electronic5.setId(5);
	  electronic5.setName("TV");
	  electronic5.setDecription("Bush");
	  electronic5.setPrice(7000);
	  list1.add(electronic5);


 list2 = new ArrayList<Sport>();

	  Sport  sport1 = new Sport();
	  sport1.setId(1);
	  sport1.setName("Vikki Balls");
	  sport1.setDecription("Tennis Packs of 6");
	  sport1.setPrice(450);
	  list2.add(sport1);
	  
	  Sport  sport2 = new Sport();
	  sport2.setId(2);
	  sport2.setName("Stemp");
	  sport2.setDecription("Nick");
	  sport2.setPrice(900);
	  list2.add(sport2);

	  
	  Sport  sport3 = new Sport();
	  sport3.setId(3);
	  sport3.setName("FootBall");
	  sport3.setDecription("8th inch");
	  sport3.setPrice(999);
	  list2.add(sport3);

	  
	  Sport  sport4 = new Sport();
	  sport4.setId(4);
	  sport4.setName("Carrom Board");
	  sport4.setDecription("Playwwod");
	  sport4.setPrice(8999);
	  list2.add(sport4);

	  
	  Sport  sport5 = new Sport();
	  sport5.setId(5);
	  sport5.setName("Bat");
	  sport5.setDecription("Reebook");
	  sport5.setPrice(1599);
	  list2.add(sport5);

         list3 = new ArrayList<Gadgets>();

		 Gadgets gadget1 = new Gadgets();
		 gadget1.setId(1);
		 gadget1.setName("MicroSD");
		 gadget1.setDecription("Class 10");
		 gadget1.setPrice(4999);
		 list3.add(gadget1);
		 
		 Gadgets gadget2 = new Gadgets();
		 gadget2.setId(2);
		 gadget2.setName("Ballpoint Pen");
		 gadget2.setDecription("Model-402 Wireless");
		 gadget2.setPrice(1499);
		 list3.add(gadget2);
		 
		 Gadgets gadget3 = new Gadgets();
		 gadget3.setId(3);
		 gadget3.setName("Sony camera");
		 gadget3.setDecription("Bmc -100p ");
		 gadget3.setPrice(1999);
		 list3.add(gadget3);
		 
		 Gadgets gadget4 = new Gadgets();
		 gadget4.setId(4);
		 gadget4.setName("Smartphone");
		 gadget4.setDecription("Redmi 4");
		 gadget4.setPrice(4499);
		 list3.add(gadget4);
		 
		 
		 Gadgets gadget5 = new Gadgets();
		 gadget5.setId(5);
		 gadget5.setName("Power Bank");
		 gadget5.setDecription("10000 MAH.");
		 gadget5.setPrice(999);
		 list3.add(gadget5);

        list4 = new ArrayList<Furniture>();

	 Furniture furniture1 = new Furniture();
	 furniture1.setId(1);
	 furniture1.setName(" Table");
	 furniture1.setDecription("Adjustable Height");
	 furniture1.setPrice(2799);
	 list4.add(furniture1);
	 
	 Furniture furniture2 = new Furniture();
	 furniture2.setId(2);
	 furniture2.setName("Chair");
	 furniture2.setDecription("Rounder");
	 furniture2.setPrice(2850);
	 list4.add(furniture2);

	 
	 Furniture furniture3 = new Furniture();
	 furniture3.setId(3);
	 furniture3.setName("Tv Showcase");
	 furniture3.setDecription("model 7686");
	 furniture3.setPrice(8976);
	 list4.add(furniture3);

	 
	 Furniture furniture4 = new Furniture();
	 furniture4.setId(4);
	 furniture4.setName(" Sofa");
	 furniture4.setDecription("3 Seater Fabric Set");
	 furniture4.setPrice(10000);
	 list4.add(furniture4);

	 
	 Furniture furniture5 = new Furniture();
	 furniture5.setId(5);
	 furniture5.setName("Bad");
	 furniture5.setDecription("Double Bad");
	 furniture5.setPrice(13500);
	 list4.add(furniture5)
  }
}

-----------------------------------------------------------------------Controller----------------------------------------------------------------------------
package Com.Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller 
{
   public static void menuUI()
   {
	 System.out.println("----------------- WelCome To Shopping Cart-------------------");
	 System.out.println();
	 System.out.println(" << SELECT CATEGORIES>>");
	 System.out.println("1 Electronics");
	 System.out.println("2 Sports");
	 System.out.println("3 Gadgets ");
	 System.out.println("4 Furniture");
	 System.out.println("5 To Conformed Order");
	 System.out.println("6 Exit ");
	 System.out.println();
	 
	 
   }
	public static void main(String[] args)
	{
		Funtional funtion = new Funtional();
	    Repository repo = new Repository();
	    repo.Repo();
		int option;
		do
		{
			menuUI();
			System.out.println("Press Number To Select Category");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option) 
			{
			
			case 1:funtion.viewElectronic();
			       System.out.println("-------------------------------------------------------------");
			       break;
			case 2:funtion.viewSport();
		           System.out.println("-----------------------------------------------------------------");
		           break;
			case 3:funtion.viewFurniture();
		           System.out.println("-----------------------------------------------------------------");
		           break;
			case 4:funtion.viewGadgets();
		           System.out.println("-----------------------------------------------------------------");
		           break;

			case 5:System.out.println("ThankYou");
				   System.out.println("Your Order Has Been Placed");
				   System.out.println("Amount to Be paid  "+funtion.Sum+".00/-");
				   System.exit(0);
			}
		}
		while(option!= 6) ;
				
	}
}

------------------------------------------------------------------Funcational----------------------------------------------------------------------------------
package Com.Shopping;

import java.util.ArrayList;
import java.util.Scanner;

  
public class Funtional extends Repository
{
	int Num;
	int Quantity;
	int Sum ;
	
  Controller con = new Controller();
  public  void viewElectronic()
  {   
	  System.out.println("-------ELECTRONICS MENU---------");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Electronic elec:list1) 
	  {
		  System.out.println("  " +elec.getId()+"       :  "+elec.getName()+"          :  "+elec.getDecription()+"       :  "+elec.getPrice()+".00");
	      System.out.println();
	  }
	  
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Electronic elec:list1)
	  {
		  if(Num==elec.getId())
		  {
			  Sum = Sum+(elec.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  
  }
  
  public  void viewSport()
  {    
	  System.out.println("----------SPORTS MENU---------");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
      System.out.println();
	  for(Sport spt:list2) 
	  {
		  System.out.println("  " +spt.getId()+"       :  "+spt.getName()+"          :  "+spt.getDecription()+"      :  "+spt.getPrice()+".00");
	      System.out.println();  
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Sport spt:list2)
	  {
		  if(Num==spt.getId())
		  {
			  Sum = Sum+(spt.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  }
  
 
  public  void viewGadgets()
  {   
	  System.out.println("------------------GADGETS MENU-------------------------------");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Gadgets gdt:list4) 
	  {
		  System.out.println("  " +gdt.getId()+"        "+gdt.getName()+"          :   "+gdt.getDecription()+"        :  "+gdt.getPrice()+".00");
	      System.out.println();
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Gadgets gdt :list4)
	  {
		  if(Num==gdt.getId())
		  {
			  Sum = Sum+(gdt.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	   public  void viewFurniture()
  {   
	  System.out.println("-----------------FURNITURE MENU--------------------------------");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Furniture ftr:list3) 
	  {
		  System.out.println("  " +ftr.getId()+"        "+ftr.getName()+"          :   "+ftr.getDecription()+"        :  "+ftr.getPrice()+".00");
	      System.out.println();
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Furniture ftr :list3)
	  {
		  if(Num==ftr.getId())
		  {
			  Sum = Sum+(ftr.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  }
-----------------------------------------------------------------------Exit----------------------------------------------------------------------------------
  
