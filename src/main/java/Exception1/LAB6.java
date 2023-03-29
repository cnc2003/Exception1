package Exception1;

public class LAB6 {
    public static void main(String[] args) {
        try{
        System.out.println(1/0);
        }
        catch(ArithmeticException e) {
            //e.printStackTrace(); //show stacktrace
            //System.out.println(e.getMessage());  // /by zero
            //System.out.println(e.toString()); //out: package source package
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            StackTraceElement[] st = e.getStackTrace();
            for (int i = 0; i < st.length; i++) {            
                System.out.println(st[i].getClassName());  //out : stack exception element
                System.out.println(st[i].getMethodName()); //out: method name
                System.out.println(st[i].getFileName()); // out: LAB6.java
                System.out.println(st[i].getLineNumber()); //out: line where have exception
            }
            
        }
    }
}
