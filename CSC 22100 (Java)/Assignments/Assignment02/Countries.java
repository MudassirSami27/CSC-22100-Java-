package Assignments.Assignment02;

import java.util.ArrayList;



public class Countries {
    //method called ListSize that takes the size of the array list using the ArrayList as a parameter
    public static void ListSize(ArrayList<?> list){ //The integer is unknown so it can be versatile with other array lists and is being defined as that with ?
        System.out.println("Size of the List: " + list.size());
    }
    public static void main (String [] args){
        ArrayList<String> countries = new ArrayList<String>();
        //add at least three countries
        countries.add("Mexico");
        countries.add("South Korea");
        countries.add("New Zealand");
        countries.add("Bangladesh");

        System.out.println("Countries");
        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i) + " | Index: " + i);
        }
        ListSize(countries);
    }
}
