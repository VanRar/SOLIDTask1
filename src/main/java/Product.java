public abstract class Product implements Buy {
    //O (Open Closed Principle) принцип открытости-закрытости (Программные сущности (классы, модули, функции) должны быть открыты для расширения, но не для модификации.)
    //используем класс родитель, к нему имплементим метод покупки, что бы он был у всех наследников, в случае, если потребуется поменять данный метод или добавить новый продукт,
    //код программы, где будет применяться данный метод изменять не потребуется.
    private String name;
    private int amount;
    private int price;

    public Product(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}