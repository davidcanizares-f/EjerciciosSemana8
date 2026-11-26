package negocio;

public class ArchivoTexto extends Archivo {
    private String codificacion;

    public ArchivoTexto(String nombre, double tamanoMB, String codificacion) {
        super(nombre, tamanoMB);
        this.codificacion = codificacion;
    }

    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 0.5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Texto\n"
                + "Codificacion: " + codificacion + "\n"
                + "Espacio procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB\n"
                + "----------------------------\n";
    }
}