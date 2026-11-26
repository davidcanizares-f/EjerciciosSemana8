package negocio;

public class Administrador extends Usuario {
    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion){
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }
    @Override
    public String obtenerPermisos(){
        return "Gestionar usuarios, configurar el sistema y ver reportes";
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + ">Tipo: Administrador" + "\n" + ">Nivel Administracion: " + nivelAdministracion
                + "\n" + "------------------------------\n";
    }

}
