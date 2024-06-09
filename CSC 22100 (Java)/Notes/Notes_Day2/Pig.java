package Notes.Notes_Day2;

public class Pig extends Animal{
    public void animalSound(){
        System.out.println("Wee Wee");
    }
    public static void main(){
        Pig myPet= new Pig();
        myPet.animalSound();
        myPet.sleep();
    }
}
