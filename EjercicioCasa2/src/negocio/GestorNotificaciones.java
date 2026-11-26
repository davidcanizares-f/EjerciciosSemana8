package negocio;

import java.util.ArrayList;

public class GestorNotificaciones {
    private ArrayList<Notificacion> notificaciones;

    public GestorNotificaciones() {
        notificaciones = new ArrayList<>();
    }

    public int cantidadNotificaciones() {
        return notificaciones.size();
    }

    public void agregarNotificacion(Notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public String mostrarNotificaciones() {
        String resultado = "";
        for (Notificacion n : notificaciones) {
            resultado += n.generarMensaje();
        }
        return resultado;
    }
}
