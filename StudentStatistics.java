
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
    
    // Method Display Results.
    public void CalculateResults() {
        double lowestMark = findLowestMark();
        double highestMark = findHighestMark();
        System.out.println("Lowest Mark: " + lowestMark);
        System.out.println("Highest Mark: " + highestMark);
    }
    
    
    // Method to find the lowest Mark.
    public double findLowestMark() {
        double lowMark = this.studentMarks[0];
        
        for (double mark : studentMarks){
            if (mark < lowMark) {
                lowMark = mark;
            }
        }
        return lowMark;
    }
    
    // Method to find the highest Mark.
    public double findHighestMark() {
        double highMark = this.studentMarks[0]; //Intialize the 'highMark' Variable with first element of studentsMark array.
        
        for(double mark : studentMarks){ 
            if(mark > highMark) { // Condition to check if Current 'mark' is greater than current 'highMark'.
                highMark = mark; // If 'mark' is greater update 'highMark'. 
            }
        }
        return highMark; // Return latest highest mark in the array.
    }
        
    // Method to find the Mean.   
    public double findMean() {
    double sum = 0; //initialize varaible 'sum'.
    
    for (double mark : studentMarks){
        sum += mark; // Iterate mark of the student and add to the sum.
    }
    double mean = sum / studentMarks.length; // Calculate mean.
    System.out.println("Mean of the Studentmarks: " + mean); // Print Mean to the Screen.
    return mean; // return the mean output.
}
    
    // Method to find the StandardDeviation.
    public double findStandardDeviation() {
    double mean = findMean(); // Store the mean value in 'mean' variable by calling findMean function.
    double standardDeviation = 0; // Initialize the 'standardDeviation' variable to collect the squared differences.

    for (double mark : studentMarks) { 
        standardDeviation += Math.pow(mark - mean, 2); // calculate squared differences between each mark and mean and raise to the power of 2 and store in 'standardDeviation'.
    }
    standardDeviation = Math.sqrt(standardDeviation/studentMarks.length); // calculate the square root of the average of squared differences.
    System.out.println("Standard Deviation of the Studentmarks: " + standardDeviation); // Print the standardDeviation to the screen.
    
    return standardDeviation; // Return the calculated standardDeviation value.
}
    
    }
    
    
    
    
    

