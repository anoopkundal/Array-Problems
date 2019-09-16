package com.anoop.sample;
import java.util.Scanner;

/*
 * Main entry point of the project
 * Based on the argument on command line the specific class is invoked
 */
public class MainClass {
	public static void main(String args[])  {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		if(args.length == 0)
		{
			System.out.println("==============================");
			System.out.println("To execute -> Checking Duplicates in an array Enter : 1" );
			System.out.println("To execute -> Reversing an array Enter : 2" );
			System.out.println("To execute -> Find a number in a sorted mxn array Enter : 3" );
			System.out.println("To execute -> Replace each element with the sum of previous elements : 4" );
			System.out.println("To execute -> Find a number in an array Enter : 5" );
			System.out.println("==============================");

			//  prompt for the user's to enter a number
		    System.out.print("Enter number to run the program: ");
		    input = scanner.nextInt();
		}
		else {
		//  prompt for the user's to enter a number
		    System.out.print("Enter number to run the program: ");
		    input = scanner.nextInt();
		}
		if(input == 1) {
			System.out.println("==============================");
			System.out.print("Enter the size of array to generate: ");
			int arrSize = scanner.nextInt();
			CheckDuplicate cDuplicate = new CheckDuplicate(arrSize);
			System.out.println("==============================");
		    String[] arr = new String[] {"1"};
		    MainClass.main(arr);
		}
		else if(input == 2){
			System.out.println("==============================");
			System.out.print("Enter the size of array to generate: ");
			int arrSize = scanner.nextInt();
			ReverseArray revArray = new ReverseArray(arrSize);
			System.out.println("==============================");
		    String[] arr = new String[] {"1"};
		    MainClass.main(arr);
			
		}
		else if(input == 3){
			System.out.println("==============================");
			System.out.print("Enter the size of m x n Array");
			System.out.print("Enter the size of array - rows to generate: ");
			int arrRows = scanner.nextInt();
			System.out.print("Enter the size of array - colums to generate: ");
			int arrColumns = scanner.nextInt();
			System.out.print("Enter the number to find in the array: ");
			int findNumber = scanner.nextInt();
			FindNumberMNArray mnArray = new FindNumberMNArray(arrRows, arrColumns,findNumber);
			System.out.println("==============================");
		    String[] arr = new String[] {"1"};
		    MainClass.main(arr);
			
		}
		else if(input == 4){
			System.out.println("==============================");
			System.out.print("Enter the size of array to generate: ");
			int arrSize = scanner.nextInt();
			SumArray sumArray = new SumArray(arrSize);
			System.out.println("==============================");
		    String[] arr = new String[] {"1"};
		    MainClass.main(arr);
			
		}
		else if(input == 5){
			System.out.println("==============================");
			System.out.print("Enter the size of array to generate: ");
			int arrSize = scanner.nextInt();
			System.out.print("Enter the number to find in the array: ");
			int findNumber = scanner.nextInt();
			FindNumberInArray mnArray = new FindNumberInArray(arrSize, findNumber);
			System.out.println("==============================");
		    String[] arr = new String[] {"1"};
		    MainClass.main(arr);
			
		}
		else {
			System.out.println("==============================");
			System.out.println("Wrong Input please check");
		    String[] arr = new String[0];
		    MainClass.main(arr);
		}
	}

}
