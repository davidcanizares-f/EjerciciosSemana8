package negocio;

public class ArchivoVideo extends Archivo {
    private int duracionMinutos;

    public ArchivoVideo(String nombre, double tamanoMB, int duracionMinutos) {
        super(nombre, tamanoMB);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 2.5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo : Video\n"
                + "Duracion: " + duracionMinutos + " min\n"
                + "Espacio procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB\n"
                + "----------------------------\n";
    }
}