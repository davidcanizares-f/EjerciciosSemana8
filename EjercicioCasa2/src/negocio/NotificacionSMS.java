package negocio;

public class NotificacionSMS extends Notificacion {
    private String telefono;

    public NotificacionSMS(String destinatario, String mensaje, String telefono) {
        super(destinatario, mensaje);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String generarMensaje() {
        return "Tipo: SMS\n"
                + "Destinatario : " + getDestinatario() + "\n"
                + "Telefono: " + telefono + "\n"
                + "Mensaje: " + getMensaje() + "\n"
                + "----------------------------\n";
    }
}