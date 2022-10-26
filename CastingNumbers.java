
/**
 * Write a description of class CastingNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CastingNumbers
{
    public static void main(String[] args){
        //casting is temporarily treating a variable of one data type
        //as another data type
        
        System.out.println(6/4); //prints 1
        System.out.println(6.0/4); //prints 1.5
        System.out.println(6/4.0); //prints 1.5
        
        //to get 1.5 using casting
        System.out.println( (double)6/4); //also prints 1.5
    }
}
