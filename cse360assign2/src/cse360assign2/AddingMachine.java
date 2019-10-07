/**
 * Name: Jessica Wood
 * ID: 1212729373
 * Assignment 2
 * Description: AddingMachine begins
 * with a value of 0 and allows the
 * user to add and subtract values
 * as they please.  The total can be
 * accessed as well as a history of the
 * additions and subtractions performed.
 */

package cse360assign2;

/**
 * AddingMachine begins
 * with a value of 0 and allows the
 * user to add and subtract values
 * as they please.  The total can be
 * accessed as well as a history of the
 * additions and subtractions performed.
 * 
 * @author Jessica
 *
 */
public class AddingMachine
{
	private int total;
	private String tostring;
	
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
		tostring = "0";
	}
		
	/**
	 * Returns the value stored in the
	 * private variable total.
	 * @return the value of the total
	 */
	public int getTotal ()
	{
		return this.total;
	}
		
	/**
	 * Adds a specified value to the total
	 * and updates the history of operations.
	 * 
	 * @param value the value to be added
	 * to the total
	 */
	public void add (int value)
	{
		total = total + value;
		tostring = tostring + " + " + value;
	}
	
	/**
	 * Subtracts a specified value from the total
	 * and updates the history of operations.
	 * 
	 * @param value the value to be subtracted
	 * from the total
	 */
	public void subtract (int value)
	{
		total = total - value;
		tostring = tostring + " - " + value;
	}
	
	/**
	 * Returns a string of the history
	 * of additions and subtractions
	 * performed on this total.
	 * 
	 * @return the history of operations
	 */
	public String toString ()
	{
		return this.tostring;
	}
	
	/**
	 * Resets the total to 0 and
	 * clears the history as well.
	 */
	public void clear()
	{
		total = 0;
		tostring = "0";
	}
}