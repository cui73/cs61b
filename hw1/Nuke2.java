import java.net.*;
import java.io.*;
import java.util.Arrays;
class Nuke2 {
    public static void main(String arg[]) throws Exception{
        String inputLine;
        
         BufferedReader keyboard;
         
         keyboard = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("please enter a word");
         System.out.flush(); 
         
         inputLine = keyboard.readLine();
         
         if((inputLine != null ) && inputLine.length() >=2) {
         System.out.println(inputLine.substring(0,1) + inputLine.substring(2));
         
         } 
        
        
        
        
    }
    
    
    
}