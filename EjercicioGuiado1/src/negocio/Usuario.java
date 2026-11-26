package negocio;

public class Usuario {
    private String username;
    private String correo;

    public Usuario(String username, String correo){
        this.username = username;
        this.correo = correo;
    }

    public String getUsername(){
        return username;
    }
    public String getCorreo() {
        return correo;
    }

    public String obtenerPermisos() {
        return "Consultar informacion basica";
    }

    public String mostrarInformacion(){
        return ">Username: " + username + "\n" + ">Correo: " + correo + "\n";
    }
}
