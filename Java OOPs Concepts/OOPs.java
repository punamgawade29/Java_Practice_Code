public class OOPs{
    // sw=software
    static String sw_name;
    static float sw_price;
 
    static void set(String n, float p)
    {
        sw_name = n;
        sw_price = p;
    }
 
    static void get()
    {
        System.out.println("Software name is: " + sw_name);
        System.out.println("Software price is: "
                           + sw_price);
    }
 
    public static void main(String args[])
    {
        OOPs.set("Visual studio", 0.0f);
        OOPs.get();
    }
}