public class Bread extends Product implements Count {


    public Bread(String name, int amount, int price) {
        super(name, amount, price);
    }

    @Override
    public Product buy(int amount) {

        if (getAmount() != 0) {
            return new Bread(this.getName(), amount, this.getPrice());
        }
        return null;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAmount();
    }

    @Override
    public void count() {
        System.out.println("данный товар считается поштучно");
    }
}