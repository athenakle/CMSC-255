/*
*MiddleString
*
*Athena Le
*2/15/23
*CMSC255, 901
*/


import java.util.Scanner;

public class MiddleString {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
   
      System.out.println("Enter three strings:"); //tells the user to enter 3 strings in 
      String str1 = scnr.next();
      String str2 = scnr.next();
      String str3 = scnr.next();
      
      if ((str1.compareTo(str2) < 0) && (str1.compareTo(str3) < 0)){ //checks if string1 has the lowest value
         if (str2.compareTo(str3) < 0) //sees if string 2 has a lower value than string 3 and if yes then string 2 is the middle value
            System.out.println(str2); //prints out string 2
         else{
            System.out.println(str3); //if string 2 is not lower than string 3, prints out string 3 as the middle value
         }
      }
      else if ((str2.compareTo(str1) < 0) && (str2.compareTo(str3) < 0)){ //checks if string 2 is the lowest value
         if (str1.compareTo(str3) < 0)
            System.out.println(str1); //prints out string 1
         else
            System.out.println(str3);// prints string 3 if it has a lower value than string 1
      }
      else{
         if (str1.compareTo(str2) < 0) //compares string 1 to string 2
            System.out.println(str1); //prints out string 1
         else
            System.out.println(str2); //prints out string 2
      }
   }
}

