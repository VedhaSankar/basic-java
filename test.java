class demo {

    int return_int(){

        int a = 23;
        return a;
    }

}



public class test {
    public static void main (String args[]){


        demo obj = new demo();
        int num = obj.return_int();

        System.out.println(num);

    }
}
