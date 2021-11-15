import java.util.regex.*;

public class regex_methods {
    public static void main(String args[]){


        // 1st way

        Pattern p = Pattern.compile (".s");
        Matcher m = p.matcher("as");

        boolean b = m.matches();


        // 2nd way

        boolean b2 = Pattern.compile("^c*").matcher("cse").matches();

        // 3rd way 

        boolean b3 = Pattern.matches(".s", "as");


        // printing everything

        System.out.println(b + " " + b2 + " " + b3);

    }
}
