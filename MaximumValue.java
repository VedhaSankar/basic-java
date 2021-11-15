import java.util.ArrayList;
import java.util.Scanner;
public class MaximumValue
{
        public static void main(String[]args)
        {
                int n;
                ArrayList<Integer>L=new ArrayList<Integer>();
                int max;
		Scanner in=new Scanner(System.in);
                System.out.println("Enter size of arraylist:");
                n=in.nextInt();
                System.out.println("Enter elements in arraylist:");
                for(int i=0;i<n;i++)
                {
                        L.add(in.nextInt());
                }
                max=L.get(0);
                for(int i=0;i<L.size();i++)
                {
                        if(L.get(i)>max)
                                max=L.get(i);
                }
                System.out.println("MAX element:"+max);
                in.close();
        }
}
