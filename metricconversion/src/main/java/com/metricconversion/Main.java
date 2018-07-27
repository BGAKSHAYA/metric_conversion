/**.
 * This package contains an immutable class Student
 */
package com.metricconversion;

import java.util.Scanner;

/**.
 * @author Akshaya_Gowri
 *
 */

public class Main {
	public static void main(String[] args) {
		
	    /** consoleScanner opens a input stream from console. */
	    Scanner consoleScanner = new Scanner(System.in);
		int source, destination;
	    do {
			System.out.println("\t** METRIC CONVERSION **");
			System.out.println("\t** SOURCE **");
            System.out.println("\t 1. Feet");
            System.out.println("\t 2. Meter");
            System.out.println("\t 3. Inch");
            System.out.println("\t 4. Exit");
            System.out.println("Enter your choice");
            source= consoleScanner.nextInt();
            
            if (source==4) break;
            
            System.out.println("\t** Destination **");
            System.out.println("\t 1. Feet");
            System.out.println("\t 2. Meter");
            System.out.println("\t 3. Inch");
            System.out.println("Enter your choice");
            destination= consoleScanner.nextInt();
            
            TypeConversion metricObject = null; //interface object
            
            if(source==1 && destination==2)      metricObject = new FeetToMeter();
            else if(source==1 && destination==3) metricObject = new FeetToInch();
            else if(source==2 && destination==1) metricObject = new MeterToFeet();
            else if(source==2 && destination==3) metricObject = new MeterToInch();
            else if(source==3 && destination==1) metricObject = new InchToFeet();
            else if(source==3 && destination==2) metricObject = new InchToMeter();
            else {
            	System.out.println("Wrong choice");
            	continue;
            }
            System.out.println("Enter the input metric value"); 
            
            System.out.println(metricObject.changeMetric(consoleScanner.nextDouble()));
		} while(true);
	    
	    System.out.println("Program Exited");
        consoleScanner.close();

	}
}

