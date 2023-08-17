package team.ed.test;

    /**
      * Esta clase se usara para desarrollar el concepto de referencias,
      * y asegurar una clase que podria ser usada como storage.
      *
      **/
public class Persona implements  Cloneable {
    public String nombre;
    public int edad;

    public Persona clone() throws CloneNotSupportedException { //Esta exception es por si el objeto no se puede clonar.
        return (Persona) super.clone(); //El casting es debido que el metodo clone de la clase Object devuelve un object.
    }

    // Este metodo crea una nueva direccion de memoria del tipo de la clase y le accina todos los atributos de la clase.


}
