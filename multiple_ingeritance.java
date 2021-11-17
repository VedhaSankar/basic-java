import java.util.Scanner;

interface green_color{
    public void color_mint();
    // public int hex = 28;
}

interface blue_color {
    public void color_navy();
}

class choose_color implements green_color, blue_color{

    public void color_mint(){
        System.out.println("You've chosen mint");   
    }


    public void color_navy(){
        System.out.println("You've chosen navy blue");;
    }


    void get_color(){
        System.out.println("Choose either blue or green");
        Scanner in = new Scanner(System.in);

        String color = in.next();

        if (color.equals("blue"))
            color_navy();
        

        else if (color.equals("green"))
            color_mint();

        in.close();
    }

}


public class multiple_ingeritance {
    public static void main(String[] args) {

        choose_color obj = new choose_color();
        obj.get_color();
        
    }
}
