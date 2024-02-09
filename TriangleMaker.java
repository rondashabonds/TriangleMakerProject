import java.util.Scanner; 

public class TriangleMaker {
   public static void main(String[] args) {
	   // Create a Scanner object to read user input
	   Scanner scanner = new Scanner(System.in);
	   
	   // Prompt the user to enter the size of the triangle 
	   System.out.println("Welcome to Triangle Maker! Enter the size of the triangle:");
	   
	   // Read the user input as an integer 
	   int size = scanner.nextInt();
	   
	   // Draw the triangle 
	   for (int i = 1; i <= size; i++) {
		   // Print the current row 
		   for (int j = 1; j <= i; j++) {
			   System.out.print("*");
		   }
		   System.out.println(); // Move to the next line 
		   
		   // If we have reached the peak of the triangle, start decreasing the number of asterisk per row 
		   if (i == size) {
			   for (int k = size - 1; k >= 1; k--) {
				   // Print the current row 
				   for (int l = 1; l <= k; l++) { 
					   System.out.print("*"); 
				   }
				   System.out.println(); // Move to the next line
			   }
		   } 
	   } 
	   
	   // Print "DONE!" to indicate that the program has finished 
	   System.out.println("DONE!");
				   }
			   
		   
	   
		// TODO Auto-generated method stub

	

}
