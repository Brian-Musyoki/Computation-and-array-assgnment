import java.util.Scanner;

public class Valuesarray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            //Array to store user's input
            int[] values = new int[15];
            
            //Enter only 15 integer values
            System.out.println("Enter only 15 integer values:");

            //Storing the values in the array
            for (int i = 0; i < 15; i++){
                System.out.print("Value " + (i+1) + ": ");
                values[i] = input.nextInt();
            }
            //Values stored in the array
            System.out.println("Values stored in array:");
            for (int i = 0; i < 15; i++){
                System.out.println("Value " + (i+1) + ": " + values[i]);
            }

            //Enter a number to search in the array
            System.out.print("Enter a number to search in the array:");
            int searchnumber = input.nextInt();

            //Searching for the value in the array
            boolean numberfound = false;
            int index = 1;
            for (int i = 1; i < 15; i++){
                if (values[i] == searchnumber){
                    numberfound = true;
                    index = i;
                    break;
                }
            }

            //Search results
            if (numberfound){System.out.println("The number is found at index " + index);
            }
                else {System.out.println("Number not found in this array");
            }

            //Values stored in the array in reverse order
            System.out.println("Values stored in reverse order:");
            for (int i = 14; i >= 0; i--){
                System.out.println("Value " + (i+1) + ": " +values[i]);
            }

            //Sum and product of values in the array
            int sum = 0;
            int product = 0;
            for (int i = 0; i < 15; i++){
                sum += values[i];
                product *= values[i];
            }
            
            //Sum and product of elements in the array
            System.out.println("Sum of elements in the array: " + sum);
            System.out.println("Product of elements in the array: " + product);
        }
    }
    
}
