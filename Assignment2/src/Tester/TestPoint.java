package Tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x and y coordinates for Point 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter x and y coordinates for Point 2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        Point2D p1 = new Point2D(x1,y1);
        Point2D p2 = new Point2D(x2,y2);
        
        System.out.println("Details of Point 1 : "+p1.getDetails());
        System.out.println("Details of Point 2 : "+p2.getDetails());
        
        
        if (p1.isEqual(p2)) {
            System.out.println("Points are located at the same position.");
        } else {
            
            double distance = p1.calculateDistance(p2);
            System.out.println("Points are located at different positions.");
            System.out.printf("Distance between Point 1 and Point 2: %.2f%n", distance);
        }
        	sc.close();
	}

}
