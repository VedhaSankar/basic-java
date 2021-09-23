class something 
{
    public double getSalary()
    {
        // double salary = 50000;
        return salary;

    }

    private double salary = 5000;
}

public class super_keyword extends something{

    public double getSalary(){

        double bonus = 500;
        double baseSalary = super.getSalary();
        double salary = baseSalary + bonus;
        return salary;
    }

    public static void main(String[] args)
    {

        something obj       = new something();
        super_keyword obj2  = new super_keyword();
        double salary = obj.getSalary();
        double salary2 = obj2.getSalary();
        System.out.println(salary);
        System.out.println(salary2);
    }
}