import java.util.Scanner;

public class IT24102205Lab4Q3 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Using the ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive." :
                        (number < 0) ? "The number is Negative." :
                        "The number is Zero.";
        
        // Display the result
        System.out.println(result);
        
        // Close the scanner object
        scanner.close();
    }
}
