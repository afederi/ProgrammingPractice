package feb152020;

/**
 * 
 * @author Alex Federico
 * 
 *Description:
 * 
 * You are given an array of n integers ar =[ar[0],ar[1],...,ar[n-1], and a positive integer, k. 
 * Find and print the number of (i,j) pairs where  i<j and ar[i] + ar[j] is divisible by k .
 *
 * For example, ar = [1,2,3,4,5,6] and k=5. 
 * Our three pairs meeting the criteria are [1,4], [2,3] and [4,6].
 *
 *Function Description
 *
 * Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.
 *
 * divisibleSumPairs has the following parameter(s):
 *
 *  n: the integer length of array ar
 *  ar: an array of integers
 *  k: the integer to divide the pair sum by
 *
 */

import java.util.*;

public class DivisibleSumPairs {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static int divisibleSumPairs(int n, int k, int[] ar) {
		
		// total is the number of (i,j) pairs that are divisible by k
		int total = 0;
		
		// a nested loop that traverses through all (i,j) pairs where i<j
		// if the total of and (i,j) pair is divisible by k then total increments by 1
		for(int i=0; i<ar.length-1;i++){
			for(int j=i+1; j<ar.length;j++){
				if((ar[i]+ar[j])%k==0){
					total++;
				}
			}
		}
		
		//returns the value of total
		return total;

	}
	public static void main(String[]args){
		
		// grabs the input for the number of elements in array ar
		int n = scan.nextInt();
		
		// grabs the input and stores it in k
		int k = scan.nextInt();
		
		// create a new array with n elements
		int[] ar = new int[n];
		
		// fills the array with values from input
		for(int i=0; i<n ;i++){
			ar[i] = scan.nextInt();
		}
		// calls the divisibleSumPairs method with n, k, and ar as parameters
		// and returns a integer value that is then stored in result
		int result = divisibleSumPairs(n,k,ar);
		System.out.println(result);
		
		
	}

}
