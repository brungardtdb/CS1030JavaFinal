//Author: David Brungardt
/** This Java program takes an age value from the user
and uses that number to calculate the user's age in 
months, days, hours, minutes, and seconds. The application
then displays those values back to the user*/

import java.util.*;
import java.lang.Float;
import java.io.*;
import java.util.Scanner;

public class Final
{
	public static void main(String[] args)
	{

		// Create a variable of type Scanner to get input
        Scanner console = new Scanner(System.in); 

		

		// Declare sentinal value used to terminate loop
        String sentinalValue = "";            
                 

       do
       {           
                         
            // Get user's first name
            System.out.println("Please enter your first name.");
            String firstName = console.next();

            // Get user's last name
            System.out.println("Please enter your last name.");
            String lastName = console.next();

               boolean isNumber;

        	
                
              do
              {
              	// Get users age
            	System.out.println("Please enter the your age in years.");

               	// Check to see if value entered is numeric
               	if (console.hasNextInt())
               	{
               		isNumber = true;
               		int age = console.nextInt();

               		int ageMonths = age * 12; // Age in months
					int ageDays = age * 365; // Age in days
					int ageHours = ageDays * 24; // Age in hours
					int ageMinutes = ageHours * 60; // Age in minutes
					int ageSeconds = ageMinutes * 60; // Age in seconds

               	  	// Print user's name and age
               	  	System.out.print("\n" + lastName + ", "); System.out.println(firstName);
               	  	System.out.println(age + " years old");
               	  	System.out.println(ageMonths + " months old");
               	  	System.out.println(ageDays + " days old");
               	  	System.out.println(ageHours + " hours old");
               	  	System.out.println(ageMinutes + " minutes old");
               	  	System.out.println(ageSeconds + " seconds old\n"); 

               	  	              	  	
               	}
               	else
               	{
               		isNumber = false;
               		// Display error message if no numeric value was given
               		System.out.println("No valid input was given.");  
               		console.next();             	         
               	}

              }while(isNumber == false);         
                    
    			
            		// Ask user if they would like to continue
       	 			System.out.println("Would you like to enter another person's age? (Y or N)");
        			sentinalValue = console.next();	

        }while (sentinalValue.equals("Y"));


	}
}