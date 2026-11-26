package negocio;

public class ArquitectoSoftware extends Empleado{
    private int sistemasDisenados;

    public ArquitectoSoftware(String identificacion, String nombre, double salarioBase, int sistemasDisenados) {
        super(identificacion, nombre, salarioBase);
        this.sistemasDisenados = sistemasDisenados;
    }

    public int getSistemasDisenados() {
        return sistemasDisenados;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15 + sistemasDisenados * 200;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Cargo: Arquitecto de software\n"
                + "Sistemas: " + sistemasDisenados + "\n"
                + "Bono  : $" + String.format("%.2f", calcularBono()) + "\n"
                + "----------------------------\n";
    }
}
