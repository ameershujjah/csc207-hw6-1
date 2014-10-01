package com.farevee.groceries;

public class BulkItem
    implements Item
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  BulkFood food;
  Units unit;
  int amount;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BulkItem object
   * @param food
   * @param unit
   * @param amount
   */
  public BulkItem(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // BulkItem(BulkFood, Units, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Returns a string that gives the number of units, the units
   * and the type of bulk food
   */
  public String toString()
  {
    return this.getWeight() + " of " + this.food.toString();
  }//toString()

  /**
   * Get the weight of an item
   */
  public Weight getWeight()
  {
    return new Weight(this.unit, this.amount);
  }//getWeight()

  /**
   * Get the price of an item
   */
  public int getPrice()
  {
    return this.food.pricePerUnit * this.amount;
  }//getPrice()
  
  /**
   * Check to see if another object is a BulkItem and 
   * has equal fields as this
   */
  public boolean equals(Object object)
  {
    if (object instanceof BulkItem)
      {
        BulkItem bulkitem_object = (BulkItem) object;
        if (this.toString().equals(bulkitem_object.toString()))
          {
          return true;
          }
      }
    return false;
  }

}
