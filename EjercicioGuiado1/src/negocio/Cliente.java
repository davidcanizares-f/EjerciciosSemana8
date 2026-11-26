package negocio;

public class Cliente extends Usuario {
    private String plan;

    public Cliente(String username, String correo, String plan){
        super(username, correo);
        this.plan = plan;
    }
    public String getPlan(){
        return plan;
    }
    @Override
    public String obtenerPermisos() {
        return "Usar el servicio y consultar su propia cuenta";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Cliente\n"
                + "Plan: " + plan + "\n"
                + "----------------------------\n";
    }
}
