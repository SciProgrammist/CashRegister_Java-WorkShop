package team.ed.objects;

import java.awt.*;

public abstract class Product {
    // Atributos de la clase abstracta producto:

    private String nombre;
    private int amount;
    private double price;

    /**
     * Constructor por defecto -Nota- el constructor por defecto en la clase abstracta es para que cuando se
     * herede de esta clase no exista problema al momento de usar el constructor super que viene de la clase padre.
     *
     **/
    public Product(){}

    // Constructor sobrecargado para poder creas productos con nombre:
    public Product(String nombre){
        this.nombre = nombre;
    }
    // Getters y Setters de los atributos de la clase abstracta:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAmount() {
        return amount;
    }

    // Se modificara este SetAmout para que no pueda ingresar valores negativos:
    public void setAmount(int amount) {
        if(amount < 0 ){
            System.out.println("No puede asignar una cantidad negativa");
            return;
        } // No se utiliza el else como buena practica en este caso se uso el return para salir del metodo.
        this.amount = amount;
    }


    public double getPrice() {
        return price;
    }

    // Se procede a validar el metodo setPrice para que no puedan ingresar cantidades negativas:
    public void setPrice(double price) {
        if(price > 0 ) {
            System.out.println("No se puede colocar un precio negativo");
            return;
        }  // No se utiliza el else como buena practica en este caso se uso el return para salir del metodo.
        this.price = price;
    }
}
