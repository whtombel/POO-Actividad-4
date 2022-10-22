package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class Apartamento extends InmuebleVivienda {

    //Constructor de la clase Apartamento

    public Apartamento(int identificadorInmobiliario, int área, String
    dirección, int númeroHabitaciones, int númeroBaños) {
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,númeroHabitaciones, númeroBaños);
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
