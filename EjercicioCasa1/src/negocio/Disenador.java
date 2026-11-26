package negocio;

public class Disenador extends Empleado {
    private int disenosEntregados;

    public Disenador(String identificacion, String nombre, double salarioBase, int disenosEntregados) {
        super(identificacion, nombre, salarioBase);
        this.disenosEntregados = disenosEntregados;
    }

    public int getDisenosEntregados() {
        return disenosEntregados;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.07 + disenosEntregados * 30;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Cargo : Disenador\n"
                + "Disenos  : " + disenosEntregados + "\n"
                + "Bono   : $" + String.format("%.2f", calcularBono()) + "\n"
                + "----------------------------\n";
    }
}
