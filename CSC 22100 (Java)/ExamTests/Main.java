package ExamTests;


public class Main {
     

   // VS code seems to mark "System.out.println(name.length());" line as an error due to the string being named as null below is the quick fix for it
   @SuppressWarnings("null")
   public static void main(String[] args) {
     int[] numbers = {10, 20, 0};

     try {
       // Code that might throw exceptions
       for (int i = 0; i < numbers.length; i++) {
         int result = 100 / numbers[i];  // Potential ArithmeticException (division by zero)
         System.out.println(result);
         String name = null;  // Potential NullPointerException
         System.out.println(name.length());  // This line will throw first
     }
   }
   catch (ArithmeticException e) {
     System.out.println("ArithmeticException occurred: " + e.getMessage());
   } 
   catch (NullPointerException e) {
     System.out.println("NullPointerException occurred: " + e.getMessage());
   }
   catch (Exception e) {
     System.out.println("Unknown exception occurred: " + e.getMessage()); //catches any other exception that is in the try block
   }
   finally {
     System.out.println("try-catch has been processed");
   }

     System.out.println("Rest of the code...");
    }
}
