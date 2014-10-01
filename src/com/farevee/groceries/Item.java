package com.farevee.groceries;

/**
 * I consulted https://github.com/mauck/csc207-hw6/tree/master/src
 * in order to gain knowledge on this assignment.
 */

public interface Item
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Get the weight of an item
   */
  public Weight getWeight();
  
  /**
   * Get the price of an item
   */
  public int getPrice();
  
  /**
   * Get description of an item
   */
  public String toString();
  
}//interface Item
