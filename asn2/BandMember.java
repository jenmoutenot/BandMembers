/**
 * This is my code! It's goal is to handle band member information like instrument and name
 * CS 312 - Assignment 2
 * @author Jen Moutenot
 * @version 1.0 9/21/2018
 */
package asn2;
import java.util.ArrayList;

public class BandMember extends Band
{
  private String name;
  private String instrument;
    
  /* purpose: BandMember constructor 
   * input: none
   * output: none
   */
  public BandMember()
  {
    name = "Foo Foo";
    instrument = "Foo Instrument";
  }
    
  /* purpose: Parameterized Constructor for BandMember
   * input: the name and instrument of the band member
   * output: none
   */
  public BandMember(String name, String instrument)
  {
    this.name = name;
    this.instrument = instrument;
  }
    
  /* purpose: to override the toString() method and turn the object into a String
   * input: none
   * output: String containing the name of the band member and the instrument they play from the ArrayList 
   */
  @Override
  public String toString()
  {
    String str = "";
    str += name + " on the " + instrument;
    return str;
  }
  
  /* purpose: boolean method that checks if the player name from the command line is equal to the 
   * one found in the band array list
   * input: the command line's name specified
   * output: boolean value (true or false)
   */
  public boolean playerEqual(String n)
  {
    if (this.name.equals(n))
        return true;
    else
        return false;
  }
  

  /* purpose: Boolean method that checks if the instrument from the command line is equal to the 
   * one found in the band array list 
   * input: the command line's instrument specified 
   * output: boolean value (true or false)
   */
  public boolean instEqual(String i)
  {
    if (this.instrument.equals(i))
        return true;
    else
        return false;
  }
}
