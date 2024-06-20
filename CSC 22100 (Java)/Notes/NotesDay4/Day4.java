package Notes.NotesDay4;

import java.util.ArrayList;
import java.util.Collections;

public class Day4 {
    public static void main(String[] args){
        //One Dimensional Array
        int num[] = {5, 3 , 7, 0, 1};
        int s = num.length;
        int sum = 0;;
        for(int i = 0; i < s; i++){
            sum += num[i];
        }
        System.out.println(sum);
        System.out.println(sum/s);

        //Two Dimensional Array
        System.out.println("Start of 2D Arrays:");
                            //This is 0     //This is 1
        int twoDArray[][] = {{5, 3, 7, 0}, {1, 11, 55, 9}};
        System.out.println(twoDArray[1][2]);
        System.out.println(twoDArray[0][3]);
        twoDArray[0][3] = 10;
        System.out.println(twoDArray[0][3]);
        System.out.println("Start of loop");
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                System.out.print(twoDArray[i][j] + " ");
            }
        }
        System.out.println();
        
        //Array List stuff
        System.out.println("Start of ArrayList:");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Tesla");
        System.out.println(cars);
        cars.add(0, "Honda");
        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(2, "Mazda");
        System.out.println(cars.get(2));
        cars.remove(1);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());

        /*ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(77);
        nums.add(10);
        Collections.sort(nums); //sorts the list, requires importing java.util.Collections
        */
        int n = 0;

        ArrayList<Integer> nums1 = new ArrayList<Integer>(n);

        nums1.add(4);

        nums1.add(43);

        nums1.add(2);

        nums1.remove(1);

        System.out.println(nums1);
    }
}
