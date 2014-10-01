package com.farevee.groceries;

public class BulkFood
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  String name;
  Units unit;
  int pricePerUnit;
  int supply;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BulkFood object
   * @param name
   * @param unit
   * @param pricePerUnit
   * @param supply
   */
  public BulkFood(String name, Units unit, int pricePerUnit, int supply)
  {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  }//BulkFood(String, Units, int, int)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Returns a string that gives the name of BulkFood
   */
  public String toString()
  {
    return this.name;
  }//toString()
  
  /**
   * Get the units of a BulkFood
   */
  public Units getUnit()
  {
    return this.unit;
  }//getUnits()
  
  /**
   * Get the price per unit of a BulkFood
   */
  public int getPricePerUnit()
  {
    return this.pricePerUnit;
  }//getPricePerUnit()
  
  /**
   * Get the supply of a BulkFood
   */
  public int getSupply()
  {
    return this.supply;
  }//getSupply()
  
  /**
   * Change the supply by amount of BulkFood
   */
  public void changeSupply(int amount)
  {
    this.supply -= amount;
  }//changeSupply(int)

}//class BulkFood
