public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    private double dwidth;
    private double dheight;
    
    /*Constructor
    Copies the values of rectWidth and rectHeight
    into width and height, respectively*/
 
    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }
    
    /* Constructor
    Allows user to construct a square
    Copies the value of sidelength
    into both width and height*/
    
    public Rectangle(int sideLength){
        width = sideLength;
        height = sideLength;
    }

    /*Default Constructor
    Allows a user to construct a rectangle
    without specifying dimensions*/
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public Rectangle(){
        width = 0;
        height = 0;
    }
    
    public Rectangle(double squareSideLength){
        dwidth = squareSideLength;
        dheight = squareSideLength;
    }
    
    //this is okay because height is a double now
    public Rectangle(int rectWidth, double rectHeight){
        width = rectWidth;
        dheight = rectHeight;
    }
    
    //this is okay because even though it has one double and one int
    //like the constructor above, order matters
    public Rectangle(double rectWidth, int rectHeight){
        dwidth = rectWidth;
        height = rectHeight;
    }
    
    /*This below doesn't work because we already have int, int as
     * parameters in another constructor. Variables names +
     * don't matter, compiler looks at data types
    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }
        */
   
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
