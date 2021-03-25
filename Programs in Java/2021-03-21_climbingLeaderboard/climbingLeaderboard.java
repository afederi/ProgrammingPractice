import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class climbingLeaderboard {
	
	
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		
		int rankedCount = scan.nextInt();
		List<Integer> ranked = new ArrayList<Integer>();
		for(int i=0; i<rankedCount; i++){
			ranked.add(scan.nextInt());
		}
		
		int playerCount = scan.nextInt();
		List<Integer> player = new ArrayList<Integer>();
		for(int i=0; i<playerCount; i++){
			player.add(scan.nextInt());
		}
		//System.out.println("HIT");
		System.out.println(Result.climbingLeaderboard(ranked, player));
		
		
	}
}

class Result {

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){
		ArrayList<Integer> rankPosition = new ArrayList<Integer>();
		if(ranked.size()<1){
			for(int k : player){
				rankPosition.add(1);
			}
		}
		
		int Rankcounter = 1;
		int counter = 0;
		List<Integer> tempRankedList = new ArrayList<Integer>();
		int h;
		
		System.out.println("TEST");
		for(int i=0; i<player.size();i++){
			
			for(int k : ranked){
				tempRankedList.add(k);
			}
			
			
			Rankcounter=1;
			counter = 0;
			while(counter < tempRankedList.size()){
				if(player.get(i)>=tempRankedList.get(counter)){
					tempRankedList.add(counter, player.get(i));
					rankPosition.add(Rankcounter);
					break;
					//counter=tempRankedList.size()+1;
				}else if(counter == tempRankedList.size()-1){
					rankPosition.add(Rankcounter+1);
					tempRankedList.add(player.get(i));
					break;
				}
				if(tempRankedList.get(counter)!=tempRankedList.get(counter+1)){
					Rankcounter++;
				}
				counter++;	
			}
			
			
			/**
			while(counter < tempRankedList.size()){
				if(player.get(i) == tempRankedList.get(counter-1)){
					rankPosition.add(Rankcounter);
					break;
				} else if (tempRankedList.get(counter)<tempRankedList.get(counter-1)){
					Rankcounter++;
					counter++;
				}else{
					counter++;
				}
				if(counter>=tempRankedList.size()){
					rankPosition.add(Rankcounter);
				}	
			}
			**/
			tempRankedList.clear();
			System.out.println(rankPosition.toString());
			
	
			
			
			
		}
		
	
	
		/**
		//rankPosition.add(Rankcounter);
		//while (counter < ranked.size()){
		//	if (ranked.get(counter) == rankPosition.get(counter-1)){
		//		rankPosition.add(Rankcounter);
		//	}else{
		//		Rankcounter++;
		//		rankPosition.add(Rankcounter);
		//	}
		//	counter++;
		//}
		**/
		
		
		return rankPosition;
	}
}
	
	
	

