package Inscripcion;
public class Equipo {

    String nombreEquipo;
    Jugador jugadorInscrito;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void inscribirJugador(String nombre, int anioNacimiento, int nCamiseta) {
        jugadorInscrito = new Jugador(nombre, anioNacimiento, nCamiseta);
    }

    public void mostrarJugador() {
        if (jugadorInscrito != null) {
            System.out.println("Nombre: " + jugadorInscrito.getNombre());
            System.out.println("Año de nacimiento: " + jugadorInscrito.getAnioNacimiento());
            System.out.println("Numero de camiseta: " + jugadorInscrito.getnCamiseta());
        } else {
            System.out.println("No hay jugador inscrito.");
        }
    }
    /*
    public Jugador obtenerJugador() {
        return jugadorInscrito;
    }
     */
}
