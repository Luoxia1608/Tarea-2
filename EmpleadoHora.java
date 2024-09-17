class EmpleadoPorHora extends Empleados {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHora(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }
}