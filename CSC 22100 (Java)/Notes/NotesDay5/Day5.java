package Notes.NotesDay5;

public class Day5 {
    static void CheckAge(int Age){
        if (Age < 18){
            throw new ArithmeticException("Access Denied Must be Above 18"); //Exception that user created specifically for arithmetic
        }
        else {
            System.out.println("Access granted");
        }
    }
    static void CheckIndex(int i, int [] Array){
        if (i > Array.length){
            throw new ArrayIndexOutOfBoundsException("Index is beyond ");
        }
    }
    public static void main(String[] args){
        try {
            int [] Nums = {1,2,3,4};
        System.out.println(Nums[10]); //error
        } catch (Exception e){
            System.out.println("Wrong Index");
        } finally {
            System.out.println("try-catch has been processed");
        }
        CheckAge(15);
        CheckAge(20);
    }

}
