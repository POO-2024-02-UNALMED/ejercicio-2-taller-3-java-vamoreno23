package gestionHumana;

public class Empleado {

    public final long cedula;
    public String nombre;
    String cargo;
    
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public boolean tengoPermiso() {
        return cargo.contains("Administrador");
    }
}