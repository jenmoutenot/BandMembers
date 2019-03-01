/**
 * This is my code! It's goal is to interact with the command line arguments passed in
 * CS 312 - Assignment 2
 * @author Jen Moutenot
 * @version 1.0 9/21/2018
 */
package asn2;
import java.util.ArrayList;

public class CLI
{
  private Band oneDirection = new Band(); 
  
  /* purpose: parameterized constructor made to pass in the argument in main
   * input: the argument
   * output: none
   */
  public CLI(String[] args)
  {   
  }
  
  /* purpose: to interact with the command line and the different arguments accepted 
   * input: the argument from the command line
   * output: nothing, prints to screen after checking if the command is equal to or not
   */
  public void commandLineInterface( String args[])
  {
    oneDirection.add( new BandMember("Harry Styles", "drums"));
    oneDirection.add( new BandMember("Louis Tomlinson", "guitar"));
    oneDirection.add( new BandMember("Liam Payne", "bass"));
    oneDirection.add( new BandMember("Zayn Malik", "vocals"));
    oneDirection.add( new BandMember("Niall Horan", "keyboards"));
        
    if (args.length == 0)
        System.out.println("no arguments");
    else if ("-p".equals(args[0]))
        System.out.println(oneDirection.toString());
    else if ("-n".equals(args[0]))
    {
      System.out.println(oneDirection.findPlayer(args[1]));
    }
    else if ("-i".equals(args[0]))
    {
      System.out.println(oneDirection.findInstrument(args[1]));
    }
    else
    {
      System.out.println("no arguments");
    }
           
    for(int i = 0; i < args.length; i++)
        System.out.println("args[" + i + "] = " + args[i]);
  }
}
