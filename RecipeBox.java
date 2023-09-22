import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBox {
    
    //CREATING A LIST OF RECIPES ARRAYLIST TO HOLD ALL RECIPE OBJECTS
    
    public ArrayList<Recipe> listOfRecipes = new ArrayList<>();


    // CREATING A CONSTRUCTER TO INPUT RECIPE OBJECTS INTO ARRAY LIST DURING RECIPE BOX OBJECT CREATION

    public RecipeBox(ArrayList<Recipe> listOfRecipes) {
            this.listOfRecipes = listOfRecipes;
        }

    //DEFAULT CONSTRUCTER


    public RecipeBox() {
            this.listOfRecipes = new ArrayList<>();
        }


    // GIVING SOME METHODS :


    public ArrayList<Recipe> getListOfRecipes() {         //RETURNS ALL RECIPE OBEJCTS STORED IN THE ARRAY
            return listOfRecipes;
        }

    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {    //TO STORE NEW LIST OF RECIPES
            this.listOfRecipes = listOfRecipes;
        }

    public void printAllRecipeNames() {
            //loop through the ArrayList and print the recipe name of each
            for (int i = 0; i < listOfRecipes.size(); i++) {
                       
                System.out.println(listOfRecipes.get(i).getRecipeName());
            }
        }


    // FUNCTION TO PREINT A SPECIFIC RECIPE INFORMATION

    public void printAllRecipeDetails(Recipe selectedRecipe) {

            
            for (Recipe recipe : listOfRecipes) {
                
                if (recipe.equals(selectedRecipe)) {
                    recipe.printRecipe();
                    return;
                }
            }
        }

     // METHOD TO ADD A NEW RECIPE

    public void addNewRecipe() {
            Recipe newRecipe = new Recipe();
            listOfRecipes.add(newRecipe.createNewRecipe());
        }


    // METHOD TO DELETE A RECIPE

    public void removeRecipe(Recipe selectedRecipe) {
            
            int index = 0;
            
            for (Recipe recipe : listOfRecipes) {                //LOOP THROUGH THE RECIPES AND FIND THE ONE WE WANT TO DELETE,SAVE ITS INDEX
                
                if (recipe.equals(selectedRecipe)) {
                    
                    index = listOfRecipes.indexOf(selectedRecipe);
                }
            }

            //deletes recipe
            listOfRecipes.remove(index);
        }

    
       
}

    


        
    


    
    

    

    


        
        

