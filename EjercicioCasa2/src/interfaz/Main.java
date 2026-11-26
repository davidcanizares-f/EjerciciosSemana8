package interfaz;
import negocio.*;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Notificacion por email ---");
        System.out.print("Destinatario (correo): ");
        String dest1 = sc.nextLine();
        System.out.print("Mensaje: ");
        String msg1 = sc.nextLine();
        System.out.print("Asunto: ");
        String asunto = sc.nextLine();
        Notificacion n1 = new NotificacionEmail(dest1, msg1, asunto);
        System.out.println("\n--- Notificacion por SMS ---");
        System.out.print("Destinatario (nombre): ");
        String dest2 = sc.nextLine();
        System.out.print("Mensaje: ");
        String msg2 = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        Notificacion n2 = new NotificacionSMS(dest2, msg2, telefono);
        System.out.println("\n--- Notificacion push ---");
        System.out.print("Destinatario (dispositivo): ");
        String dest3 = sc.nextLine();
        System.out.print("Mensaje: ");
        String msg3 = sc.nextLine();
        System.out.print("Aplicacion: ");
        String app = sc.nextLine();
        Notificacion n3 = new NotificacionPush(dest3, msg3, app);

        System.out.println("\n--- Notificacion por Slack ---");
        System.out.print("Destinatario (usuario): ");
        String dest4 = sc.nextLine();
        System.out.print("Mensaje: ");
        String msg4 = sc.nextLine();
        System.out.print("Canal: ");
        String canal = sc.nextLine();
        Notificacion n4 = new NotificacionSlack(dest4, msg4, canal);

        System.out.println("\n=== MENSAJES GENERADOS ===");
        System.out.print(n1.generarMensaje());
        System.out.print(n2.generarMensaje());
        System.out.print(n3.generarMensaje());
        System.out.print(n4.generarMensaje());

        GestorNotificaciones gestor = new GestorNotificaciones();
        System.out.println("\nNotificaciones al inicio: " + gestor.cantidadNotificaciones());
        gestor.agregarNotificacion(n1);
        gestor.agregarNotificacion(n2);
        gestor.agregarNotificacion(n3);
        gestor.agregarNotificacion(n4);
        System.out.println("Notificaciones registradas: " + gestor.cantidadNotificaciones());

        System.out.println("\n=== LISTADO DEL GESTOR ===");
        System.out.print(gestor.mostrarNotificaciones());

        sc.close();
    }
}
