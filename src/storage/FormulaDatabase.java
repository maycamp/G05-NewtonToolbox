package storage;
import internalformatting.Formula;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This Class acts as storage for all of the formulas in the system
 * @author Clayven Anderson
 *
 */


public class FormulaDatabase extends ArrayList<Formula> implements Serializable
{

  private static final long serialVersionUID = 4101660L;
  
  /** Generates an arraylist of formula objects
   */
  //default constructor
  public FormulaDatabase(){
    super(); //creates an Arraylist of capacity 1
    this.clear();
  }
  
  /**
   * Adds a formula object to Arraylist of formulas
   * @param Form the formula to be added to the database
   */
  public void addFormula(Formula Form){
    this.add(Form);
  }
  
  /**
   * removes the formula at  index i
   * @param i the index of the formula to be removed
   */
  public void rmFormula(int i){
    this.remove(i);
  }
  /**
   * return the size of the database as an int
   * @return size of the Database
   */
  public int getSize(){
    return this.size();
  }
}
