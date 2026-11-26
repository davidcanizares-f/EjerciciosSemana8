package negocio;

public class Empleado {
    private String identificacion;
    private String nombre;
    private double salarioBase;

    public Empleado(String identificacion, String nombre, double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularBono() {
        return salarioBase * 0.05;
    }

    public String mostrarInformacion() {
        return "Identificacion : " + identificacion + "\n"
                + "Nombre  : " + nombre + "\n"
                + "Salario base : $" + String.format("%.2f", salarioBase) + "\n";
    }
}
