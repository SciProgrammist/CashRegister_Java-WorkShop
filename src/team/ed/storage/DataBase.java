package team.ed.storage;

import team.ed.objects.Meat;
import team.ed.objects.Potato;
import team.ed.objects.Product;
import team.ed.objects.Rice;

import java.util.ArrayList;
import java.util.List;


/**
 *   será la encargada de administrar toda la información de los productos, al menos, del inventario.
 *   También va a almacenar todo el registro de las compras y ventas porque al final del día, se pretende
 *   saber el listado de compras y ventas y tener el del inventario.
 */
public class DataBase {

    // Declaracion de un array que almacenara SOLO productos:
    private Product[] products; // clase abstracta Product. ya es posible tener un array de productos.
    private List<Product> purchases;
    private List<Product> sales;

    // Cuando sé instancia una nueva base de datos se tendra un array con espacio para 3 productos:
    public DataBase() {

        /**
          * Recordar que en los constructores es donde tenemos las instancias concretas
          * de las definiciones de nuestros atributos.
          *
          **/
        products = new Product[3];
        Product potato = new Potato("Sabanera");
        Product rice = new Rice("Rico Arroz");
        Product meat = new Meat("Lomo de aguja");

        products[0] = potato;
        products[1] = rice;
        products[2] = meat;

        purchases = new ArrayList<>();
        sales = new ArrayList<>();

    }


    // Metodos para regresar el Storage.
    public Product getByIndex(int index){

        if(index<0 || index>2){
            System.out.println("¡indice no valido!");
            return null;
        }

        // devolviendo un clone atrapando la excepcion
        Product result = null;
        try {
            result = products[index].clone();
        } catch (CloneNotSupportedException cnse) {
            System.out.println(cnse);
        }
        return result;
    }

    public Product[] getAll(){
        Product[] result = new Product[3];
        try{
            for(int c = 0; c<result.length; c++){
                result[c] = result[c].clone();
            }
        } catch (CloneNotSupportedException cnse) {
            System.out.println(cnse);

        }
        return products;
    }

    public void buy(Product product) {
        /**
         *  Para este metodo se esta trabajando con la clase abstracta Prodcut, por lo cual hay que determinar
         *  que producto se esta comprando para acceder a la posicion especifica del array (Meat, Potato, Rice)
         **/

        Product temp = null;
        switch (product.getClass().getSimpleName()){ //Product tiene un metodo que hereda de object, y con ese determinamos el nombre de clase.
            case "Potato":
                temp = products[0];
                break;
            case "Rice":
                temp = products[1];
                break;
            case "Meat":
                temp = products[2];
                break;
            default:
                System.out.println("No valido");
                break;

        }
        // Se modifica el inventario que se tiene:
        temp.setAmount(temp.getAmount() + product.getAmount());
        temp.setPrice(product.getPrice());
        // Se regristra la compra:
        purchases.add(product);

    }

    public void setSales(Product product) {

        Product temp = null;
        switch (product.getClass().getSimpleName()) {
            case "Potato":
                temp = products[0];
                break;
            case "Rice":
                temp = products[1];
                break;
            case "Meat":
                temp = products[2];
                break;
            default:
                System.out.println("No valido");

        }
                temp.setAmount(temp.getAmount() - product.getAmount());
                product.setPrice(temp.getPrice() * 1.25);
                sales.add(product);
    }

        public List<Product> getPurchases(){ return purchases;}

        public List<Product> getSales(){ return sales;}

}
