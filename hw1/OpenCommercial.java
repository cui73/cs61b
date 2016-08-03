/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.Arrays;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   * 
   */
    
    
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;
   
    

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    String cc = "http://www."+inputLine+".com";
    System.out.println(cc);
     String line;
    
    URL s = new URL(cc);
     BufferedReader in = new BufferedReader(
        new InputStreamReader(s.openStream()));
    
     
     int i =0;
     
     String[] linex = new String[5];
     
     while ((line = in.readLine()) != null && i < linex.length) {
         linex[i] = line; 
         i++;
          
           
     }
     
     String[] liney = new String[5];
     int b =0;
     
     for(int k = linex.length-1; k >=0; k--,b++) {
         
         liney[b] = linex[k];
     }
    
     for(int l =0; l < liney.length; l++) {
         System.out.println(liney[l]);
         
         
     }
      
     
  }
}
    

        
       
  
    

    /* Replace this comment with your solution.  */

  
