package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class Casa extends InmuebleVivienda{
    protected int númeroPisos; 
    
    //Constructor de la clase Casa
    public Casa(int identificadorInmobiliario, int área, String dirección,
        int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños);
        this.númeroPisos = númeroPisos;
    }
    
    //Método que muestra en pantalla los datos de una casa
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + númeroPisos);
    }
}
