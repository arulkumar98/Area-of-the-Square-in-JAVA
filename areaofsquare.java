import java.util.Scanner;
//I going to use scanner
class SquareOfArea {
   public static void main (String[] args)
   {
       System.out.println("Enter Side of Square:");
       //Capture the user's input
       Scanner sc = new Scanner(System.in);
       //Storing the captured value in a variable
       double side = sc.nextDouble(); // user can also use the floating point number.
       //Area of Square = side*side
       double area = side*side; 
       System.out.println("Area of Square is: "+area);
   }
}