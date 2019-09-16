package com.anoop.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
	
	public ReverseArray(int arraySize) {
		int [] newArray = CommonUtils.generateArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array : " + Arrays.toString(newArray));
		long nano_startTime = System.nanoTime(); 
		System.out.println("Reversed Array : " + Arrays.toString(reverseArrayLoop(newArray)));
		long nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		System.out.println("*** Reversing back using List and reverse method of collection class"); 
		nano_startTime = System.nanoTime();
		System.out.println("Array after reversing back: " + Arrays.toString(reverseArrayMethod(newArray)));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
	}
	
	/*
	 * Method to reverse by looping through the array 
	 * Time Complexity : O(n)
	 */
	public static int[] reverseArrayLoop(int[] newArray) {
		// Looping through the first half of the array (till the mid point)
		// and swapping the corresponding element in the other half of the array
        int loopCount = 0;
		for(int i=0; i<newArray.length/2; i++){
    	  int temp = newArray[i];
    	  newArray[i] = newArray[newArray.length -i -1];
    	  newArray[newArray.length -i -1] = temp;
    	  loopCount = i+1;
    	  //System.out.println("Loop Count: "+ (i+1));
    	}
		System.out.println("Total Loop Count: "+ loopCount);
        return newArray;
    }
	
	/*
	 * Method to reverse by using lists and collections method and array streams
	 */
	public static int[] reverseArrayMethod(int[] newArray)  {
		//Only available Java 8 onwards
		List<Integer> listOfNumbers = Arrays.stream(newArray).boxed().collect(Collectors.toList());
	    Collections.reverse(listOfNumbers);
	    int[] arrNew = listOfNumbers.stream().mapToInt(i -> i).toArray();
	    return arrNew;
	} 
}
