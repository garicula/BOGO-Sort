// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #4.5 (Extra Credit)
// Due Date: 03/22/2022   -->   Date Finished: 03/18/2022
// File Name: MorleyGarrickBogoSort

// This program will sort the given array using the Bogo Sort features

// The inputs for this program include: The array of 12 numbers (given), the number of times the array is shuffled in
// the "shuffle" function (11, since 12 - 1 = 11), and the length of the array (can be found with "array.length")

// The outputs for this program include: The sorted array called "Garrick Morley's Sorted Array" and the order of it is
// {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5} when it's properly sorted

// The variables used in this program include: array, i, x, and temporary_holder (used in the element swapping function)

// Package name to move data between files
package com.alpha;

// Creates Java class called BogoSort
public class BogoSort
{
    // Function to sort the array the correct number of times
    void shuffle(int[] array)
    {
        // Math.random() returns a value that's a double and positive which will be used to shuffle the array
        for (int i = 1; i <= 11; i++)
            swap(array, i, (int)(Math.random() * i));
    }

    // This is the Bogo Sort algorithm that uses the other functions in this class to sort the array
    void bogoSort(int[] array)
    {
        // Attempt to sort the array and if that fails, attempt it again
        while (isSorted(array) == false)
            shuffle(array);
    }

    // Function to swap out two elements within the array
    void swap(int[] array, int i, int x)
    {
        // The integer "temporary_holder" is needed as the third wheel of the usual "two element swapping" method
        int temporary_holder = array[i];
        array[i] = array[x];
        array[x] = temporary_holder;
    }

    // Function to check if the array is sorted
    // This is the given function from the assignment page, I didn't want to risk changing it and losing any points
    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++)
            if (array[i] < array[i - 1])
            {
                return false;
            }
        return true;
    }

    // Function that prints the array, used once the array is finished and properly sorted
    void printArray(int[] array)
    {
        //Create a for loop to print the array items for as many times as the array is long
        for (int i = 0; i < array.length; i++)
        {
            // Leave an empty gap between each array integer for better visibility
            System.out.print(array[i] + " ");
        }
        // Actually print out the whole sorted array with this part of the function
        System.out.println();
    }

    // Main function to run Bogo Sort and sort the array
    public static void main(String[] args)
    {
        // Input the array that's going to be sorted right here
        int array[] = {5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4};

        // Create a new BogoSort object called "sorts"
        BogoSort sorts = new BogoSort();

        // Uses the bogoSort function to sort it
        sorts.bogoSort(array);

        // Print out the manually entered part before the sorted array
        System.out.print("Garrick Morley's Sorted Array is in this order: ");

        // Print out the sorted array itself
        sorts.printArray(array);
    }
}

// Close out the program as a whole with these last end brackets
