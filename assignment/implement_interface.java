package assignment;

interface implement_interface {

    void app();
    final int var = 10;
    
}

class main_class implements implement_interface{

    public void app() {
        System.out.println("The value of var is " + var);
    }

    public static void main (String[] args){

        implement_interface obj = new main_class();

        obj.app();

    }


}