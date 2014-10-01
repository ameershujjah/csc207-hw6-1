package edu.grinnell.csc207.mateocam.layout;

public class TruncatedBlock
    implements TextBlock
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  int width;
  TextBlock contents;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width)
  {
    this.width = width;
    this.contents = tb;
  }//TruncatedBlock(TextBlock, int)

  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Get the ith row of the block.
   * @param i < height
   * @throws Exception 
   */
  public String row(int i) 
      throws Exception
  {
    if ((i <= this.contents.height()) && (i >= 0))
      {
        return this.contents.row(i).substring(0, this.width);
      }//if
    else 
      {
        throw new Exception(i + "is an invalid row");
      }//else
  }//row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.contents.height();
  }//height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  }//width()
  
}//class TruncatedBlock
