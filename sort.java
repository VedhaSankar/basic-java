public class sort {
	public static void main(String[] args) {        

        System.out.println("Reg Number: \t 312310104167\n");
        
        //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    

        System.out.println("\n");
    }    
}


// import java.util.Scanner;

// public class sort {
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int arr[], num;

//         System.out.println("Enter length of array: \n");
//         num = scan.nextInt();

//         for (int i = 0; i < num; i++)
//             arr[i] = scan.nextInt();

//         for (int i = 0; i < num; i++)
//             System.out.println(arr[i]);

//     }
// }
