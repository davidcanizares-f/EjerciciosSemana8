package negocio;

public class Desarrollador extends Usuario{
    private String lenguaje;

    public Desarrollador(String username, String correo, String lenguaje) {
        super(username, correo);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public String obtenerPermisos() {
        return "Acceder al repositorio, subir codigo y ejecutar pruebas";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "Tipo: Desarrollador\n"
                + "Lenguaje: " + lenguaje + "\n"
                + "----------------------------\n";
    }
}
