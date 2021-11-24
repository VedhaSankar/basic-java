import java.util.Scanner;

public class divisible{

    divisible(int n){

        int oddsum=0,evensum=0;
        String str_val = Integer.toString(n);
        for(int i=0; i<=str_val.length()-1; i++)
        {

            // The ASCII table is arranged so that the value of the character '9' (for eg)is nine greater than the value of '0'; the value of the character '8' is eight greater than the value of '0'; and so on.
            // int digit = str_val.charAt(i) - '0';
            // int digit = Integer.parseInt(String.valueOf(str_val.charAt(i)));
            int digit = Character.getNumericValue(str_val.charAt(i));
            System.out.println(digit);
            
            if(digit%2 == 0)
                oddsum += digit;
            else
                evensum += digit;
        }
        int sub = oddsum - evensum;

        if(sub%11==0)
            System.out.println("It is divisible by 11");
        else
            System.out.println("It is not divisible by 11");
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number:");
        num = sc.nextInt();

        divisible ob = new divisible(num);
        sc.close();
    }
}