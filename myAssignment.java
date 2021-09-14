import java.util.Scanner;
import  assignmentPackage.*;

interface implement_interface {

    public void app();
    final int var = 10;
    
}

class all_implementations implements implement_interface{

    public void app() {
        System.out.println("The value of var is " + var);
    }
}

class A {

    public void content1(char var){

        System.out.println("Inside class A " + var);
    } 

}


class B extends A {

    public void content2(){

        char var = 'B';

        content1(var);

        System.out.println("Inside class B");
    } 

}


class C extends  A {

    public void content3(){

        char var = 'C';

        content1(var);

        System.out.println("Inside class C");
    } 

}


class AA {

    public void content1(){

        System.out.println("Inside class AA");
    } 

}


class BB extends AA {

    public void content2(){

        System.out.println("Inside class BB");
    } 

}


class CC extends BB {

    public void content3(){

        System.out.println("Inside class CC");
    } 

}


public class myAssignment {

    public static void main(String args[]){

        // implementing interface

        implement_interface intApp = new all_implementations();

        intApp.app();

        // implementing hierarcial inheritence

        B obj1 =  new B();
        C obj0 = new C();

        obj1.content2();
        obj0.content3();

        // implementing multiple inheritence

        CC c_obj = new CC();

        c_obj.content1();
        c_obj.content2();
        c_obj.content3();

        // calling a package

        myPackage obj = new myPackage();
        obj.stuff();

    }
    
}
