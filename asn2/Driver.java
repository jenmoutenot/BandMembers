/**
 * This is my code! It's goal is to serve as the test driver to test if the
 * band members are added, then interacts with the command line and takes in arguments
 * CS 312 - Assignment 2
 * @author Jen Moutenot
 * @version 1.0 9/21/2018
 */
package asn2;
import java.util.ArrayList;

public class Driver
{
  /* purpose: Main method to take in arguments from the command line
   * input: the arguments from the command line
   * output: the updated array list and the argument index and it's output
   */
  static public void main(String [] args)
  {
     
    Band oneDirection = new Band();
    oneDirection.add( new BandMember("Harry Styles", "drums"));
    oneDirection.add( new BandMember("Louis Tomlinson", "guitar"));
    oneDirection.add( new BandMember("Liam Payne", "bass"));
    oneDirection.add( new BandMember("Zayn Malik", "vocals"));
    oneDirection.add( new BandMember("Niall Horan", "keyboards"));
    System.out.println("One Direction = " + oneDirection);
    CLI commandLine = new CLI(args);
    commandLine.commandLineInterface(args);
  }
}
