//LocalVarible Example

public class LocalVariableEx2 {
    public static void main(String[] args)
    {
        // x is a local variable
        int x = 10;
 
        // message is also a local
        // variable
        String message = "Hello, world!";
 
        System.out.println("x = " + x);
        System.out.println("message = " + message);
 
        if (x > 5) {
            // result is a
            // local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }
 
       
 
        for (int i = 0; i < 3; i++) {
            String looping
                = "Iteration "
                  + i; // looping is a local variable
            System.out.println(looping);
        }
 
     
    }
}