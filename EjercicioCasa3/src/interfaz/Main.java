package interfaz;
import negocio.*;
import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        RepositorioArchivos repo = new RepositorioArchivos();

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n--- Archivo de texto " + i + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Tamano (MB): ");
            double tam = Double.parseDouble(sc.nextLine());
            System.out.print("Codificacion: ");
            String cod = sc.nextLine();
            Archivo a = new ArchivoTexto(nombre, tam, cod);
            repo.agregarArchivo(a);
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n--- Archivo de imagen " + i + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Tamano (MB): ");
            double tam = Double.parseDouble(sc.nextLine());
            System.out.print("Resolucion (ej. 1920x1080): ");
            String res = sc.nextLine();
            Archivo a = new ArchivoImagen(nombre, tam, res);
            repo.agregarArchivo(a);
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n--- Archivo de video " + i + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Tamano (MB): ");
            double tam = Double.parseDouble(sc.nextLine());
            System.out.print("Duracion (minutos): ");
            int dur = Integer.parseInt(sc.nextLine());
            Archivo a = new ArchivoVideo(nombre, tam, dur);
            repo.agregarArchivo(a);
        }

        System.out.println("\n--- Archivo de audio ---");
        System.out.print("Nombre: ");
        String nombreA = sc.nextLine();
        System.out.print("Tamano (MB): ");
        double tamA = Double.parseDouble(sc.nextLine());
        System.out.print("Duracion (minutos): ");
        int durA = Integer.parseInt(sc.nextLine());
        Archivo audio = new ArchivoAudio(nombreA, tamA, durA);
        repo.agregarArchivo(audio);

        System.out.println("\n=== ARCHIVOS DEL REPOSITORIO ===");
        System.out.println("Total de archivos: " + repo.cantidadArchivos() + "\n");
        System.out.print(repo.mostrarArchivos());

        System.out.println("\nEspacio procesado total: " + String.format("%.2f", repo.calcularEspacioProcesadoTotal()) + " MB");

        System.out.print("\nNombre del archivo a buscar: ");
        String buscar = sc.nextLine();
        Archivo encontrado = repo.buscarArchivo(buscar);
        if (encontrado != null) {
            System.out.println("Archivo encontrado:");
            System.out.print(encontrado.mostrarInformacion());
        } else {
            System.out.println("No se encontro el archivo " + buscar);
        }

        sc.close();
    }

}
