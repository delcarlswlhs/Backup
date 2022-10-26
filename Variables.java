
/**
 * Write a description of class Variables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Variables
{
    public static void main(String[] args){
        //this is an integer type
        int myInteger = 6; //read right to left as in the value of 6 is assigned to myInteger.
        System.out.println(myInteger);
        myInteger = 4;
        System.out.println("My favorite number is " + myInteger);
        //This operation above is called concatenation and joins values.
        
        double myDouble = 3.14;
        
        double anotherDouble = 5; //you can store an int in a double.
        
        char myChar = 'a'; //single character value
        
        boolean nateWillPass = false; //can be true or false
        
        //what if you don't want a value to change?
        final double E = 2.71828;
        System.out.println(E);
        //E = 2.7;
        //This would cause an error E = 2.7;
    }
}
