import java.util.ArrayList;


public class array_list {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add(1, "Raspberry");
        fruits.add("Banana");
        fruits.add("Blueberry");
        fruits.add("Blackberry");
        fruits.add(5, "Kiwi");

        String search_str = "B";


        // Printing all items in ArrayList
        System.out.println("Printing all items in ArrayList:\n");

        System.out.println(fruits);

        // Iterating through an ArrayList
        System.out.println("\n\nIterating through an ArrayList:\n");

        for (int i = 0; i < fruits.size(); i++)
            System.out.println(fruits.get(i));

        System.out.println("\n\nChecking if ArrayList starts with " + search_str + "\n");

        for (int i = 0; i < fruits.size(); i++){
            if (fruits.get(i).startsWith(search_str)){
                System.out.println(fruits.get(i));
            }
        }
        
        String itemToBeSearched = "Banana"; 

        System.out.println("\n\nSearching for index of " + itemToBeSearched + "\n");

        boolean search = fruits.contains(itemToBeSearched);

        // Checking if ArrayList contains an item

        if (search == true){
            System.out.println(fruits.indexOf(itemToBeSearched));
        }

        ArrayList<String> sample = new ArrayList<String>();

        sample.add("Blueberry");
        sample.add("Orange");
        sample.add("Taylor Swift");

        System.out.println(fruits.containsAll(sample));

        
    }
}