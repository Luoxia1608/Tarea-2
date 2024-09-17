class EmpleadoFijo extends Empleados {
    private double sueldoFijo;

    public EmpleadoFijo(String nombre, double sueldoFijo) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSalario() {
        return sueldoFijo;
    }
}