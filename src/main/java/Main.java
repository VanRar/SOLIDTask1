import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Milk milk = new Milk("Деревенское", 10, 100);
        Meat meat = new Meat("Говядина", 15, 500);
        Bread bread = new Bread("Домашний", 20, 35);

        DataBase dataBase = new DataBase();
        //Принцип подстановки Барбары Лисков
        //используем наследников, вместо родителей
        dataBase.add(milk);
        dataBase.add(meat);
        dataBase.add(bread);

        System.out.println("Введите своё имя");
        User user = new User(scanner.nextLine());

        while (true) {

            //DRY
            printOut(dataBase);

            System.out.println(user.getName() + ", введите через пробел наименование товара и кол-во для добавиления в корзину");
            String[] product = scanner.nextLine().split(" ");
            if ("0".equals(product[0])) break;
            user.buy(product, dataBase);
        }
        System.out.println("Список твоих покупок:" + user.getBasket());
        //Принцип разделения интерфейса (ISP)
        //клиенты не должны быть вынуждены реализовывать методы, которые они не будут использовать.
        //реализация такая себе, каждый интерфейс реализован отдельно, для каждого продукта,
        // в зависимости от того, надо ли его взвешивать или он штучный:
        bread.count();
        meat.weight();

    }

    public static void printOut(DataBase dataBase) {
        //Воспользуемся принципом Барбары Лисков для вывода наименования продуктов
        //ну и относитльно принцип магических чисел, так как не зависимо от того сколько продуктов, мы пройдёмся по всем.
        System.out.println("Продукты доступные к покупке:");
        for (Product product : dataBase.getList()) {
            System.out.print("Наименование:" + product.getName() + " доступное кол-во:" + product.getAmount() + " цена за ед.:" + product.getPrice() + "\n");

        }
    }
}