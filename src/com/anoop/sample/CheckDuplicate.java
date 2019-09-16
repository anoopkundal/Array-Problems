package com.anoop.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckDuplicate {
	
	public CheckDuplicate(int arraySize) {
	       
		int [] newArray = CommonUtils.generateArray(arraySize); // Method in CommonUtils class to generate a random array
		System.out.println("Original Array - No Duplicate : " + Arrays.toString(newArray));
		long nano_startTime = System.nanoTime();
		System.out.println("Brute Looping - Duplicate: " + bruteLooping(newArray));
		long nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		nano_startTime = System.nanoTime();
		System.out.println("Using Set and List - Duplicate: " + checkDuplicateWithSet(newArray));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		nano_startTime = System.nanoTime();
		System.out.println("Using Set with Add - Duplicate: " + checkDuplicateWithAdd(newArray));
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds: " + (nano_endTime - nano_startTime));
		
		int [] newDuplicateArray = CommonUtils.generateDuplicateArray(arraySize); // Method in CommonUtils class to generate a random array with duplicates
		System.out.println("Original Array - Duplicate : " + Arrays.toString(newDuplicateArray));
		nano_startTime = System.nanoTime();
	    System.out.println("Brute Looping - Duplicate: : " + bruteLooping(newDuplicateArray));
	    nano_startTime = System.nanoTime();
	    System.out.println("Using Set and List - Duplicate: " + checkDuplicateWithSet(newDuplicateArray));
	    nano_startTime = System.nanoTime();
	    System.out.println("Using Set with Add - Duplicate: " + checkDuplicateWithAdd(newDuplicateArray));

	 }
	  
	    /*
	     * Method to loop through the array - Brute force
	     * Time Complexity : O(n^2)
	     */
	    public static boolean bruteLooping(int[] input) {
	        for (int i = 0; i < input.length; i++) {
	            for (int j = 0; j < input.length; j++) {
	                if (input[i] == (input[j]) && i != j) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    /*
	     * Method using set
	     * Set doesn't contain duplicate
	     * Therefore size must be less for an array which contains duplicates
	     */
	    public static boolean checkDuplicateWithSet(int[] input){
	        List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
	        Set<Integer> inputSet = new HashSet(inputList);
	        if(inputSet.size()< inputList.size()) {
	            return true;
	    	}
	        return false;
	    }
	  
	    /*
	     * Method using set
	     * Set doesn't allow duplicates add() it will return false
	     */
	    public static boolean checkDuplicateWithAdd(int[] input) {
	        Set checkSet = new HashSet();
	        for (int i : input) {
	            if (!checkSet.add(i)) {
	                return true;
	            }
	        }
	        return false;
	    }

}


