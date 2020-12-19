import java.util.Scanner;

/**
  * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
  **/

/**
  *
Psuedo-code
method(input year){
      3 if statements
      1. if (1918) " special cases"
          print 31.08.1918
      2. if(1700 1917)"Julian calendar"
          year/4;
          if yes: leap year; print 13.09.(year input)
          if no: not leap year; print 12.09.(year input)
      3. if (1919-2700) "Gregorian calendar"
          year/400 || year / 4 && !(year/100)
          if yes: leap year; print 13.09.(year input)
          if no: not leap year; pring 12.09.(year input)
}
  *
  */



public class DayoftheProgrammer{
  public static String dayOfProgrammer(int y){

    /**
      * Create an 3 chain if else if statement for the three cases
      *   1. when y is 1918
      *   2. when y is between 1700 and 1917 (inclusively)
      *   3. when y is between 2019 and 2700 (inclusively)
      */
    if(y == 1918){
      /** Returns this data because int total: (Jan)31 + (Feb)15 + (Mar)31 +
        * (Apr)30 + (May)31 + (Jun)30 + (Jul)31 + (Aug)31 = 230 days
        * 256 - 230 = 26, so the 256th day is on September 26
        */
      return "26.09.1918";
    }else if(y >= 1700 && y <= 1917){

      //Print this case when the year is divisible by 4, if not, it print the else statement
      if(y%4 == 0){
        return "12.09."+y;
      }else{
        return "13.09."+y;
      }
    }else if( y>=1919 && y <=2700){
      //Prints this case if the year is divisible by 400 OR divisible by 4 AND Not devisible by 100
      //If the year does not meet one of the two conditions then it will print the else statement
      if (y%400 == 0 || (y %4 == 0 && ((y%100) != 0))){
      return "12.09."+y;
      }else {
        return "13.09."+y;
      }
    }
    //Placeholder that would return nothing if the year is not withing the assumed range (1700-2700)
    return "";
  }



  public static void main(String[]args){
    //Creates an instance of the scanner class
    Scanner scan = new Scanner(System.in);
    //Grabs an Integer input from user and stores the value in year
    int year = scan.nextInt();

    //calls the dayOfProgrammer method with year as an argument, then it prints the results
    System.out.print(dayOfProgrammer(year));
  }
}
