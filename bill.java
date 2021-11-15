import java.util.*;
import java.lang.Math;
public class bill {
	
		public static void main(String args[])
		{
			int custNum,prevRead,curRead,readDiff;
			String custName;
			double amount=0.0;
			boolean conType;
			Scanner scan = new Scanner(System.in);

            System.out.println("Register Number: 312320104167");


			System.out.println("Enter Consumer number: ");
			custNum=scan.nextInt();

			System.out.print("Enter consumer name: ");
			custName=scan.next();

			System.out.println("Enter previous reading: ");
			prevRead=scan.nextInt();

			System.out.println("Enter current reading: ");
			curRead=scan.nextInt();

			System.out.println("connection type(commercial-true/domestic-false)");


			conType=scan.nextBoolean();

			readDiff=Math.abs(prevRead-curRead);

			if(conType == true)
			{
				if(readDiff<101)
				{
					amount=readDiff*2;
				}
				else if(readDiff<201&&readDiff>100)
				{
					amount=readDiff*4.5;
				}
				else if(readDiff<501&&readDiff>200)
				{
					amount=readDiff*6;
				}
				else if(readDiff>500)
				{
					amount=readDiff*7;
				}
				else System.out.println("oops!!you arent under quota");
			}
			else if(conType == false)
			{
				if(readDiff<101)
				{
					amount=readDiff*1;
				}
				else if(readDiff<201&&readDiff>100)
				{
					amount=readDiff*2.5;
				}
				else if(readDiff<501&&readDiff>200)
				{
					amount=readDiff*4;
				}
				else if(readDiff>500)
				{
					amount=readDiff*6;
				}
				else System.out.println("oops!!you arent under quota");
			}
			System.out.println("\nThe bill amount for customer ID# "+custNum+" belonging to "+custName+" is "+amount);
		
	}

}


