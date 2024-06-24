package Assignments.Assignment02;

import java.util.Scanner;

public class Temperatures {
    public static void timeOfDay(int Temperatures[][]){
            //0 which is index [0,0] output morning
            //1-3 which is index [1,0], [2,0], [3,0] output afternoon
            //4-6 which is index [4,0, [5,0], [6,0] output evening
        for (int i = 0; i < Temperatures.length; i++) { 
                if(i == 0){
                    System.out.println(Temperatures[i][0] + " Morning");
                }
                else if(i > 0 && i < 4){
                   System.out.println(Temperatures[i][0] + " Afternoon"); 
                }
                else if(i > 3 && i < Temperatures.length){
                    System.out.println(Temperatures[i][0] + " Evening");
                }
        }
    }
    public static void MinMax(int Temperatures[][]){
        int minTemp = Temperatures[0][0];
        int maxTemp = Temperatures[0][0];
        for (int i = 0; i < Temperatures.length; i++){
            if (Temperatures[i][0] < minTemp){
                minTemp = Temperatures[i][0];
            }
            if (Temperatures[i][0] > maxTemp){
                maxTemp = Temperatures[i][0];
            }
        }
        System.out.println("Minimum: " + minTemp);
        System.out.println("Maximum: " + maxTemp);
    }
    

    public static void main(String [] args){
        int [][] temperatures = new int [7][1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select 7 random temperatures from -10 to 30 degrees celsius (input individually)");

        //Checks to see if user inputs correct temperature also initalizes the array using user input, making it random
        for (int i = 0; i < temperatures.length; i++){
            int temp;
            while (true){
                temp = scanner.nextInt();
                if (temp >= -10 && temp <= 30){
                    break;
                } else {
                    System.out.println("Invalid temperature, Please enter temperature in range from -10 to 30 degrees celsius");
                }
            }
            temperatures[i][0] = temp;
        }
        scanner.close();
        System.out.println("Displayed below is the designated time of day based on the inputted temperatures");
        timeOfDay(temperatures);
        MinMax(temperatures);
    }           
}
