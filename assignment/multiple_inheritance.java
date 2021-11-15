class A {

    public void content1(){

        System.out.println("Inside class A");
    } 

}


class B extends A {

    public void content2(){

        System.out.println("Inside class B");
    } 

}


class C extends B {

    public void content3(){

        System.out.println("Inside class C");
    } 

}


public class multiple_inheritance {
    public static void main (String args[])
    {

        C obj = new C();

        obj.content1();
        obj.content2();
        obj.content3();

    }


}
