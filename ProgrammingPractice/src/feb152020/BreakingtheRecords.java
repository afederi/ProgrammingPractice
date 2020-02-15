package feb152020;

/**
 * 
 * @author Alex Federico
 *
 * Description:
 * 
 * Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. 
 * She tabulates the number of times she breaks her season record for most points and least points in a game.
 * Points scored in the first game establish her record for the season, and she begins counting from there.
 * 
 * For example, assume her scores for the season are represented in the array . Scores are in the same order as the games played. 
 * She would tabulate her results as follows:
 * 
 * 
 *                                  Count
 *     Game  Score  Minimum  Maximum   Min Max
 *     0      12     12       12       0   0
 *     1      24     12       24       0   1
 *     2      10     10       24       1   1
 *     3      24     10       24       1   1
 *     
 * Given Maria's scores for a season, find and print the number of times she breaks her records for most and least points scored during the season.
 *  
 */
import java.util.Scanner;

public class BreakingtheRecords {
	private static Scanner scan = new Scanner(System.in);
	public static int[] breakingRecords(int[] scores){
		
		// both min and max are set to the value of the first game scores[0]
		int min = scores[0];
		int max = scores [0];
		
		// tmin and tmax record the number times a number is greater than max or less then min
		int tmin = 0;
		int tmax = 0;
		
		// Pb stores the values of tmax and tmin
		int[] Pb =new int[2];
		
		
		// Traverses through each element in scores. If the value of the current element of scores
		// is greater than the max value then add 1 to tmax and set max to equal the current score. 
		// if the value of the current element in score is less than min then add 1 to tmin and set
		// min to equal the current score value
		for(int i=0;i<scores.length;i++){
			if(scores[i]>max){
				tmax++;
				max = scores[i];
			}else if(scores[i]<min){
				tmin++;
				min = scores[i];
			}
		}
		
		//Set Pb[0] to equal tmax and Pb[1] to equal tmin
		Pb[0] = tmax;
		Pb[1] = tmin;
		
		//Return the array Pb
		return Pb;
		
	}
	
	public static void main(String[]args){
		
		// numGames grabs the input of the number of games played
		int numGames = scan.nextInt();
		
		// array scores stores all scores recorded for each game
		int[] scores = new int[numGames];
		for(int i=0;i<numGames;i++){
			scores[i] = scan.nextInt();
		}
		
		// call the breakingRecords method with array scores as the parameter 
		// and stores the returning array value into Results
		int[] Results = breakingRecords(scores);
		System.out.println(Results[0]+ " , "+Results[1]);
		
	}

}
