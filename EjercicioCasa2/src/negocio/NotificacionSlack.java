package negocio;

public class NotificacionSlack extends Notificacion {
    private String canal;

    public NotificacionSlack(String destinatario, String mensaje, String canal) {
        super(destinatario, mensaje);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    @Override
    public String generarMensaje() {
        return "Tipo: Slack\n"
                + "Usuario: @" + getDestinatario() + "\n"
                + "Canal: #" + canal + "\n"
                + "Mensaje: " + getMensaje() + "\n"
                + "----------------------------\n";
    }
}