package day_8;

import java.util.Random;
import java.util.Scanner;

public class DiceApp {

public static void main(String[] args) {
		
		Scanner scnr= new Scanner(System.in);
		Boolean rollAgain= true;
		String response;
		
		while( rollAgain == true) {
		System.out.println("How many sides should each die have?");
		 int numberOfSide= ((scnr.nextInt())/2);
		 
		 System.out.println( generateRandomDieRoll(numberOfSide));
		 System.out.println( generateRandomDieRoll(numberOfSide));
		 
	 
		 System.out.println("Would you like to roll again? y/n");
		    response= scnr.next();
		    rollAgain=response.equalsIgnoreCase("y");
		}
		System.out.println("Goodbye!");
	}
	
    public static int generateRandomDieRoll(int numberOfSide) {
  	  int dice=(int)((Math.random() * numberOfSide)+1);
  	  return dice ; 
    }
		 
  }
