package com.farevee.groceries;

public class NonFood
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  String name;
  Weight weight;
  int price;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new NonFood object
   * @param name
   * @param weight
   * @param price
   */
  public NonFood(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }//NonFood(String, Weight, int)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Returns a string that gives the name of
   * the non-food item
   */
  public String toString()
  {
    return this.name;
  }//toString()
  
  /**
   * Get the weight of a non-food item
   */
  public Weight getWeight()
  {
    return this.weight;
  }//getWeight()

  /**
   * Get the price of a non-food item 
   */
  public int getPrice()
  {
    return this.price;
  }//getPrice()
  
  /**
   * Check to see if another object is a NonFood and 
   * has equal fields as this
   */
  public boolean equals(Object object)
  {
    if (object instanceof NonFood)
      {
        NonFood nonfood_onject = (NonFood) object;
        if (this.name.equals(nonfood_onject.name)
            && this.weight.equals(nonfood_onject.weight)
            && this.price == nonfood_onject.price)
          {
            return true;
          }
      }
    return false;
  }//equals(NonFood)
  
}//class NonFood
