package negocio;

public class NotificacionPush extends Notificacion {
    private String aplicacion;

    public NotificacionPush(String destinatario, String mensaje, String aplicacion) {
        super(destinatario, mensaje);
        this.aplicacion = aplicacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    @Override
    public String generarMensaje() {
        return "Tipo : Push\n"
                + "Dispositivo : " + getDestinatario() + "\n"
                + "Aplicacion : " + aplicacion + "\n"
                + "Mensaje : " + getMensaje() + "\n"
                + "----------------------------\n";
    }
}