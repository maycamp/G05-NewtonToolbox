package internalformatting;

import java.io.Serializable;

/** Variable is a class to represent a variable
 * @author Michelle Len
 * @author May Camp
 * @version 02/18/2012 for CS 48 Project, W12
 */

public class Variable implements Serializable{

	private double value; //value of the variable
	private String var; // variable represented as a char
	private String info = "";
	private Tags tags = new Tags();
	private Unit unit;
	final private static long serialVersionUID = 8383008L;
	
	/** Constructor	
	 * @param var A character of what the variable is
	 */

	public Variable (String var) {
		// assign attributes from parameters
		this.var = var;
	}

	/** Constructor
	 * @param var A character of what the variable is
	 * @param value A double of what the value of the variable is
	 */

	public Variable (String var, double value){
		this.var = var;
		this.value = value;
	}
	
	/**
	 * Get the variable character and value
 	 */
	
	public String getVar () { return this.var; }
	public double getValue() { return this.value; }
	
	/**
	 * set the variable character and value
	 */
	
	public void setVar (String var) { this.var = var; }
	public void setValue (double value) { this.value = value; }

	/**
	 * Returns object as a string
	 */
	
	public String toString() {
		return var;
	} // do we need this method?

} // class Variable