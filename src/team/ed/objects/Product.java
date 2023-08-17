package team.ed.objects;

public abstract class Product implements Cloneable{
    // Atributos de la clase abstracta producto:

    private String name;
    private int amount;
    private double price;

    /**
     * Constructor por defecto -Nota- el constructor por defecto en la clase abstracta es para que cuando se
     * herede de esta clase no exista problema al momento de usar el constructor super que viene de la clase padre.
     *
     **/
    public Product(){}

    // Constructor sobrecargado para poder creas productos con nombre:
    public Product(String name){
        this.name = name;
    }
    // Getters y Setters de los atributos de la clase abstracta:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    /**
     * Java está obteniendo un método llamado "toString()" el cual pertenece a la clase padre "Object".
     * Si no le especifica qué es lo que tiene que hacer toString() en el objeto lo que va a hacer es
     * mostrar cuál es la posición en memoria del objeto. Entonces, para mostrar el estado del objeto,
     * cuando se realiza la impresión por consola con la instrucción System.out.println(j), requiere
     * sobreescribir el método toString. En la clase abstracta debe sobreescribir el método toString.
     *
     */

    @Override
    public String toString(){
        return this.name + " - " + this.amount + " - " + this.price;
    } //El metodo se ejecuta de forma automatica y remplaza a la salida de consola la cual era una posicion de memoria.

    public Product clone() throws  CloneNotSupportedException{
        return (Product) super.clone();
    }


}
