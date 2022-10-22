package ejercicio_8.pkg1;
import java.util.Vector;

/**
 *
 * @author Jessica Vega
 */
public class ListaPersonas {
    
    Vector listaPersonas; 
   
    //Constructor
    public ListaPersonas() {
    listaPersonas = new Vector(); // Crea el vector de personas
    }
    
    //Método que permite agregar una persona al vector de personas
    public void añadirPersona(Persona p) {
    listaPersonas.add(p);
    }
    
    //Método que permite eliminar una persona del vector de personas
    public void eliminarPersona(int i) {
    listaPersonas.removeElementAt(i);
    }

    //Método que permite eliminar todos los elementos del vector de personas
 
    public void borrarLista() {
    listaPersonas.removeAllElements();
    }
}
