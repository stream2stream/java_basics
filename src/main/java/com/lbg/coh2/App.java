package com.lbg.coh2;

import java.util.Scanner;

/**
 * Hello world!
	 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String lineRead;
        boolean whileContinue = true;
        Scanner sc = new Scanner(System.in);
        
        prompt();
        lineRead = sc.next();

        while( whileContinue && lineRead != null )
        {
            System.out.println(lineRead);
            prompt();
            lineRead = sc.next();      
            if( lineRead.equalsIgnoreCase("quit") )
            	whileContinue = false;
        }   
        
        System.out.println( "Program Ended");
    }
    
    
    static private void prompt()
    {
        System.out.print("Press a key:");
    }

}
