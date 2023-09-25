// Java program to illustrate role of this() in
// Constructor Overloading
public class Coverloading{
    double width, height, depth;
    int boxNo;
 
    // constructor used when all dimensions and
    // boxNo specified
    Coverloading(double w, double h, double d, int num)
    {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }
 
    // constructor used when no dimensions specified
    Coverloading()
    {
        // an empty box
        width = height = depth = 0;
    }
 
    // constructor used when only boxNo specified
 Coverloading(int num)
    {
        // this() is used for calling the default
        // constructor from parameterized constructor
        this();
 
        boxNo = num;
    }
 
    public static void main(String[] args)
    {
        // create box using only boxNo
        Coverloading box1 = new Coverloading(1);
 
        // getting initial width of box1
        System.out.println(box1.width);
    }
}