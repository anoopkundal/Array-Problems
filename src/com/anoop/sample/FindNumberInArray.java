package com.anoop.sample;

import java.util.Arrays;

public class FindNumberInArray {
	
	public FindNumberInArray(int arraySize, int find) {
		int [] newArray = CommonUtils.generateIncrementedArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array : " + Arrays.toString(newArray));
		long nano_startTime = System.nanoTime(); 
		System.out.println("Using brute loop to find "+find+" in the Array. Found: " +findInArrayLoop(newArray, find));
		long nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		
		nano_startTime = System.nanoTime(); 
		System.out.println("Using Array list contains to find "+find+" in the Array. Found: " +contains(newArray, find));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
	}
	
	/*
	 * Method to sum the elements by looping through the array 
	 * Return true as soon as the number is found
	 */
	public static boolean findInArrayLoop(int[] newArray, int find) {
		// Looping through the array and finding the required number
		for(int i=1; i<newArray.length; i++){
    	  if(newArray[i] == find)
    		  return true;
    	}
        return false;
    }
	
	/*
     * Convert array to ArrayList.
     * The use contains() method of ArrayList class.
     */
    public static boolean contains(int[] array, int find) {
        return Arrays.asList(array).contains(find);
    }

}
