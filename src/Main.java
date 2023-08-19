import team.ed.objects.Product;
import team.ed.storage.DataBase;
import team.ed.views.View;

public class Main {
    public static void main(String[] args) {
        //DataBase dataBase = new DataBase();
        //Product product = dataBase.getByIndex(0);
        //System.out.println(product);

        /**
         *
         *  Note que, aunque se han realizado modificaciones del nombre, cantidad y precio,
         *  en el listado de la base de datos que tiene no ha cambiado. Esto se debe a que se
         *  ha protegido clonando cuando realiza el getByIndex, el cual devuelve un clone, es decir,
         *  una copia con todos los datos de ese objeto sin afectar la base de datos.
         *
         */
        //product.setName("Pastusa");
        //product.setAmount(10);
        //product.setPrice(1000);

        //Product[] products = dataBase.getAll();
        //for(Product v : products ) {
            //System.out.println(v);
        //}

        View.showHeaderPrincipal();
        View.showMenuPrincipal();



    }
}