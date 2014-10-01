package com.farevee.groceries;

public class ManyPackages
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  Package pack;
  int quantity;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new ManyPackages object
   * @param pack
   * @param quantity
   */
  public ManyPackages(Package pack, int quantity)
  {
    this.pack = pack;
    this.quantity = quantity;
  }//ManyPackages(Package, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Return a string description
   */
  public String toString()
  {
    return this.quantity + " x " + this.pack.toString();
  }//toString()
  
  /**
   * Get the weight of several packages 
   */
  public Weight getWeight()
  {
    return new Weight(this.pack.weight.unit, this.pack.weight.amount * this.quantity);
  }//getWeight()

  /**
   * Get the price of several packages 
   */
  public int getPrice()
  {
    return this.pack.price * this.quantity;
  }//getPrice()

  /**
   * Check to see if another object occupies
   * the same memory location as this 
   */
  public boolean equals(Object object)
  {
    if (this == object)
      {
        return true;
      }
    return false;
  }//equals(Object)

}//class ManyPackages
