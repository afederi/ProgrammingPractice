package oct10162019;

public class find_Average {
	//Method for finding the average of an array
	public static double find_average(int[] array){
		int total =0;;
		
		//Add all elements in the array
		for(double k:array){
			total += k;
		}
		
		// Concatenate total into a double 
		// to prevent the total from removing the 
		// decimals.
		return (double)total/array.length;
	}
	public static void main(String[]args){
		System.out.println(find_average(new int[] {1,2,4}));
	}

}
