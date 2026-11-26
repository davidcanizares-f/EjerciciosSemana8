package negocio;

public class Soporte extends Usuario{
    private String turno;

    public Soporte(String username, String correo, String turno) {
        super(username, correo);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String obtenerPermisos() {
        return "Atender tickets y consultar cuentas de clientes";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Soporte\n"
                + "Turno: " + turno + "\n"
                + "----------------------------\n";
    }
}
