import java.util.Scanner;
import java.util.ArrayList;
class stropr
{
	private static ArrayList<String>var=new ArrayList<>();
	private static Scanner scan=new Scanner(System.in);
	private static void append()
	{
		System.out.println("Enter the string to append:");
		String str=scan.next();
		var.add(str);
		System.out.println("Appended successfully!!");
	}
	private static void add()
	{
		{
			System.out.println("Enter the string to add:");
			String str=scan.next();
			System.out.println("Enter the index of the string:");
			int i=scan.nextInt();
		        var.add(i,str);
			System.out.println("Addded successfully!!");
		}
	}
	private static void search()
	{
		System.out.println("Enter the string to search for:");
		String str=scan.next();
		int no=var.indexOf(str);
		System.out.println("Found in index "+no);
	}
	private static void find()
	{
		System.out.println("Enter the first letter:");
		String ch=scan.next();
		for(String a:var)
		{
			if(a.substring(0,ch.length()).equals(ch))
				System.out.println(a);
		}
	}
	private static void display()
	{
		for(String a:var)
			System.out.println(a);
	}
	public static void main(String args[])
	{
		int ch;
		try
		{
		  	do
		    	{
				System.out.println("MENU\n1.Append \n2.Add\n 3.Search\n 					4.Find\n 5.Display\n 6.Exit");
				System.out.println("Enter your choice:");
				ch=scan.nextInt();
				switch(ch)
				{
					case 1:append();break;
					case 2:add();break;
					case 3:search();break;
					case 4:find();break;
					case 5:display();break;
					case 6:System.exit(0);
					default:System.out.println("Invalid input");break;
				}
		    	}while(true);
	       	}
		catch(Exception e)
	  	{
			System.out.println(e);
	  	}
	}
}
