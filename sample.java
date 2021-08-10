// for getting input use below package
import java.util.Scanner;


public class test {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter age:");
        int age = Integer.parseInt(scan.nextLine());

        // it doesn't input address here if we use nextInt. https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

        System.out.println("Enter address:");
        String address = scan.nextLine();
        
        System.out.println(name + " " + age + " " + address);
    }

}