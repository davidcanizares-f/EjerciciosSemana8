package negocio;

public class ArchivoAudio extends Archivo {
    private int duracionMinutos;

    public ArchivoAudio(String nombre, double tamanoMB, int duracionMinutos) {
        super(nombre, tamanoMB);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.8;
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Audio\n"
                + "Duracion: " + duracionMinutos + " min\n"
                + "Espacio procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB\n"
                + "----------------------------\n";
    }
}