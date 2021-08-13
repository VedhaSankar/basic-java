import java.util.Scanner;

public class read_info {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name, gender;
        Integer age;
        Long mobile;
        Double cgpa;

        System.out.print("Enter Name : ");
        name = scanner.nextLine();

        System.out.print("Enter Gender [M/F] : ");
        gender = scanner.nextLine();

        System.out.print("Enter Age : ");
        age = (int) scanner.nextInt();

        System.out.print("Enter Mobile : ");
        mobile = scanner.nextLong();

        System.out.print("Enter CGPA : ");
        cgpa = scanner.nextDouble();

        scanner.close();

        System.out.println("Detais : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender :" + gender.charAt(0));
        System.out.println("Mobile : " + mobile);
        System.out.println("CGPA : " + cgpa + "%");

    }
}