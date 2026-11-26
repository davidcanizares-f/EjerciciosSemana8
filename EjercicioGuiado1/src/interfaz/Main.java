package interfaz;

import negocio.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== USUARIOS DEL SISTEMA ===");

        System.out.println("\n=== Administrador ===");
        System.out.print("Username: ");
        String user1 = sc.nextLine();
        System.out.print("Correo: ");
        String correo1 = sc.nextLine();
        System.out.print("Nivel de administracion: ");
        int nivel = Integer.parseInt(sc.nextLine());
        Usuario u1 = new Administrador(user1, correo1, nivel);

        System.out.println("\n--- Desarrollador ---");
        System.out.print("Username: ");
        String user2 = sc.nextLine();
        System.out.print("Correo: ");
        String correo2 = sc.nextLine();
        System.out.print("Lenguaje principal: ");
        String lenguaje = sc.nextLine();
        Usuario u2 = new Desarrollador(user2, correo2, lenguaje);

        System.out.println("\n=== Cliente ===");
        System.out.print("Username: ");
        String user3 = sc.nextLine();
        System.out.print("Correo: ");
        String correo3 = sc.nextLine();
        System.out.print("Plan: ");
        String plan = sc.nextLine();
        Usuario u3 = new Cliente(user3, correo3, plan);

        System.out.println("\n=== Soporte ===");
        System.out.print("Username: ");
        String user4 = sc.nextLine();
        System.out.print("Correo: ");
        String correo4 = sc.nextLine();
        System.out.print("Turno: ");
        String turno = sc.nextLine();
        Usuario u4 = new Soporte(user4, correo4, turno);

        SistemaUsuarios sistema = new SistemaUsuarios();
        System.out.println("\nUsuarios al inicio: " + sistema.cantidadUsuarios());

        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);
        System.out.println("Usuarios despues de agregar: " + sistema.cantidadUsuarios());
        System.out.println("\n=== USUARIOS DEL SISTEMA ===");
        System.out.print(sistema.mostrarUsuarios());
        System.out.println("\n=== PERMISOS ===");
        System.out.println(u1.getUsername() + " -> " + u1.obtenerPermisos());
        System.out.println(u2.getUsername() + " -> " + u2.obtenerPermisos());
        System.out.println(u3.getUsername() + " -> " + u3.obtenerPermisos());
        System.out.println(u4.getUsername() + " -> " + u4.obtenerPermisos());

        System.out.println("\n=== BUSQUEDAS ===");
        System.out.print("Username a buscar: ");
        String b1 = sc.nextLine();
        Usuario r1 = sistema.buscarUsuario(b1);
        if (r1 != null) {
            System.out.println("Usuario encontrado:");
            System.out.print(r1.mostrarInformacion());
            System.out.println("Permisos: " + r1.obtenerPermisos());
        } else {
            System.out.println("No se encontro el usuario " + b1);
        }

        System.out.print("\nUsername a buscar (que no exista): ");
        String b2 = sc.nextLine();
        Usuario r2 = sistema.buscarUsuario(b2);
        if (r2 != null) {
            System.out.println("Usuario encontrado:");
            System.out.print(r2.mostrarInformacion());
        } else {
            System.out.println("No se encontro el usuario " + b2);
        }

        System.out.print("\nUsername a eliminar: ");
        String eliminar = sc.nextLine();
        if (sistema.eliminarUsuario(eliminar)) {
            System.out.println("Usuario " + eliminar + " eliminado del sistema.");
        } else {
            System.out.println("No se pudo eliminar: no existe " + eliminar);
        }
        System.out.println("Usuarios despues de eliminar: " + sistema.cantidadUsuarios());

        System.out.println("\n=== USUARIOS ACTUALES ===");
        System.out.print(sistema.mostrarUsuarios());


        sc.close();
    }
}
