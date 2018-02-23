package test;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Enter raidus of Circle:");
		Scanner sc= new Scanner(System.in);
		//Radius of triangle.
		
		double radius=sc.nextDouble();
	    double area= Math.PI*(radius*radius);
	
		
		System.out.println("Area of the circle is: "+area);
		System.out.println("Half Area of the circle is: "+area/2);

	}
}
