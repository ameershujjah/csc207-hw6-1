package edu.grinnell.csc207.mateocam.layout;

public class Grid
    implements TextBlock
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  int width;
  int height;
  char ch;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Creates a new grid
   **/
  public Grid(int width, int height, char ch)
  {
    this.width = width;
    this.height = height;
    this.ch = ch;
  }
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine how many characters are in width.
   **/
  public int width()
  {
    return this.width;
  }//width()

  /**
   * Determine how many rows are in grid.
   **/
  public int height()
  {
    return this.height;
  }//height()

  /**
   * Return a string with width copies of ch. 
   * @param i < height
   **/
  public String row(int i)
  {
    StringBuffer ch_string = new StringBuffer();
    if ((i <= this.height) && (i >= 0))
      {
        for (int j = 0; j < this.width; j++)
          {
            ch_string.append(this.ch);
          }//for
      }//if
    return ch_string.toString();
  }//row(int)
  
}//class Grid
