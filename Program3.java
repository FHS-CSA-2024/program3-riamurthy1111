//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner (System.in); //Create a Scanner object
        //Create variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        //Ask for user input
        System.out.println("Please enter the length: ");
        // Get input
        length = myScanner.nextInt();
        
        System.out.println("Please enter the width: ");
        // Get input
        width = myScanner.nextInt();
        
        //Calculate
        
        //Output
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + length*width);
        System.out.println("The periemter is: " + 2*length + 2*width);
        
        
    }
}



//Paste console output below:
/*
Please enter the length: 
11
Please enter the width: 
11
The length is: 11
The width is: 11
The area is: 121
The periemter is: 2222
*/

