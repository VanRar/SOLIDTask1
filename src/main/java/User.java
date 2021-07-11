import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Product> basket;

    public User(String name) {
        this.name = name;
        this.basket = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void buy(String[] productStr, DataBase dataBase) {
        Product product = null;
        for (Product p : dataBase.getList()) {
            if (p.getName().equals(productStr[0])) {
                product = p;
            }
        }
        basket.add(product.buy(Integer.parseInt(productStr[1])));
        product.setAmount(product.getAmount() - Integer.parseInt(productStr[1]));
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", basket=" + basket +
                '}';
    }
}