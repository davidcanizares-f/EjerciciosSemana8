package negocio;

public class NotificacionEmail extends Notificacion {
    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje, String asunto) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    @Override
    public String generarMensaje() {
        return "Tipo: Email\n"
                + "Para: " + getDestinatario() + "\n"
                + "Asunto: " + asunto + "\n"
                + "Mensaje: " + getMensaje() + "\n"
                + "----------------------------\n";
    }
}