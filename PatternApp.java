/*Jeffory Heath
11/17/2016
A08 CSIS 1400
*/

import java.util.Scanner;

public class PatternApp
{
        public static void main(String [] args)
   {
         
        Scanner input = new Scanner(System.in);
        int selection;
         
         System.out.print("Choose a Pattern (1-4) or 0 to quit: ");
         selection = input.nextInt();
        
         while(selection != 0)
             {
       
             menuPrompt();
             int size = input.nextInt();
                         
         switch (selection)
               {
                  case 1:
                     Pattern.getPattern1(size);
                     break;
                  case 2:
                     Pattern.getPattern2(size);
                     break;
                  case 3:
                     Pattern.getPattern3(size); 
                     break;
                  case 4:
                     Pattern.getPattern4(size);
                     break;
                  default: 
                     System.out.print("");
                     break;
               
                } 
                System.out.print("Choose a Pattern (1-4) or 0 to quit: ");
                selection = input.nextInt();
                  
         }
         System.out.print("Good Bye");
     }  
         
         
  	
      public static void menuPrompt()
	    {   
	      System.out.print("Please Choose a Size (1 - 7): ");
       }

}




