package com.anoop.sample;

import java.util.Arrays;

public class SumArray {
	
	public SumArray(int arraySize) {
		int [] newArray = CommonUtils.generateArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array : " + Arrays.toString(newArray));
		long nano_startTime = System.nanoTime(); 
		System.out.println("Creating Sum Array : " + Arrays.toString(sumInArrayLoop(newArray)));
		long nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		
		int [] newArray1 = CommonUtils.generateIncrementedArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array : " + Arrays.toString(newArray1));
		nano_startTime = System.nanoTime(); 
		System.out.println("Creating Sum Array : " + Arrays.toString(sumInArrayLoop(newArray1)));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		
		int [] newArray2 = CommonUtils.generateIncrementedArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array : " + Arrays.toString(newArray2));
		nano_startTime = System.nanoTime(); 
		System.out.println("Creating New Sum Array : " + Arrays.toString(sumOutArrayLoop(newArray2)));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
	}
	
	/*
	 * Method to sum the elements by looping through the array 
	 * O(n) problem
	 */
	public static int[] sumInArrayLoop(int[] newArray) {
		// Looping through the and replacing elements with the sum of the previous elements
		for(int i=1; i<newArray.length; i++){
    	  newArray[i] = newArray[i-1]+newArray[i];
    	}
        return newArray;
    }
	
	/*
	 * Method to sum the elements by looping through the array 
	 * O(n) problem
	 */
	public static int[] sumOutArrayLoop(int[] newArray) {
		// Looping through the and creating a new array with the sum of the previous elements
		int[] sumArray = new int[newArray.length];
		for(int i=0; i<newArray.length; i++){
			if(i==0)
				sumArray[i] = newArray[i];
			else
				sumArray[i] = sumArray[i-1] + newArray[i];
    	}
        return sumArray;
    }

}
