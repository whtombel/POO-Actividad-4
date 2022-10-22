package Animales;
/**
* Esta clase concreta denominada León es una subclase de Felino.
*/
public class Leon extends Felino{
    public String getSonido() {
        return "Rugido";
    }
    
    public String getAlimentos() {
        return "Carnívoro";
    }
    
    public String getHabitat() {
        return "Praderas";
    }
    
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
