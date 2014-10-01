package com.farevee.groceries;

public class Package
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  String food;
  Weight weight;
  int price;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new Package object
   * @param food
   * @param weight
   * @param price
   */
  public Package(String food, Weight weight, int price)
  {
    this.food = food;
    this.weight = weight;
    this.price = price;
  }//Package(String, Weight, int)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Returns a string that gives the weight of the package 
   * and the type of food
   */
  public String toString()
  {
    return this.weight.amount + this.weight.unit.abbrev() +
           " package of " + this.food;
  }//toString()
  
  /**
   * Get the weight of a package 
   */
  public Weight getWeight()
  {
    return this.weight;
  }//getWeight()

  /**
   * Get the price of a package
   */
  public int getPrice()
  {
    return this.price;
  }//getPrice()
  
  /**
   * Check to see if another object is a Package and 
   * has equal fields as this
   */
  public boolean equals(Object object)
  {
    if (object instanceof Package)
      {
        Package package_object = (Package) object;
        if (this.toString().equals(package_object.toString()))
          {
          return true;
          }
      }
    return false;
  }//equals(Package)
  
}//class Package
