interface end_game{

    public void print_ts_lyric();
    public String tswift = "..so it goes";

}

class reputation implements end_game{
    public void print_ts_lyric(){

        System.out.println("Look what you made me do");
    }

    public void so_it_goes(){
        System.out.println(tswift);
    }
}




public class interface_sample {
    public static void main(String[] args) {


        System.out.println("hellow world");

        reputation obj = new reputation();
        obj.print_ts_lyric();
        obj.so_it_goes();
    }
}
