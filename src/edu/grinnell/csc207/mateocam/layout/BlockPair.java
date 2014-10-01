package edu.grinnell.csc207.mateocam.layout;

public class BlockPair
    implements TextBlock
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock contents;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new centered block of the specified width.
   */
  public BlockPair(TextBlock tb) 
      throws Exception
  {
        this.contents = tb;
  }//RightJustified(TextBlock, int)

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
        return this.contents.row(i) + this.contents.row(i);
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
    return this.contents.width() * 2;
  }//width()

}//class BlockPair
