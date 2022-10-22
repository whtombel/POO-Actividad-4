package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class InmuebleVivienda extends Inmueble {
    protected int númeroHabitaciones;
    protected int númeroBaños;

    // Constructor de la clase InmuebleVivienda

    public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección); 
        this.númeroHabitaciones = númeroHabitaciones;
        this.númeroBaños = númeroBaños;
    }

    //Método que muestra en pantalla los datos de un inmueble para la vivienda

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + númeroHabitaciones);
        System.out.println("Número de baños = " + númeroBaños);
        }
}


    

