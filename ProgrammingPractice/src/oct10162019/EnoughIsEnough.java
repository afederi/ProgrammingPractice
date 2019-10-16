package oct10162019;
/**
 * Alex Federico
 * 
 * Problem taken from Codewars 
 * 
 * 
 * Enough is enough!
 * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, 
 * and now they want to show Charlie their entire collection. However, Charlie doesn't like this sessions, since the motive usually repeats. 
 * He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. 
 * Luckily, Alice and Bob are able to encode the motive as a number. 
 * Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
 * 
 * Task
 * Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. 
 * For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
 * and then take 3, which leads to [1,2,3,1,2,3].
 * 
 * EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
 * EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 * 
 */


import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurances){
		
		//Create a hashmap to keep track of the amount of times a number occurs
		HashMap<Integer, Integer> max = new HashMap<>();
		
		//Create a temporary arrayList to add numbers from elements to temp
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		//Traverse through each element and adds one for each number that occurs 
		for(int i=0;i<elements.length;i++){
			
			//if else statement checks each element to see if the number has already exists in the hashmap.
			// If it has, then it adds one to the occured number, if not, the program creates a new element for that number.
			if(max.containsKey(elements[i])){
				max.put(elements[i], max.get(elements[i])+1);
			}else{
				max.put(elements[i], 1);
			}
			
			//If the number has reached maxOccurances, then the program will not add the number to the list
			if(max.get(elements[i])<=maxOccurances){
				temp.add(elements[i]);
			}
		}
		
		//Converts the arrayList into an Array
		int[] finalNth = new int[temp.size()];
		for(int i=0;i<temp.size();i++){
			finalNth[i] = temp.get(i);
		}
		
		//returns modified array
		return finalNth;
	}
public static void main(String[]args){
	
	int[] catchNth = deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3);
	for(int i=0;i<catchNth.length;i++){
		System.out.println(catchNth[i]);
	}
	System.out.println();
}

}
