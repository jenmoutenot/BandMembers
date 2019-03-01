/**
 * This is my code! It's goal is to create a band array list and provide 
 * methods toward manipulating the array list like adding, and finding player/instrument
 * CS 312 - Assignment 2
 * @author Jen Moutenot
 * @version 1.0 9/21/2018
 */
package asn2;

import java.util.ArrayList;

public class Band
{
  private ArrayList<BandMember> bandArrayList = new ArrayList<BandMember>();
  
  /* purpose: To add to the bandArray array list of band members 
   * input: the bandMmeber object that holds the name of the band member and the instrument 
   * output: the updated array list 
   */
  public ArrayList add(BandMember bandMember) 
  {
    bandArrayList.add(bandMember);
    return bandArrayList;
  }
  
  /* purpose: to override the toString() method and turn the bandArrayList object into a string
   * input: none
   * output: String containing the band array list 
   */
  @Override
  public String toString()
  {
    String str = "";
    str += bandArrayList;
    return str;
  }
  
  /* purpose: to find the player that the command line specifies 
   * input: the command line's name specified 
   * output: String containing the player's name and instrument they play
   */
  public String findPlayer(String n)
  {
    for (int i = 0; i < bandArrayList.size(); i++ )
    {
      if (bandArrayList.get(i).playerEqual(n))
        return (bandArrayList.get(i).toString());
    }
    return "foo name";
  }
  
  /* purpose: to find the player that plays the instrument the command line specifies 
   * input: the command line's instrument specified
   * output: String containing the player's name and instrument they play  
   */
  public String findInstrument(String ins)
  {
    for (int i = 0; i < bandArrayList.size(); i++)
    {
      if (bandArrayList.get(i).instEqual(ins))
        return (bandArrayList.get(i).toString());
    }
    return "foo instrument";
  }
}
