package Animales;
/**
* Esta clase concreta denominada Lobo es una subclase de Cánido.
*/
public class Lobo extends Canido{
    public String getSonido() {
        return "Aullido";
    }
    
    public String getAlimentos() {
        return "Carnívoro";
    }
    
    public String getHabitat() {
        return "Bosque";
    }
    
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
