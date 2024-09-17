import java.util.ArrayList;
abstract class Empleados {
    protected String nombre;

    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return nombre + " - Salario: " + calcularSalario();
    }
}