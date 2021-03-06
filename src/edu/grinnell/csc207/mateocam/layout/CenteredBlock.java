package edu.grinnell.csc207.mateocam.layout;

public class CenteredBlock
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
   * Create a new centered block of the specified width.
   */
  public CenteredBlock(TextBlock tb, int width) 
      throws Exception
  {
    if (width < tb.width())
      {
        throw new Exception(width + "is an invalid width");
      }
    else
      {
        this.width = width;
        this.contents = tb;
      }
  }//CenteredBlock(TextBlock, int)

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
        String space_string = TBUtils.spaces((this.width - this.contents.width())/2);
        return space_string + this.contents.row(i) + space_string;
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

}//class CenteredBlock
