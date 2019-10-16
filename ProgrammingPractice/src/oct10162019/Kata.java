package oct10162019;

public class Kata {
	public static int[] sortArray(int[] array){
		
		//If the array is null, then return the array
		if(array == null){
			return array;
		}
		
		//Initializing all variables used in this program
		int temp =0;
		int initialPointer = 0;
		int pointer =0;
		int iterator =0;
		
		//Finds the first non-even element, but if there are no non-even elements,
		//then the iterator will go through the entire array
		while(iterator <array.length){
			if(isEven(array[iterator])){
				iterator++;
			}else{
				initialPointer = iterator;
				pointer = iterator;
				break;
			}
		}
		
		//Uses a bubble sort algorithm
		/* From the first non-even element, it will traverse the array finding the
		 * largest elements and pushing that element to the far right.
		 * The traversal will then reset from the inital location of the first non-even element
		 * and traverse again to find the next largest element and push that element to the far 
		 * right but behind the previous large element. The traversal continues until i is greater
		 * then the length of the array
		 */
		for(int i=0; i<array.length;i++){
			pointer = initialPointer;
			for(int j=initialPointer;j<array.length-i;j++){
				if(array[j]<array[pointer] && (!isEven(array[j]))){
					temp = array[pointer];
					array[pointer]=array[j];
					array[j] = temp;
					pointer = j;
				}else if (array[j]>array[pointer] && (!isEven(array[j]))){
					pointer = j;
				}
			}
		}
		
		return array;
	}
	
	//  Method to check if a number is even or not. Also accounts for negative numbers
	public static boolean isEven(int num){
		if(num%2 == 0 || num%(-2)==0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	public static void main(String[]args){
		int[] caughtArray = sortArray(new int[]{ 5,3,2,8,1,4 });
		for(int i=0;i< caughtArray.length;i++){
			System.out.println(caughtArray[i]);
		}
	}
}
