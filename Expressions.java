public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7 first because parenthesis 
     * forces the addition to come first
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 
     * with 0 the result of integer division 3 is added to 0 with
     * sum 3
     * The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));     


    /*******
     * this modifies the actualy value of variable a and adds one to the variable a 
     * 
     * the value displayed is 4
     * 
     * ******/
    System.out.println("#3 " + (++a));    


     /*******
     * this subtracts one from the modified variable a and modifies the value of a to 3
     * the value displayed is 3
     * 
     * ******/

    System.out.println("#4 " + (--a)); 

     /*******
      * the value displayed is 3
     * this adds one to the modifed variable a
     * 
     * 
     * 
     * this modifies the varible of a to 4
     * 
     * ******/
    System.out.println("#5 " + (a++)); 

     /*******
     * the value displayed is 4
     * this subtracts one from the variable modified variable a
     * modifies variable a to be value of 3
     * 
     * ******/      
    System.out.println("#6 " + (a--));


    /*this adds one to the variable a
     * the value displayed is 4
     * 
     * ******/      
    System.out.println("#7 " + (a + 1));


    /***
     * This divides varibales d and c and prints out the remainder of the division
     * 17/5 = 3 remainder 2
     *the value displayed is  2
     ****/        
    System.out.println("#8 " + (d % c));       
    /**
     * This takes variables d and c and divides them, it prints out the  whole number 
     * 17/5 = 3 remainder 2
     * teh value displayed is 3
     * 
     * **/

    System.out.println("#9 " + (d / c));       

    /*takes value of varible d and divides it by value of varible b
    *this takes teh remainder and displays that as the result
    *17/4 = 4 remainder 1 
    *the value displayed is 1*/

    System.out.println("#10 " + (d % b));   
    
    /* this takes the value of varible d and divides is by the value of varible b
    *     
    System.out.println("#11 " + (d / b)); 

    /***
     * This takes (a/d) [3/17] which displays 0 because it = 0.17 and 0 is the whole number
     * then it takes d+0 which = to 17
     * then it takes 17+b which is 17+4 which = 21
     * the value displayed is 21
     * */


    System.out.println("#12 " + (d + a / d + b)); 


    /*this takes variables d and a and adds them together because they are in parentheses and follows order of operations
    *17+3 = 20
    *then is takes d + b and adds them becausse they are in parentheses
    * 17+4 =21
    *then following PEMDAS (d+a) is then divded by (d+b)
    *20/21 = 0.95238095238
    *this value displayed is the whole number 
    *value displayed is 0 */
    System.out.println("#13 " + ((d + a) / (d + b)));




    /* this takes the square root of variable b 
    *sqrt4 = 2
    *value displayed is 2.0 */       
    System.out.println("#14 " + (Math.sqrt(b)));    

    /**
     * this raises variable a by variable b
     * 3^4 = 81
     * the value displayed is 81.0*/

    System.out.println("#15 " + (Math.pow(a, b)));  


    /** this takes the absolute value of variable a
     * value displayed is 3*/

    System.out.println("#16 " + (Math.abs(-a)));


    /**
     * this takes 2 variables (a & b) and compares them
     * it returns out the larger varible
     * a=3 b=4
     * the value displayed is 4*/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 