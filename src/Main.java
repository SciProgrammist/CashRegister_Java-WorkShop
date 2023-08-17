import team.ed.objects.Product;
import team.ed.storage.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Product product = dataBase.getByIndex(0);
        System.out.println(product);


    }
}