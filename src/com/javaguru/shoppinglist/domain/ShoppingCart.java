package shoppinglist.domain;

import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private String name;
    private List<Product> listOfProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "name='" + name + '\'' +
                ", listOfProducts=" + listOfProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(name, that.name) && Objects.equals(listOfProducts, that.listOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listOfProducts);
    }
}
