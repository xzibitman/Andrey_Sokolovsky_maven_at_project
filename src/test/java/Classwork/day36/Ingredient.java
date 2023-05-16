package Classwork.day36;

import java.util.Objects;

public class Ingredient {
    private String itemdescription;
    private int quantity;

    public Ingredient(String itemdescription, int quantity) {
        this.itemdescription = itemdescription;
        this.quantity = quantity;
    }

    public String getDescription() {
        return itemdescription;
    }

    public void setDescription(String description) {
        this.itemdescription = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity == that.quantity && Objects.equals(itemdescription, that.itemdescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemdescription, quantity);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "description='" + itemdescription + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
