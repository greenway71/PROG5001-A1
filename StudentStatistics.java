
/**
 * Write a description of class StudentStatistics here.
 *
 * @author (Sandesh Adhikari)
 * @version (0.1)
 */
import java.util.Scanner; // Importing Scanner Class to do input and output.
public class StudentStatistics
{
    double[] studentMarks = new double[30]; //Initializing studentMarks varaible for 30 students
    double mark; // Initialize mark variable
    
    public void RecieveMarks(){
        Scanner scanner = new Scanner(System.in); // Initialize scanner object to read input.
        
        System.out.print("Enter the Assignment Name: "); // Allow user to input the Assignmnet Name
        String assignmentName = scanner.nextLine();
        
        for (int i =0; i < 30; i++) {
            do {
                System.out.print("Enter the Student Marks " + (i+1) + "(0-30): "); // prompt the user to enter the student marks
                mark = scanner.nextDouble();
                
                // Inform User about invalid Input and allow to enter valid marks again.
                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid Input.Please Enter Marks range between 0 to 30");
                } else {
                    studentMarks[i] = mark; //If above condition is not met, store the marks in studentMarks array.
                }
            
            
            
            }while (mark < 0 || mark > 30); //Using do-while loop to prompt the user to enter the valid marks.
        
        }
        scanner.close(); // Closing the prompt after getting 30 student marks.
    
    }
    
}
