package com.anoop.sample;

public class FindNumberMNArray {
	
	public FindNumberMNArray(int row, int column, int find) {
		int [][] newArray = CommonUtils.generateSorted2DArray(row,column); // Method in CommonUtils class to generate a random array
		
		long nano_startTime = System.nanoTime(); 
		findElementLooping(newArray, find);
		long nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds by brute looping: " + (nano_endTime - nano_startTime));
		
		nano_startTime = System.nanoTime(); 
		findElement(newArray, find);
		nano_endTime = System.nanoTime();
		System.out.println(">>>>> Time taken in nano seconds by sinple algo: " + (nano_endTime - nano_startTime));
	}
	
	/*
	 * Method to find the number by looping through the array 
	 * Time Complexity : O(n)
	 */
	public static void findElementLooping(int arr[][], int findx) {
		int rows = arr.length;
		int cols = arr[0].length;        
        for (int i = 0; i < rows; ++i) {
	        for(int j = 0; j < cols; ++j) {
	        	 if (arr[i][j] == findx) { 
	                 System.out.println(""+findx+ " Found at " + i + " " + j); 
	                 return;
	             } 
	        }
	     }
        System.out.println(""+findx+" not found"); 
        return; 
    }
	
	/*
	 * Method to find the element by elimination rows or columns 
	 * Time Complexity : O(n)
	 */
	public static void findElement(int arr[][], int findx) {
		int rows = arr.length;
		int cols = arr[0].length;
		int i = 0, j = cols - 1; // set indexes for top right element 
        while (i < rows && j >= 0) { 
            if (arr[i][j] == findx) { 
                System.out.println(""+findx+ " Found at " + i + " " + j); 
                return;
            } 
            if (arr[i][j] > findx) 
                j--; 
            else // if arr[i][j] < findx 
                i++; 
            System.out.println(""+findx+ " NOT Found at " + i + " " + j); 
        } 
        System.out.println(""+findx+" not found"); 
        return; 
    }
}
