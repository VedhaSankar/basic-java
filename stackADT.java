import java.io.*;
interface Mystack
{
	public void pop();
	public void push();
	public void display();
}
class stackarray implements Mystack
{
	final static int n=5;
	int stack[]=new int[n];
	int top=-1;
	public void push()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader 					(System.in));
			if(top==(n-1))
			{
				System.out.println("Stack overflow");
				return;
			}
			else
			{
				System.out.println("Enter the element:");
				int ele=Integer.parseInt(br.readLine());
				stack[++top]=ele;
			}
		}
		catch(IOException e)
		{
			System.out.println("e");
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return;
		}
		else
		{
			int popper=stack[top];
			top--;
			System.out.println("Popped element is "+popper);
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Stack  is empty");
			return;
		}
		else
		{
			String str=" ";
			for(int i=0;i<=top;i++)
			{
				str=str+"A"+stack[i]+"<---";
			}
			System.out.println("Elements are "+str);
		}
	}
}
class stackADT
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Implementation of Stack using Array");
		stackarray stk=new stackarray();
		int ch=0;
		do
		{
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: stk.push();break;
				case 2: stk.pop();break;
 				case 3: stk.display();break;
				case 4: System.exit(0);
			}
		}while(ch<5);
	}
}

