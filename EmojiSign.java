/*import java.util.Scanner;

public class EmojiSign {
    public static void main(String[] args) {
        /* 1.   INITIALIZE DOUBLE RADIUS
2.  INITIALIZE STRING PHRASE
3.  INITIALIZE STRING EMOJI
4.  INITIALIZE DONE to FALSE
5.  INITIALIZE DOUBLE SURFACE_AREA
6.  INITIALIZE DOUBLE VOLUME
7.  INITIALIZE DOUBLE STRING_COST
8.  INITIALIZE DOUBLE AREA_COST
9.  INITIALIZE DOUBLE VOLUME_COST
10. INITIALIZE DOUBLE FINAL_COST
11. INITIALIZE DOUBLE EMOJI_COST
12. SET INT GLASSES to 500
13. SET INT EYES to 450
14. SET DOUBLE CHARACTER_COST to 4.50
15. SET DOUBLE NEON to 3.45
16. SET DOUBLE PLASTIC to 2.75 

        double radius = 0.0;
        String phrase = "";
        String emoji = "";
        boolean done = false;
        double surfaceArea = 0.0;
        double volume = 0.0;
        double stringCost = 0.0;
        double areaCost = 0.0;
        double volumeCost = 0.0;
        double finalCost = 0.0;
        double emojiCost = 0.0;
        double cost=0;
        int four_eyes = 500;
        int cool = 500;
        int smile = 450;
        int wink = 450;

        double characterCost = 4.50;
        double neon = 3.45;
        double plastic = 2.75;
        Scanner scanner = new Scanner(System.in); */
        
        // Begin program
        /*17.   WHILE DONE does not equal to TRUE
PROMPT USER for RADIUS
  PROMPT USER for PHRASE
 PROMPT USER for EMOJI
  IF EMOJI is SMILE or WINK
  SET EMOJI_COST to EYES
 ELSE
  SET EMOJI_COST to GLASSES
    ENDIF
*/
   /*     while (!done) {
            // Prompt user for input
            System.out.print("Enter the radius: ");
            radius = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the string you would like on your sign: ");
            phrase = scanner.nextLine();
            System.out.print("Which emoji would you like on your sign: ");
            emoji = scanner.nextLine();
    
            // Calculate costs
            //determine the cost based on emoji
        if(emoji.equals("Smile")||emoji.equals("Wink")){
            cost+=450;
        }
        else if(emoji.equals("Cool")||emoji.equals("four_eyes")){
            cost+=500;

        }
            surfaceArea = (4*Math.PI*radius*radius);
            volume = (4.0/3.0)*Math.PI*radius*radius*radius;
            stringCost = phrase.length() * characterCost;
            areaCost = surfaceArea * plastic;
            volumeCost = volume * neon;
            finalCost = stringCost + areaCost + volumeCost + cost;

            //calculate cost based on surface area and volume
        //surface area
        cost=2.75*surfaceArea;
        //volume
        cost+=3.45*volume;
    
            // Output results
            System.out.println("Your sign with \"" + phrase + "\" will cost $" + finalCost);
            System.out.print("Would you like to create another sign? Enter yes to continue. ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("NO")) {
                done = true;
            }
        }
    }
}


*/

/* import java.util.Scanner;

public class EmojiSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean makeSign = true;
        double characterCost = 4.50;
        double plasticCost = 2.75;
        double neonCost = 3.45;
        double glassesCost = 500;
        double noGlassesCost = 450;
        
        while (makeSign) {
            double cost = 0.0;
            double radius = 0.0;
            double surfaceArea = 0.0;
            double volume = 0.0;
            String string = "";
            String emoji = "";
            
            System.out.print("Enter the radius: ");
            radius = input.nextDouble();
            input.nextLine();
            
            System.out.print("Enter the string you would like on your sign: ");
            string = input.nextLine();
            
            System.out.print("Which emoji would you like on your sign: ");
            emoji = input.nextLine().toUpperCase();
            
            double emojiCost = 0.0;
            if (emoji.equals("SMILE") || emoji.equals("WINK")) {
                emojiCost = noGlassesCost;
            } else if (emoji.equals("COOL") || emoji.equals("4 EYES")) {
                emojiCost = glassesCost;
            }
            
            for (int i = 0; i < string.length(); i++) {
                cost += characterCost;
            }
            
            surfaceArea = 4 * Math.PI * radius * radius;
            volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
            cost += surfaceArea * plasticCost;
            cost += volume * neonCost;
            cost += emojiCost;
            
            System.out.print("Your sign with \"" + string + "\" will cost $");
            System.out.printf("%.2f", cost);
            System.out.println();
            
            System.out.print("Would you like to create another sign? Enter yes to continue. ");
            String again = input.nextLine().toLowerCase();
            if (!again.equals("yes")) {
                makeSign = false;
            }
        }
        
        input.close();
    }
}
*/
        import java.util.Scanner;

public class EmojiSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            // Variable Declarations
            double cost = 0.0;
            double surfaceArea = 0.0;
            double volume = 0.0;
            int glasses = 500;
            int no_glasses = 450;
            double characterCost = 4.50;
            double neon = 3.45;
            double plastic = 2.75;

            // Prompt user for input
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the string you would like on your sign: ");
            String phrase = scanner.nextLine();
            System.out.print("Which emoji would you like on your sign: ");
            String emoji = scanner.nextLine();

            // Calculate costs
            // calculate square footage and cubic footage
            surfaceArea = 4 * Math.PI * radius * radius;
            volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

            // calculate cost based on surface area and volume
            // surface area
            cost = plastic * surfaceArea;
            // volume
            cost += neon * volume;

            // calculate cost based on number of characters in string
            cost += phrase.replaceAll("\\s+", "").length() * characterCost;

            // determine the cost based on emoji
            if (emoji.equals("Smile") || emoji.equals("Wink")) {
                cost += no_glasses;
            } else if (emoji.equals("Cool") || emoji.equals("4 eyes")) {
                cost += glasses;
            }

            // Output results
            System.out.print("Your sign with \"" + phrase + "\" will cost $");
            System.out.printf("%.2f", cost);
            System.out.println();
            System.out.print("Would you like to create another sign? Enter yes to continue. ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                done = true;
            }
        }
        scanner.close();
    }
}