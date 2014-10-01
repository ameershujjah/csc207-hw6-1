package edu.grinnell.csc207.mateocam.layout;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of September 2014
 */
public class TBExpt
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");
    
    // Print out the block
    TBUtils.print(pen, block);
    
    TextBlock top = new CenteredBlock(new TextLine("Hello"), 11);
    TextBlock bottom = new CenteredBlock(new TextLine("Goodbye"), 11);
    TextBlock block1 = new BoxedBlock(new VComposition(top,bottom));
    TBUtils.print(pen, block1);
    
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
