// Instance Variables
import java.io.*;
 
class InstanceVariables {
 
    // Declared Instance Variable
    public String g;
    public int i;
    public Integer I;
    public InstanceVariables()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Punam";
    }
 
    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
       InstanceVariables name = new InstanceVariables();
 
        
        System.out.println("My name is: " + name.g);
        System.out.println("Default value for int is "
                           + name.i);
       
        // toString() called internally
        System.out.println("Default value for Integer is "
                           + name.I);
    }
}