package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class CasaIndependiente extends CasaUrbana{

    protected static double valorArea = 3000000;
    //Constructor de la clase CasaIndependiente

    public CasaIndependiente(int identificadorInmobiliario, int área,String dirección, 
            int númeroHabitaciones, int númeroBaños, int númeroPisos) {
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,númeroHabitaciones, númeroBaños, númeroPisos);
    }
    
    //Método que muestra en pantalla los datos de una casa independiente
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
    
}
