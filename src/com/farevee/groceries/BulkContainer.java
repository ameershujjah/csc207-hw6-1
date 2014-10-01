package com.farevee.groceries;

public class BulkContainer
    extends BulkItem
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  String container;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BulkContainer object
   * @param container
   * @param food
   * @param unit
   * @param amount
   */
  public BulkContainer(String container, BulkFood food, Units unit, int amount)
  {
    super(food, unit, amount);
    this.container = container;
  }//BulkItem(String, BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Returns a string that gives the container, number of units, 
   * the units and the type of bulk food
   */
  public String toString()
  {
    return this.container + " of " + this.getWeight() + " of " + this.food.toString();
  }//toString()

  /**
   * Check to see if another object is a BulkContainer and 
   * has equal fields as this
   */
  public boolean equals(Object object)
  {
    if (object instanceof BulkContainer)
      {
        BulkContainer bulkcontainer_object = (BulkContainer) object;
        if (this.toString().equals(bulkcontainer_object.toString()))
          {
          return true;
          }
      }
    return false;
  }//equals(BulkContainer)

}//class BlukContainer
