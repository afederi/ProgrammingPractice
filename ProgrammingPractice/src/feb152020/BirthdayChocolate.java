package feb152020;

/**
 * 
 * @author Alex Federico
 * 
 * Description:
 * 
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. 
 * She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day.
 * You must determine how many ways she can divide the chocolate.
 * 
 * Consider the chocolate bar as an array of squares, s = [2,2,1,3,2] . She wants to find segments summing to Ron's birth day, d=4 with a length equaling his birth month, m=2. 
 * In this case, there are two segments meeting her criteria:  
 * [2,2] and [1,3].
 * 
 * Function Description
 * 
 * Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.
 * 
 * birthday has the following parameter(s):
 * 
 * s: an array of integers, the numbers on each of the squares of chocolate
 * d: an integer, Ron's birth day
 * m: an integer, Ron's birth month
 *
 */

import java.util.*;
public class BirthdayChocolate {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static int Birthday(List<Integer> s, int d, int m){
		
		//initializing variables
		
		// iterator is used to traverse through all contiguous segments that are of length m
		int iterator = 0;
		
		// count is the total of contiguous segments that are of length m and have a value equal to d
		int count = 0;
		
		// total is the value of the current contiguous segment
		int total = 0;
		
		// Traverses through each contiguous segment. If the value is the same as d,
		// then the value of count increments by 1 and the total resets to 0 and iterator increments by 1
		while(iterator <=s.size()-m){
			
			//Loops through to find the total value of the current contiguous segment
			for(int i=0;i<m;i++){
				total += s.get(iterator+i);
			}

			if(total == d){
				count++;
			}
			
			total=0;
			iterator++;
		}
		
		//return the value of count
		return count;
	}
	
	public static void main(String[]args){
		
		//n grabs the input for total elements in array s
		int n = scan.nextInt();
		
		//s grabs a total of n inputs and stores them into the array
		List<Integer> s = new ArrayList<>();
		for (int i = 0; i < n; i++) {
            s.add(scan.nextInt()); 
        }
	
		//grabs the input for the date d and month m
		int d = scan.nextInt();
		int m = scan.nextInt();
		
		// calls the method Birthday with s, d, and m as parameters
		// and stores the return value in result
		int result = Birthday(s, d, m);
		System.out.print(result);		
	}

}
