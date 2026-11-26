package negocio;

import java.util.ArrayList;

public class RepositorioArchivos {
    private ArrayList<Archivo> archivos;

    public RepositorioArchivos() {
        archivos = new ArrayList<>();
    }

    public int cantidadArchivos() {
        return archivos.size();
    }

    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public Archivo buscarArchivo(String nombre) {
        for (Archivo a : archivos) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    public double calcularEspacioProcesadoTotal() {
        double total = 0;
        for (Archivo a : archivos) {
            total += a.calcularEspacioProcesado();
        }
        return total;
    }

    public String mostrarArchivos() {
        String resultado = "";
        for (Archivo a : archivos) {
            resultado += a.mostrarInformacion();
        }
        return resultado;
    }
}
