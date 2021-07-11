public class Milk extends Product implements Count {
    //S: Single Responsibility Principle (Принцип единственной ответственности).
    //Класс должен быть ответственен лишь за что-то одно. Если класс отвечает за решение нескольких задач, его подсистемы,
    // реализующие решение этих задач, оказываются связанными друг с другом. Изменения в одной такой подсистеме ведут к изменениям в другой.
    //в нашем случае классы продуктовой корзины ничего, кроме как относящихся к ним параметров не реализуют

    public Milk(String name, int amount, int price) {
        super(name, amount, price);
    }

    @Override
    public Product buy(int amount) {
        if (getAmount() != 0) {
            return new Milk(this.getName(), amount, this.getPrice());
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
