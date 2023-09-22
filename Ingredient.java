import java.util.Scanner;

public class Ingredient {

    
//Creating variables for ingredient class
    
    
    String nameOfIngredient ;
   
    float NumberOfCups ;
    
    int NumberOfCaloriesPerCup ;
   
    int totalCalories ;


    // We create a ingredient constructer so that we can input all values to its attributes during object creation which will save time

    public Ingredient(String nameOfIngredient, float NumberOfCups, 
            int NumberOfCaloriesPerCup, int totalCalories) {

        this.nameOfIngredient = nameOfIngredient;
        this.NumberOfCups = NumberOfCups;
        this.NumberOfCaloriesPerCup = NumberOfCaloriesPerCup;
        this.totalCalories = totalCalories;
        
    }
    
    
    // default constructor
    
     public Ingredient() {
        this.nameOfIngredient = "";
        this.NumberOfCups = 0;
        this.NumberOfCaloriesPerCup = 0;
        this.totalCalories = 0;
    }


    // NOW LETS SET SOME METHODS FOR INGREDIENT CLASS

    public String getNameOfIngredient() {
        
        return nameOfIngredient;
    }


    public void setNameOfIngredient(String nameOfIngredient) {

        this.nameOfIngredient = nameOfIngredient;

    }



    public float getNumberOfCups() {

        return NumberOfCups;
    }

    
    public void setNumberOfCups(float NumberOfCups) {

        this.NumberOfCups = NumberOfCups;
    }


    public int getNumberOfCaloriesPerCup() {

        return NumberOfCaloriesPerCup;
    }

    
    public void setNumberOfCaloriesPerCup(int NumberOfCaloriesPerCup) {

        this.NumberOfCaloriesPerCup = NumberOfCaloriesPerCup;
    }



    public double getTotalCalories() {

        return totalCalories;
    }

    
    public void setTotalCalories(int totalCalories) {

        this.totalCalories = totalCalories;
    }


    public Ingredient CreateNewIngredient() {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the name of the ingredient:");
        nameOfIngredient =  scnr.next();

        System.out.println("Please enter the Number Of Cups:");
        NumberOfCups =  scnr.nextFloat();

        System.out.println("Please enter the Number Of Calories Per Cup:");
        NumberOfCaloriesPerCup =  scnr.nextInt();

        System.out.println("Please enter the total Calories:");
        totalCalories =  scnr.nextInt();

        //Create instance of this object
        Ingredient newIngredient = new Ingredient(nameOfIngredient, NumberOfCups, NumberOfCaloriesPerCup, totalCalories);

        //return the object
        return newIngredient;

}
}



    






    