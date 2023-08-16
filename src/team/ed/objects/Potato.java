package team.ed.objects;

public class Potato extends Product {

    //Constructores para no tener problema mas adelante con la implementacion de la clase.
    public Potato(){
        super();
    }

    // Sobrecargar de metodo para poder crear un objeto con marca al momento de la instancia.
    public Potato(String nom){
        super(nom);
    }
}
