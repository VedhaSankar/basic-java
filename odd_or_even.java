// javac odd_or_even

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.print(num + " is even\n");
        else    
            System.out.print(num + " is odd\n");
        scan.close();


    }
}
