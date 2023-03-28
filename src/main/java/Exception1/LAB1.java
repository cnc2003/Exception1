package Exception1;

public class LAB1 {
    public static void main(String[] args) {
    // a
    //    System.out.println(1/0);
    // Exception in thread "main" java.lang.ArithmeticException: 
    // by zero
    
    // b 
    //    int[] list = new int[5];
    //    System.out.println(list[5]);
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    // : Index 5 out of bounds for length 5
    
    // c
    //    String s = "abc";
    //    System.out.println(s.charAt(3));
    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException
    
    // d
    //    Object o = new Object();
    //    String d = (String) o;
    // Exception in thread "main" java.lang.ClassCastException
    // : class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
    
    // e
    //    Object o = null;
        /*Object o = new Object[]  */
    //    System.out.println(o.toString());
    // Exception in thread "main" java.lang.NullPointerException
    // : Cannot invoke "Object.toString()" because "o" is null
    
    // f 
    //    System.out.println(1.0/0);
    // exec-maven-plugin:3.0.0:exec (default-cli) @ exception1 ---
    // infinity
    }
}
