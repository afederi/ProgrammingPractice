package feb152020;

/**
 * 
 * @author Alex Federico
 * 
 * Description:
 *  You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:
 * 
 *   The elements of the first array are all factors of the integer being considered
 * 	 The integer being considered is a factor of all elements of the second array
 * 
 *  These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.
 * 
 *  For example, given the arrays a = [2,6] and b = [24,36] there are two numbers between them:  
 *  6 and 12. 6%2 = 0, 6%6 = 0,  24%2 = 0 and 36%6 = 0 for the first value. 
 *  Similarly 12%2, 12%6 = 0and 24%12 = 0, 36%12 = 0.
 * 
 */

import java.util.*;
import java.math.*;

public class BetweenTwoSets {
	
	private static Scanner scan  = new Scanner(System.in);
	
	public static int integerBetween(List<Integer> a, List<Integer> b){
		
		// Sorting each array to find the maximum value for array a and minimum value of array b
		Collections.sort(a);
		Collections.sort(b);
		
		// initializing variables for algorithm
		
		// itteration is used as an itterator for each while loop
		// first use will iterate between the largest balue of array a and lowest value of array b
		// second use will iterate between each value of ArrayList between
		int itteration = a.get(a.size()-1);
		
		// total counts the number of times a value is divisible by a value in arrays a and b
		int total =0;
		
		// counter records the total amount of numbers that meet both conditions of the problem
		int counter = 0;
		
		// between will find all values between the largest value of array a and lowest value of array b
		// and have at least satisfy the first condition of the problem
		List<Integer> between = new ArrayList<>();
		
		// Traverses through all numbers between the maximum value of array a and minimum value of array b
		// and compares each number to all values of array a. If the number is divisible by one element in array a, 
		// then a counter adds one to the value. If the counter is at least greater then the number of elements in array a, then
		// that number will then be added to ArrayList between and itteration adds 1 to its value and loops to the next iteration. Each iteration resets the counter value to 0.
		while(itteration <= b.get(0)){
			
			counter = 0;
			for(int i=0;i<a.size();i++){
				if(itteration % a.get(i) == 0){
					counter++;
				}
			}
			if(counter >= a.size()){
				between.add(itteration);
			}
			itteration++;
			
		}
		
		itteration = 0;
		
		// Traverses through all elements in ArrayList between and compares each value in between to all values of array b.
		// If the value in an element in array a is divisible to the current value in ArrayList between, then the counter add 1 to the value
		// If the counter is at least equal to the length of array b, then total adds 1. 
		while(itteration < between.size()){
			
			counter = 0;
			for(int i=0;i<b.size();i++){
				if(b.get(i) % between.get(itteration) == 0){
					counter++;
				}
			}
			if(counter >= b.size()){
				//System.out.print(between.get(itteration)+" ");
				total++;
			}
			itteration++;
		}
		//System.out.println("");
		
		//return the total of all numbers that satisfy all conditions of the problem
		return total;
	}
	public static void main(String[]args){
		
		
		//Grab the input for the number of elements for the two arrays
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		//Fill arr with values given by input
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(scan.nextInt());
		}
		
		//Fill brr with values given by input
		List<Integer> brr = new ArrayList<>();
		for(int i=0;i<m;i++){
			brr.add(scan.nextInt());
		}
		
		//call the integerBetween method and sending the values of arr and brr as parameters
		//then receiving a return value of the method and storing it in integer variable total
		int total = integerBetween(arr, brr);
		System.out.println(total);
	}

}
