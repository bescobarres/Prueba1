package unitarias.dominio;

import dominio.modelo.Equipo;
import dominio.modelo.Juego;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @Test
    @DisplayName("Crear Juego")
    void crearJuegoBaseball() {
        //Arrange - Act
        Juego juego = Juego.construirEquipos("", "");
        //Assert
        assertNotNull(juego);
    }

    @Test
    @DisplayName("Crear juego con dos equipos")
    void crearJuegoConDosEquipos() {
        //Arrange - Act
        Juego juego = Juego.construirEquipos("equipoA", "equipoB");
        //Assert
        assertTrue(juego.getEquipos().length == 2);
    }



}
