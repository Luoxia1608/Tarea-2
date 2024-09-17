import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Empleados> empleados = new ArrayList<>();
        empleados.add(new EmpleadoFijo("Luis Carlos Cachibany", 3000));
        empleados.add(new EmpleadoPorHora("Cecilia Perez", 160, 60));
        empleados.add(new EmpleadoFijo("Sergio Gonzales", 2500));
        empleados.add(new EmpleadoPorHora("Pedro Visidro", 120, 65));

        for (Empleados empleado : empleados) {
            System.out.println(empleado);
        }
    }
}