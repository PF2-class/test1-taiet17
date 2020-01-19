import java.util.Scanner;

import pc1.RoomCarpet;
import pc1.RoomDimension;

public class CarpetCalculatorDemo {

	public static void main(String[] args) {		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the dimensions of a room in feet");
		System.out.print("Enter the length of room: ");
		double length = keyboard.nextDouble();
		
		System.out.print("Enter the width of room: ");
		double width = keyboard.nextDouble();
		
		System.out.print("The price per square foot: ");
		double pricePerSquareFoot = keyboard.nextDouble();
		
		RoomDimension dimension = new RoomDimension(length, width);
		RoomCarpet carpet = new RoomCarpet(dimension, pricePerSquareFoot);
		
		System.out.println(carpet.toString());

	}

}
