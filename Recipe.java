import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

    // CREATING RECIPE CLASS VARIABLES

    //arraylist for recipe ingredients which contains ingredient objects in it

    public ArrayList<Ingredient> recipeIngredients = new ArrayList();
    
    public String recipeName;
    
    public int servings;
    
    public int totalRecipeCalories;


    // Creating a constructor so that we can fill attribute info during object creation which will save time

     public Recipe(String recipeName, int servings, ArrayList<Ingredient> 
            recipeIngredients, int totalRecipeCalories){
        
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    
    
    //default constructor
    
     public Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0;
    }


    // Writing Recipe class methods:



     public String getRecipeName() {
        return recipeName;
    }

    
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }




    public int getServings() {
        return servings;
    }

    
    public void setServings(int servings) {
        this.servings = servings;
    }



    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }



    public int getTotalRecipeCalories() {

        return totalRecipeCalories;
    }


    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }




    // PRINT RECIPE FUNCTION TO PRINT RECIPE INFORMATION


    public void printRecipe() {

        
        System.out.println("Recipe: " + getRecipeName());   //Prints recipe name

        // PRINTING ALL INGREDIENTS

        for (int i = 0; i < getRecipeIngredients().size(); i++) {

            Ingredient ingredient = getRecipeIngredients().get(i);
            
            String ing = ingredient.nameOfIngredient + "\t" + "Number of cups: " + ingredient.NumberOfCups ;

            //prints the ingredients name and number of cups
            System.out.println(ing);
        }

    }


    public Recipe createNewRecipe() {

        //new instantiated ArrayList
        ArrayList <Ingredient> recipeIngredients = new ArrayList();

        Scanner scnr = new Scanner(System.in);

        boolean addMoreIngredients = true;

        Ingredient newIngredient = new Ingredient();

        System.out.println("Please enter the recipe name: ");
        recipeName =  scnr.next();

        System.out.println("Please enter servings: ");
        servings =  scnr.nextInt();

        System.out.println("Please enter totalRecipeCalories: ");
        totalRecipeCalories =  scnr.nextInt();

        do {
            System.out.println("Would you like to enter an ingredient? (y or n)");

            String reply = scnr.next().toLowerCase();

            switch (reply) {
                                  //if user wants to add new ingredient
                case "y": 
                    recipeIngredients.add(newIngredient.CreateNewIngredient());

                    break;

                // if user does not want to add more ingredients
                case "n":
                    addMoreIngredients = false;
                    break;
                
                default:
                    System.out.println("Enter 'y' or 'n'");
                    break;
            }
        } while (addMoreIngredients);




         //create object using constructor
        Recipe newRecipe = new Recipe(recipeName,servings, recipeIngredients, totalRecipeCalories);

        //return newly created object
        return newRecipe;

    }

}

    





    


    

