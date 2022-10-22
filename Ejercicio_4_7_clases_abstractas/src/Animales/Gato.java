package Animales;
/**
* Esta clase concreta denominada Gato es una subclase de Felino.
*/
public class Gato extends Felino{
    public String getSonido() {
        return "Maullido";
    }
    
    public String getAlimentos() {
        return "Ratones";
    }
    
    public String getHabitat() {
        return "Doméstico";
    }
    
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
