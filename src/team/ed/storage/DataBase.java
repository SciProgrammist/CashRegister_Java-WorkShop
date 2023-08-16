package team.ed.storage;

import team.ed.objects.Meat;
import team.ed.objects.Potato;
import team.ed.objects.Product;
import team.ed.objects.Rice;

/**
 *   será la encargada de administrar toda la información de los productos, al menos, del inventario.
 *   También va a almacenar todo el registro de las compras y ventas porque al final del día, se pretende
 *   saber el listado de compras y ventas y tener el del inventario.
 */
public class DataBase {

    // Declaracion de un array que almacenara SOLO productos:
    private Product[] products;

    // Cuando sé instancia una nueva base de datos se tendra un array con espacio para 3 productos:
    public DataBase(){

        products = new Product[3];
        Product potato = new Potato("Sabanera");
        Product rice = new Rice("Rico Arroz");
        Product meat = new Meat("Lomo de aguja");

        products[0] = potato;
        products[1] = rice;
        products[2] = meat;

    }
}
