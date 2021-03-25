import java.util.Scanner;

public class Bill_Division {
	
	public static String bonAppetit(int[] l, int item, int b){
		int sum=0;
		
		for (int i=0; i<l.length; i++){
			if(i!=item){
				sum+= l[i];
			}
		}
		sum/=2;
		
		if(sum == b){
			return "Bon Appetit";
		}else{
			return ""+(b-sum);
		
		}
	}
		
		
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] l = new int[n];
		
		
		for (int i=0; i<n; i++){
			l[i] = scan.nextInt();	
		}
		int b = scan.nextInt();
	
		System.out.println(bonAppetit(l, k, b));
	
	}
}
