package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    private static final Logger LOG = Logger.getLogger(AnimalTest.class.getName());
    /**
     * Prueba para verificar que los datos de un estudiante estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio verificación Datos completos");

        var animal = new Animal("León", "Perro", "Beagle", 3, "Masculino", "Azul", 3);

        assertEquals("León", animal.name());
        assertEquals("Perro", animal.species());
        assertEquals("Beagle", animal.race());
        assertEquals(3, animal.age());
        assertEquals("Masculino", animal.gender());
        assertEquals("Azul", animal.color());
        assertEquals(3, animal.weight());
        LOG.info("Fin verificación");
    }
    
    /*
     * Prueba para determinar que el animal no tiene datos nulos 
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio verificación datos nulos");
        assertThrows(Throwable.class, () -> new Animal(null, null, null, 0, null, null, 0));
        LOG.info("Fin verificación Datos nulos");
    }

    /*
     * Datos vacíos
     */
    @Test
    public void datosVacios() {
        LOG.info("Inicio verificación datos vacíos");
        assertThrows(Throwable.class, () -> new Animal("", "", "", 0, "", "", 0));
        LOG.info("Fin verificación datos vacíos");
    }
}
