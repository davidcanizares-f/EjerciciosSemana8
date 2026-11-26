package negocio;

public class Archivo {
    private String nombre;
    private double tamanoMB;

    public Archivo(String nombre, double tamanoMB) {
        this.nombre = nombre;
        this.tamanoMB = tamanoMB;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public double calcularEspacioProcesado() {
        return tamanoMB;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\n"
                + "Tamano: " + String.format("%.2f", tamanoMB) + " MB\n";
    }
}