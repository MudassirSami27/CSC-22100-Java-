package Notes.Notes_Day2;

public class testCar{
    public static void main() {
        //car BMW = new car();
        car Tesla = new car("Tesla", "grey", 5.56);
        //BMW.color = "blue";
        //car Tesla = new car();
        //System.out.println(Tesla.color);
        car BMW = new car("BMW", "blue", 6.7);
        BMW.accelerate();
        BMW.setColor("orange");
    }
}