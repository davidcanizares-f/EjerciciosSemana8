package negocio;

public class ArchivoImagen extends Archivo {
    private String resolucion;

    public ArchivoImagen(String nombre, double tamanoMB, String resolucion) {
        super(nombre, tamanoMB);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.2;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Imagen\n"
                + "Resolucion: " + resolucion + "\n"
                + "Espacio procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB\n"
                + "----------------------------\n";
    }
}