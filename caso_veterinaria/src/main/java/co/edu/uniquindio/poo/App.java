package co.edu.uniquindio.poo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */


 public class App {
    public static void main(String[] args) {


        //Contador de cada especie y cantidad de animales
        int cantAnimales = 0;
        int contadorPerros = 0;
        int contadorGatos = 0;
        int contadorPez = 0;
        int contadorHamster = 0;
        int contadorRata = 0;
        int contadorVaca = 0;


        Animal[] animals = new Animal[] {

            // Creación e ingreso de las características de las mascotas

            new Animal("León","Perro", "Beagle", 3, "Masculino", "Azul", 3),

            new Animal("Marina", "Gato", "Persa", 4, "Femenino", "Blanco", 4),

            new Animal("Carlo", "Rata", "Blanca", 2, "Masculino", "Blanco", 1),

            new Animal("Scooby", "Perro", "Golden", 4, "Masculino", "Dorado", 13),

            new Animal("Shaggy", "Hamster", "Persa", 1, "Masculino", "Dorado", 2),

            new Animal("Angel", "Pez", "Payaso", 1, "Femenino", "Naranja", 1),

            new Animal("Marina", "Gato", "Persa", 4, "Femenino", "Blanco", 4),

            new Animal("Rufus", "Vaca", "Grande", 9, "Masculino", "Manchada", 90), //8 total
    
        };

        //Creación del mensaje

    Arrays.stream(animals).forEach(animal -> {
        System.out.println("------- ANIMAL ----------");
        System.out.println("Nombre: " + animal.name());
        System.out.println("Especie: " + animal.species());
        System.out.println("Raza: " + animal.race());
        System.out.println("Edad: " + animal.age());
        System.out.println("Sexo: " + animal.gender());
        System.out.println("Color: " + animal.color());
        System.out.println("Peso: " + animal.weight() + " kg/s." + '\n');

        // Salto de línea
        System.out.println(); 
    });
        
    //Prueba de impresión con un bucle for

        /*for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
    
            // Imprimimos la información de cada animal
            System.out.println("Nombre: " + animal.name());
            System.out.println("Especie: " + animal.species());
            System.out.println("Raza: " + animal.race());
            System.out.println("Edad: " + animal.age());
            System.out.println("Sexo: " + animal.gender());
            System.out.println("Color: " + animal.color());
            System.out.println("Peso: " + animal.weight());
    
           System.out.println(); // Salto de línea
        }*/


        for (Animal animal : animals) {
        //Incrementamos el contador por cada persona
            cantAnimales ++;
        };

        for (Animal animal : animals) {
            if (animal.species().equals("Perro")){
                contadorPerros ++;
            }
        }

        for (Animal animal : animals) {
            if (animal.species().equals("Gato")){
                contadorGatos ++;
            }
        }

        for (Animal animal : animals) {
            if (animal.species().equals("Pez")){
                contadorPez ++;
            }
        }

        for (Animal animal : animals) {
            if (animal.species().equals("Hamster")){
                contadorHamster ++;
            }
        }

        for (Animal animal : animals) {
            if (animal.species().equals("Rata")){
                contadorRata ++;
            }
        }

        for (Animal animal : animals) {
            if (animal.species().equals("Vaca")){
                contadorVaca ++;
            }
        }

        //Impresión de los contadores
        System.out.println("---- Aquí van los contadores ---- ");
        System.out.println("Cantidad de Perros es: " + contadorPerros);
        System.out.println("Cantidad de Gatos es: " + contadorGatos);
        System.out.println("Cantidad de Peces es: " + contadorPez);
        System.out.println("Cantidad de Hamsters es: " + contadorHamster);
        System.out.println("Cantidad de Ratas es: " + contadorRata);
        System.out.println("Cantidad de Vacas es: " + contadorVaca);
        System.out.println("La Cantidad total es de: " + cantAnimales + " animales" + '\n' + '\n');

    }
}