package Notes.NotesDay2;

public class Cat extends Animal {
    public String catName;

    public static void main(){
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.catName = "Brady";
        System.out.println(myCat.catName);
    }
}
