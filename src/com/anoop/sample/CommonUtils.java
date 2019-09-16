package com.anoop.sample;

import java.util.Random;

public class CommonUtils {
	/*
	 * Method to generate a random Array of integers
	 */
	public static int[] generateArray(int n) {
      Random rd = new Random(); // creating Random object
      int low = 0;
      int high = 1000;
      if(n <= 0)
    	  n = 0;
      int[] arr = new int[n];
      if(n == 0)
    	  return arr;
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(high-low) + low;; // storing random integers in an array
      }
      return arr;
	}
	
	/*
	 * Method to generate an Array stating with running integers
	 * Starting with 1
	 */
	public static int[] generateIncrementedArray(int n) {
		if(n <= 0)
	    	  n = 0;
	      int[] arr = new int[n];
	      if(n == 0)
	    	  return arr;
      for (int i = 0; i < arr.length; i++) {
         arr[i] = i+1; // storing random integers in an array
      }
      return arr;
	}
	
	/*
	 * Method to generate a random Array of duplicate integers
	 */
	public static int[] generateDuplicateArray(int n) {
      Random rd = new Random(); // creating Random object
      int low = 0;
      int high = 1000;
      if(n <= 0)
    	  n = 0;
      int[] arr = new int[n];
      if(n == 0)
    	  return arr;
      int dupGen = rd.nextInt(n);
      if (dupGen == 0)
    	  dupGen = 1;
      int nDuplicate = n/dupGen;
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(high-low) + low;; // storing random integers in an array
         if(rd.nextBoolean() && i < arr.length-1) {
	         if(nDuplicate != 0 && i != arr.length ) {
	        	 nDuplicate--;
	        	 int prev = 0;
	        	 if(i > 1) {
	        		 prev = rd.nextInt(i-1);
	        	 }
	        	 i++;
	        	 arr[i] = arr[prev];
	         }
         }
      }
      return arr;
	}
	
	/*
	 * Method to generate a random Array of integers
	 */
	public static int[][] generateSorted2DArray(int row, int column) {
		int[][] new2DArray = new int[row][column];
		int counter = 1;
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++ ) {
				new2DArray[i][j] = counter;
				counter++;
			}
		}
		System.out.println("Original m x n Array:");
		for (int i = 0; i < new2DArray.length; ++i) {
	        for(int j = 0; j < new2DArray[i].length; ++j) {
	           System.out.print(new2DArray[i][j]+" ");
	        }
	        System.out.println();
	     }
		System.out.println("==============================");
		return new2DArray;
	}
}
