package Animales;
/**
* Esta clase concreta denominada Perro es una subclase de Cánido.
*/
public class Perro extends Canido{
    public String getSonido(){
        return "Ladrido";
    }
    
    public String getAlimentos(){
        return "Cárnivoro";
    }
    
    public String getHabitat(){
        return "Domestico";
    }
    
    public String getNombreCientifico(){
        return "Canis lupus familiaris";
    }
}
