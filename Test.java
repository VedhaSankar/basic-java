class Test { 
    public static void main(String args[]) 
    { 
        A a = new A("string"); 
        a.print(); 
    } } 

    class A { 
        String s; 

        A (String s) { 
            this.s=s; 
        } 

        public void print() { 
            System.out.println(s); 
        } }