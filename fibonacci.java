class fibonacci {

    public static void main (String[] args){

        System.out.println("Reg Number: \t 312310104167\n");

        // Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 1, prev;

        for (int i = 0; i< 10; i++){

            System.out.print(num1 + " ");

            prev = num1;

            num1 = num2;
            num2 = prev + num2;

            
        }

    }

}