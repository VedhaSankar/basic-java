interface implement_interface {

    public void app();
    final int var = 10;
    
}

class all_implementations implements implement_interface{

    public void app() {
        System.out.println("The value of var is " + var);
    }
}

public class main_class{

    public static void main(String[] args)
    {

        implement_interface obj = new all_implementations();

        obj.app();
        
    }


}

  