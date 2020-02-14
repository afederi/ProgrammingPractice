package feb142020;
/**
 * 
 * @author Alex Federico
 * 
 * You are choreograhing a circus show with various animals. For one act, you are given two kangaroos on a
 * number line ready to jump in the positive direction (i.e, toward positive infinity).
 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 * You have to figure out a way to get both kangaroos at the same location as part of the show.
 * Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and
 * return YES or NO appropriately. Can you determine if the kangaroos will ever land at the same location
 * at the same time? The two kangaroos must land at the same location after making the same number of
 * jumps.
 * 
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class kangarooProblem {
	public static void main(String[]args){
		
		//Grabs input from user in the format x1 v1 x2 v2
		Scanner scanner = new Scanner(System.in);
		
		//Splits the single input into 4 elements and stores the data into 4 variables
		String[] taken = scanner.nextLine().split(" ");
		
		int x1 = Integer.parseInt(taken[0]); 
		int v1 = Integer.parseInt(taken[1]); 
		int x2 = Integer.parseInt(taken[2]); 
		int v2 = Integer.parseInt(taken[3]); 
		
		//Sends data to kangaroo method and returns a string as "YES" or "NO
		String result = kangaroo(x1, v1, x2, v2);
		
		//Print results
		System.out.println(result);
		
	}
	
	//Method to calculate if  two kangaroos will meet at the same time
	public static String kangaroo(int x1, int v1, int x2, int v2){
		
		//if the second kangaroo has a rate of movement greater than the 
		// the first kangaroo then the method will return no
		if(x2 > x1 && v2 >= v1){
			return "NO";
		}
		
		//Setting up variables to calculate the total meters each  kangaroo will move
		int t1 = x1;
		int t2 = x2;
	
		//special case that automatically prints no because x2's value will always be 
		// greater than x1's value
		if(x1 > x2){
			return "NO";
		}
		
		//This while loop will loop through the method until t1's value is greater than t2's value.
		// if t1 and t2 are equal, then the method will return YES otherwise, it will add the value of v1 
		// to t1 and add the value of v2 to t2
		while(t1 <= t2){
			if(t1 == t2){
				return "YES";
			}
			t1+=v1;
			t2+=v2;
		}
		
		//if t1 ends of becoming greater than t2 then that would mean the two kangaroos will not meet
		return "NO";
	}

}
