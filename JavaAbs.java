import java.util.*;
abstract class shape	
{
	public int x,y;
	public abstract void printarea();
}
class rectangle extends shape
{
	public void printarea()
	{
		float area;
		area=x*y;
		System.out.println("Area of rectangle: "+area);
	}
}
class triangle extends shape
{
	public void printarea()
	{
		float area;
		area=(x*y)/2;
		System.out.println("Area of triangle: "+area);
	}
}
class circle extends shape
{
	public void printarea()
	{
		float area;
		area=(22*x*x)/7;
		System.out.println("Area of circle: "+area);
	}
}
public class JavaAbs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		rectangle r=new rectangle();
		r.x=x1;
		r.y=y1;
		r.printarea();
		triangle t=new triangle();
		t.x=x1;
		t.y=y1;
		t.printarea();
		circle c=new circle();
		c.x=x1;
		c.printarea();
	}
}

