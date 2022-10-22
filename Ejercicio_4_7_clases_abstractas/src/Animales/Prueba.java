package Animales;
/**
* Esta clase prueba diferentes animales y sus métodos.
*/
public class Prueba {
/**
* Método main que crea un array de varios animales y para cada uno
* muestra en pantalla su nombre científico, su sonido, alimentos y
* hábitat
*/
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
        for(int i=0; i< animales.length; i++){/* Recorre el array de animales */
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHabitat());
            System.out.println();
        }
     
    }
    
}
