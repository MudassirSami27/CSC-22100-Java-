package Notes.NotesDay3;

public class Day3 {
    public static void MyMethod(){
        System.out.println("Hello World");
    }

    public static void main(String [] args){
        String str = "abc";
        System.out.println(str.toUpperCase()); 
        

        Math.max(12,25);
        Math.min(12,25);
        Math.abs(-12.5);
        Math.random(); //* 101
        
        int day = 0;
            
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Wrong number");
            }
        //while loop
        int i = 0;
        while (i < 6){
            System.out.println(i);
            i++;
        }
        //do while loop
        do {
            System.out.println(i);
            i++;
        }
        while (i < 6);
        //for loop
        for (int x = 6; x >= 0; x++){
            System.out.println(x);
        }
        for (int j = 0; j <= 10; j++){
            if (j % 3 == 0 && j != 0){
                System.out.println(j);
            }
        }
        for (int y = 0; y <= 100; y++){
            if(y==3){
                break;
            }
        }
        for (int z = 0; z <= 1000; z++){
            if (z==5){
                continue;
            } System.out.println(z);
        }   
        int[] num = {5,3,77,0};
        String[] car = {"BMW", "Toyota", "Tesla"};

        System.out.println(num[1]);
        for (String t: car){
            System.out.println(t);
        }
        for(int p = 0; p < 5; p++){
            MyMethod();
        }
        
    }
}
