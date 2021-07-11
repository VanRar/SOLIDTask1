import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Product> list;

    public DataBase() {
        this.list = new ArrayList<>();
    }

    public void add(Product product) {
        list.add(product);
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

}