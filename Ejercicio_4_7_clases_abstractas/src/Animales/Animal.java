package Animales;
/**
* Esta clase abstracta denominada Animal modela un animal genérico
* que cuenta con atributos como un sonido, alimentos que consume,
* un hábitat y un nombre científico.
*/
public abstract class Animal {
    protected String sonido;
    protected String alimento;
    protected String habitad;
    protected String nombreCientifico;
    
    public abstract String getSonido();
    public abstract String getNombreCientifico();
    public abstract String getAlimentos();
    public abstract String getHabitat();
}
