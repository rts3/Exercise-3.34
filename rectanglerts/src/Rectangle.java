import java.util.Scanner;
public class Rectangle {
	public static void main(String[]args){
		int width, height,perimeter;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter the width: ");
		System.out.println("Enter the height: ");
		width = keyboard.nextInt();
		height= keyboard.nextInt();
		perimeter = (2*width+2*height);
		System.out.println("The perimeter of the rectangle: "+perimeter);
		
	}
}
