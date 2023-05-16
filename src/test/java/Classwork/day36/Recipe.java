package Classwork.day36;


import java.util.List;
import java.util.Objects;

public class Recipe {
    private String recipname;
    private List<Ingredient> ingredientlist;
    private int preptime;

    public String getRecipname() {
        return recipname;
    }

    public void setRecipname(String recipname) {
        this.recipname = recipname;
    }

    public int getPreptime() {
        return preptime;
    }

    public void setPreptime(int preptime) {
        this.preptime = preptime;
    }

    public List<Ingredient> getIngredientlist() {
        return ingredientlist;
    }

    public void setIngredientlist(List<Ingredient> ingredientlist) {
        this.ingredientlist = ingredientlist;
    }

    public Recipe(String recipname, List<Ingredient> ingredientlist, int preptime) {
        this.recipname = recipname;
        this.ingredientlist = ingredientlist;
        this.preptime = preptime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return preptime == recipe.preptime && Objects.equals(recipname, recipe.recipname) && Objects.equals(ingredientlist, recipe.ingredientlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipname, ingredientlist, preptime);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipname='" + recipname + '\'' +
                ", ingredientlist=" + ingredientlist +
                ", preptime=" + preptime +
                '}';
    }
}
