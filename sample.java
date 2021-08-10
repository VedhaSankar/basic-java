// for getting input use below package
import java.util.Scanner;


public class test {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);



        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter age:");
        int age = scan.nextInt();

        System.out.println("Enter address:");
        String address = scan.nextLine();

        System.out.println(name + " " + age + " " + address);
    }

}