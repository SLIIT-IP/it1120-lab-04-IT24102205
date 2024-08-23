import java.util.Scanner;

public class IT24102205Lab4Q2
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = getValidMarks(scanner);
        
        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = getValidMarks(scanner);
        
        // Input and validate percentage for exam marks
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = getValidPercentage(scanner);

        // Input and validate percentage for lab submission marks
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = getValidPercentage(scanner);

        // Validate that the total percentage is 100
        if (examPercentage + labPercentage != 100) 
		{
            System.out.println("The percentage must add up to 100. Terminating program.");
        } else 
		{
            // Calculate the final mark
            double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
            System.out.printf("The final exam mark is: %.2f%n", finalMark);
        }
        
        // Close the scanner object
        scanner.close();
    }

    // Method to get and validate marks (0-100)
    private static double getValidMarks(Scanner scanner) 
	{
        double marks;
        while (true) 
		{
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) 
			{
                break;
            } else 
			{
                System.out.print("Invalid input for exam marks. Terminating program. ");
            }
        }
        return marks;
    }

    // Method to get and validate percentage weight (positive value)
    private static double getValidPercentage(Scanner scanner) 
	{
        double percentage;
        while (true) 
		{
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) 
			{
                break;
            } else 
			{
                System.out.print("Invalid input. Please enter a percentage value between 0 and 100: ");
            }
        }
        return percentage;
    }
}
