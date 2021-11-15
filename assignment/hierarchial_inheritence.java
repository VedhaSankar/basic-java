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


public class hierarchial_inheritence {
    public static void main (String args[])
    {
        B obj1 =  new B();
        C obj0 = new C();

        obj1.content2();
        obj0.content3();


    }


}
