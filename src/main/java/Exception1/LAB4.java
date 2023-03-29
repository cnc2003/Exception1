package Exception1;

public class LAB4 {
    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        catch (ArithmeticException e) {
            throw new StringIndexOutOfBoundsException();
        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
