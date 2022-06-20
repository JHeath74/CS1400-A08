public class Pattern
{

//Methods

      public static void getPattern1(int size)
        {
            for(int i = 1; i <= size; i++)
            {
               
             System.out.print("o");
                  
             for(int j = size; j > i; j--)
                {
                   System.out.print(" ");
                }
         
             System.out.print("//");
         
         for(int j = 1; j < i; j++)
           {
               System.out.print(" ");
           }
          
         for(int j = 2; j <= i; j++)
           {
              System.out.print(" ");
           }
         
              System.out.print("\\\\");
              System.out.print(".");
            
                 System.out.println();
         }
       }
     
       
       public static void getPattern2(int size)
         {
             for(int i = 1; i <= size; i++)
             {
                 for(int j = size; j >= i; j--)
                {
                   System.out.print(" ");
                }           
             
              System.out.print(".");
              System.out.print("//");
              
               for(int j = 1; j < i; j++)
           {
               System.out.print(" ");
           }
          
         for(int j = 2; j <= i; j++)
           {
              System.out.print(" ");
           }
             
               
                System.out.print("\\\\");
                
                for(int j = size; j > i; j--)
                  {
                      System.out.print(" ");
                  } 
                  
               
                System.out.print("o");
                System.out.println();
             }
             
         }
        
      public static void getPattern3(int size)
         {
             for(int i = 1; i <= size; i++)
             {
             System.out.print("o");
             
                 for(int j = 2; j <= i; j++)
           {
              System.out.print(" ");
           }
            
            
            System.out.print("\\\\");
                  for(int j = (size - i) * 2; j >= 1; j--)
                  {
                      System.out.print(" ");
                  }
            
            
             System.out.print("//");
             System.out.print(".");
                  
                  for(int j = 0; j >= i; j-=2)
                {
                   System.out.print(" ");
                }    
                  System.out.println();
             }
         }
        
      public static void getPattern4(int size)
         {
             for(int i = 1; i <= size; i++)
               {
                   for(int j = 2; j <= i; j++)
                      {
                           System.out.print(" ");
                      }
                      
             System.out.print(".");
             System.out.print("\\\\");
            
                    for(int j = (size - i) * 2; j >= 1; j--)
                  {
                      System.out.print(" ");
                  }
            
             System.out.print("//");
                   
                   for(int j = 0; j < i-1; j++)
                      {
                           System.out.print(" ");
                      }
             System.out.print("o");
             System.out.println();
            }
            
        }
}
