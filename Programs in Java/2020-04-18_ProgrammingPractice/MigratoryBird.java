/**
 *https://www.hackerrank.com/challenges/migratory-birds/problem
**/

import java.util.*;
import java.util.Scanner;

public class MigratoryBird{

  public static int MigratoryBirds(List<Integer> arr){


    //Create an array that will count the number of birds for each type
    //This problem assumes that there are only 5 types of birds
    int[] birdCount = new int[5];

    //Populate the array with value 0
    for(int i=0;i<birdCount.length;i++){
      birdCount[i]=0;
    }

    /* traverse through List arr, and use the value for each element
     * as an index to add 1 to the element
     * Example: if one element in arr contains a value of 3,
     *          Then in the birdCount array, add 1 to array element 2
     */
    for(int i=0;i<arr.size();i++){
      birdCount[arr.get(i)-1] +=1;
    }


    int Max=0;
    int Id=0;

    /** Traversing through birdCount to find the Max amount of birds
      * If an element's value is greater than max, then max will
      * will set equal to the value of the current birdcound index
      * and the ID will set to the current i index.
    **/
    for(int i=0;i<birdCount.length;i++){
      if(birdCount[i] > Max){
        Max = birdCount[i];
        Id = i;
      }
    }

    //Returning the ID with the most birds. Plus one to id is needed because
    // of Id is based on the array index and not the birdID.
    return Id + 1;
  }

  public static void main(String[]args){
    //Set up a scanner object
    Scanner scan = new Scanner(System.in);

    //Set up a List object that stores an object of ArrayList class
    List<Integer> birds = new ArrayList<Integer>();

    //n_Birds is the variable for the number of birds sighted
    int n_Birds = scan.nextInt();

    //Adding all bird ids for each bird from 1 to the number of birds
    for(int i=0;i<n_Birds;i++){
      birds.add(scan.nextInt());
    }

    //Call the MigratoryBird method with List birds as an argument
    //Then storing the return value of MigratoryBirds into the integer result
    int result = MigratoryBirds(birds);
    System.out.print(result);

  }
}
