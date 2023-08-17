package team.ed.test;

public class Referencias {

    public static void main(String[] args) {
        Persona persona = new Persona();
        // En java todos los objectos se pasan por referencia...
        Persona otraPersona;

        //Ahora cambiamos los valores de los objectos creados...
        persona.nombre = "Pedro";
        persona.edad = 20;

        otraPersona = persona;
        otraPersona.nombre = "Carol";
        otraPersona.edad = 29;

        System.out.println("Nombre de persona: " + persona.nombre + " Edad: " + persona.edad);
        System.out.println("Nombre de otra persona: " + otraPersona.nombre + " Edad: " + otraPersona.edad);

        // Una manera de solucionar este problema es intentando lo siguiente:
        Persona segundaPersona = new Persona(); //Aqui estamos apartando una direccion de memoria para este tipo de dato.
        // segundaPersona.nombre = persona.nombre;
        // segundaPersona.edad = persona.edad;
        try {segundaPersona = persona.clone();
        } catch ( CloneNotSupportedException e) { e.printStackTrace();}
         segundaPersona.nombre = "Leidy";
        segundaPersona.edad = 15;
        /**
         *  NOTA: al momento de clonar vamos a tener que Java realiza una nueva direccion de memoria por lo cual se
         *  rompe la referencia y se pued manipular el objeto como uno nuevo, con la caracteristica que sus atributos
         *  ya estan poblados.
         */

        System.out.println("Nombre de segunda persona: " + segundaPersona.nombre + " Edad: " + segundaPersona.edad);

    }
}
