package ExamTests;

import java.util.Scanner;

public class Cat extends Animal {
    private int age;//since the superclass specifically makes the age private it cannot be modifief so I created a local variable labelled catAge
    
    public void getAge(){
        System.out.println(age); //outputs the age
    }
    public void setAge(int age){
        this.age = age;
    }
    public void animalSound(){ //Overloading animalSound method from superclass
        System.out.println("Meow!");
    }
    public void mood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("On a scale of 1 to 5, what's the cat's mood");
        
        int catMood = scanner.nextInt();
            switch(catMood){ //switch cases that displays the mood of the cat
                case 1:
                case 2:
                    System.out.println(":(");
                    break;
                case 3:
                    System.out.println(":|");
                    break;
                case 4:
                case 5:
                    System.out.println(":)");
                default:
                    System.out.println(":/");
            }
        }
    
    public static void main(String [] args){
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.setAge(2);
        myCat.getAge();
        myCat.mood();
    }
}
