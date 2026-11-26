package negocio;

public class Tester extends Empleado{
    private int erroresDetectados;

    public Tester(String identificacion, String nombre, double salarioBase, int erroresDetectados) {
        super(identificacion, nombre, salarioBase);
        this.erroresDetectados = erroresDetectados;
    }

    public int getErroresDetectados() {
        return erroresDetectados;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.08 + erroresDetectados * 5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Cargo          : Tester\n"
                + "Errores        : " + erroresDetectados + "\n"
                + "Bono           : $" + String.format("%.2f", calcularBono()) + "\n"
                + "----------------------------\n";
    }
}
