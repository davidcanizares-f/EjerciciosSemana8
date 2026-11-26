package negocio;
import java.util.ArrayList;
public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios;
    public SistemaUsuarios(){
        usuarios = new ArrayList<>();
    }
    public int cantidadUsuarios() {
        return usuarios.size();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario encontrado = buscarUsuario(username);
        if (encontrado != null) {
            usuarios.remove(encontrado);
            return true;
        }
        return false;
    }

    public String mostrarUsuarios() {
        String resultado = "";
        for (Usuario u : usuarios) {
            resultado += u.mostrarInformacion();
        }
        return resultado;
    }

}
