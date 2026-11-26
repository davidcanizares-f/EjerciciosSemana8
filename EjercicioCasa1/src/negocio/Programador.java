package negocio;

public class Programador extends Empleado{
    private int proyectosEntregados;

    public Programador(String identificacion, String nombre, double salarioBase, int proyectosEntregados) {
        super(identificacion, nombre, salarioBase);
        this.proyectosEntregados = proyectosEntregados;
    }

    public int getProyectosEntregados() {
        return proyectosEntregados;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.10 + proyectosEntregados * 50;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Cargo : Programador\n"
                + "Proyectos  : " + proyectosEntregados + "\n"
                + "Bono : $" + String.format("%.2f", calcularBono()) + "\n"
                + "----------------------------\n";
    }
}
