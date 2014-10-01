package com.farevee.groceries;

public class Weight
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  Units unit;
  int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new Weight object
   * @param unit
   * @param amount
   */
  public Weight(Units unit, int amount)
  {
    this.unit = unit;
    this.amount = amount;
  }//Weight(String, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Returns a string with the amount and units 
   */
  public String toString()
  {
    if (this.amount > 1)
      {
        return this.amount + " " + this.unit.toString() + "s";
      }
    else
      {
        return this.amount + " " + this.unit.toString();
      }
  }//toString()
  
  /**
   * Get the name of the units 
   */
  public Units getUnit()
  {
    return this.unit;
  }//getUnits()

  /**
   * Get the amount 
   */
  public int getAmount()
  {
    return this.amount;
  }//getAmount()

}//class Weight
