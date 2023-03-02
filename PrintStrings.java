/*
*PhoneString
*
*Athena Le
*2/15/23
*CMSC255, 901
*/

import java.util.Scanner;

public class PrintStrings{
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter two words:");
      String string1 = input.nextLine();
      String string2 = input.nextLine();
      
      System.out.println("In lexicographic order:");
      if (string1.compareTo(string2) < 0){
         System.out.println(string1 +"\n"+string2);
      }
      else{
         System.out.println(string2 +"\n"+string1);
      }
   }
}

