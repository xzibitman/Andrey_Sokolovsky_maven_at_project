package Classwork.day36;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import io.cucumber.java.sl.In;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyParser {
    public static void main(String[] args) throws IOException {
        MyParser myParser = new MyParser();
        myParser.parseGSON();
        myParser.fromGSON();
    }

    public void parseGSON() throws IOException {
        String path = "src/test/resources/recipe.json";
        Gson gson = new Gson();
        Recipe recipe = gson.fromJson(new JsonReader(new FileReader(path)), Recipe.class);
        System.out.println(recipe.getIngredientlist());
        System.out.println(recipe.getPreptime());
        System.out.println(recipe.getRecipname());
    }

    public void fromGSON() {
        Gson gson = new Gson();
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("cheese", 15));
        ingredients.add(new Ingredient("water", 1000));
        ingredients.add(new Ingredient("sold", 1));
        ingredients.add(new Ingredient("potatoes", 8));
        Recipe recipe = new Recipe("CheeseSoup", ingredients, 120);
        System.out.println(gson.toJson(recipe));
    }
    public static String fromGSON(Search search) {
        Gson gson = new Gson();
        return gson.toJson(search);
    }
}
