package interfaz;

import negocio.*;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Programador ---");
        System.out.print("Identificacion: ");
        String id1 = sc.nextLine();
        System.out.print("Nombre: ");
        String nom1 = sc.nextLine();
        System.out.print("Salario base: ");
        double sal1 = Double.parseDouble(sc.nextLine());
        System.out.print("Proyectos entregados: ");
        int proy = Integer.parseInt(sc.nextLine());
        Empleado e1 = new Programador(id1, nom1, sal1, proy);

        System.out.println("\n--- Tester ---");
        System.out.print("Identificacion: ");
        String id2 = sc.nextLine();
        System.out.print("Nombre: ");
        String nom2 = sc.nextLine();
        System.out.print("Salario base: ");
        double sal2 = Double.parseDouble(sc.nextLine());
        System.out.print("Errores detectados: ");
        int errores = Integer.parseInt(sc.nextLine());
        Empleado e2 = new Tester(id2, nom2, sal2, errores);

        System.out.println("\n--- Disenador ---");
        System.out.print("Identificacion: ");
        String id3 = sc.nextLine();
        System.out.print("Nombre: ");
        String nom3 = sc.nextLine();
        System.out.print("Salario base: ");
        double sal3 = Double.parseDouble(sc.nextLine());
        System.out.print("Disenos entregados: ");
        int disenos = Integer.parseInt(sc.nextLine());
        Empleado e3 = new Disenador(id3, nom3, sal3, disenos);

        System.out.println("\n--- Arquitecto de software ---");
        System.out.print("Identificacion: ");
        String id4 = sc.nextLine();
        System.out.print("Nombre: ");
        String nom4 = sc.nextLine();
        System.out.print("Salario base: ");
        double sal4 = Double.parseDouble(sc.nextLine());
        System.out.print("Sistemas disenados: ");
        int sistemas = Integer.parseInt(sc.nextLine());
        Empleado e4 = new ArquitectoSoftware(id4, nom4, sal4, sistemas);

        System.out.print("\nNombre de la empresa: ");
        EmpresaSoftware empresa = new EmpresaSoftware(sc.nextLine());
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        System.out.println("\n=== EMPLEADOS DE " + empresa.getNombre().toUpperCase() + " ===");
        System.out.println("Total de empleados: " + empresa.cantidadEmpleados() + "\n");
        System.out.print(empresa.mostrarEmpleados());

        System.out.println("\n=== BONOS ===");
        System.out.println(e1.getNombre() + " -> $" + String.format("%.2f", e1.calcularBono()));
        System.out.println(e2.getNombre() + " -> $" + String.format("%.2f", e2.calcularBono()));
        System.out.println(e3.getNombre() + " -> $" + String.format("%.2f", e3.calcularBono()));
        System.out.println(e4.getNombre() + " -> $" + String.format("%.2f", e4.calcularBono()));
        System.out.println("Total de bonos: $" + String.format("%.2f", empresa.calcularTotalBonos()));

        System.out.print("\nIdentificacion a buscar: ");
        String buscar = sc.nextLine();
        Empleado encontrado = empresa.buscarEmpleado(buscar);
        if (encontrado != null) {
            System.out.println("Empleado encontrado:");
            System.out.print(encontrado.mostrarInformacion());
        } else {
            System.out.println("No se encontro el empleado " + buscar);
        }

        sc.close();
    }
}
