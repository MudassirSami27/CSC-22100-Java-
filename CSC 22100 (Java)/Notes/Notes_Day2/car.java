package Notes.Notes_Day2;

public class car {
    //attribute
    private String model;
    private String color;
    private double engineSize;
    //default constructor
    /*public car(){
        color = "red";
        model = ""; // = "Toyata" / = "BMW" any of these values 
        engineSize = 5.65; 
    }*/
    // constructur with parameters
    public car(String model, String color, double engineSize){
        this.model = model;
        this.color = color;
        this.engineSize = engineSize;
    }
    
    
    // accelerate method
    public void accelerate (){
        System.out.println(model + " accelerating");
    }
    // 
    public void getColor(){
        System.out.println(color);
    }
    public void getModel(){
        System.out.println(model);
    }
    public void getengineSize(){
        System.out.println(engineSize);
    }
    protected void setColor(String color){
        this.color = color;
    }
} 

