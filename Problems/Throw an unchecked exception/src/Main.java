public class Main {

    public static void method() {
        // Write your code here
        throw new RuntimeException("My Exception");
    }

    /* Do not change code below */
    public static void main(String[] args) throws RuntimeException {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}