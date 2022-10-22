package ejercicio_4.pkg2;
/**
 *
 * @author Jessica Vega
 */
public class Oficina extends Local {
    
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    //Constructor de la clase Oficina
    
    public Oficina(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.esGobierno = esGobierno;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
