package dominio.modelo;


public class Juego {
    private static Equipo[] equipos;

    Juego(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public static Juego construirEquipos(String equipoA, String equipoB) {
        equipos = new Equipo[2];
        return new Juego(equipos);
    }

    public Equipo[] getEquipos(){
        return equipos;
    }

}
