public class Meat extends Product implements Weight {

    public Meat(String name, int amount, int price) {
        super(name, amount, price);
    }

    @Override
    public Product buy(int amount) {
        if (getAmount() != 0) {
            return new Meat(this.getName(), amount, this.getPrice());
        }
        return null;

    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAmount();
    }

    @Override
    public void weight() {
        System.out.println("Данный товар необходимо взвесить");
    }
}