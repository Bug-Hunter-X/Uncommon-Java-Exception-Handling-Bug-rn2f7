public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y; // potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            e.printStackTrace(); //Print full stack trace
        } finally {
            // Avoid potential exceptions in the finally block
            // Instead, handle potential exceptions separately.
            System.out.println("Program continues");
        }
    }
}