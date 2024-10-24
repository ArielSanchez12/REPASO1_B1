package JuegoRol;

public class Main {
    public static void main(String[] args) {

        Personaje personaje1 = new Personaje("Megaman", "0922837201",1998);
        System.out.println(personaje1.getNombre()); //Consultar la informacion usando solo getters
        System.out.println(personaje1.getTelefono());
        System.out.println(personaje1.getAnioNacimiento());

        personaje1.setTelefono("0928719302"); //Cambiar la informacion usando solo setters
        System.out.println("Nuevo numero de telefono del personaje: " + personaje1.getTelefono());
        //No se modifica nada mas que el telefono
    }
}