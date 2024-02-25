package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Clase para probar el funcionamiento del código de un estudiante
 * 
 * @author Área de programación UQ
 * @since 2024-01
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Prueba para verificar que los datos de un estudiante estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        var estudiante = new Estudiante("Juan", "Gómez", "1032678049", "juanc.gomezr@uqvirtual.edu.co",
                "3222652623", (byte) 18);

        assertEquals("Juan", estudiante.getName());
        assertEquals("Gómez", estudiante.getLastName());
        assertEquals("1032678049", estudiante.getID());
        assertEquals("juanc.gomezr@uqvirtual.edu.co", estudiante.getMail());
        assertEquals("3222652623", estudiante.getPhone());
        assertEquals((byte) 18, estudiante.getAge());
        LOG.info("Finalización datosCompletos");
    }

    /**
     * Prueba para verificar que los datos de un estudiante no estén nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, (byte) 18));
        LOG.info("Finalización datosNulos");
    }

    /**
     * Prueba para verificar que el correo del estudiante este correcto
     */
    @Test
    public void edadNegativa() {
        LOG.info("Inicio datosNegativos");
        assertThrows(Throwable.class, () -> new Estudiante("Camila", "Alzate Rios", "109453264",
                "camila@uniquindio.edu.co", "315635674", (byte) -18));
        TesteadorDeEdadNegativa testeador = new TesteadorDeEdadNegativa();
        assertThrows(Throwable.class, testeador);
        LOG.info("Finalización datosNegativos");
    }

    private static class TesteadorDeEdadNegativa implements Executable {
        @Override
        public void execute() throws Throwable {
            new Estudiante("Camila", "Alzate Rios", "109453264",
                    "camila@uniquindio.edu.co", "315635674", (byte) -18);
        }
    }
}
