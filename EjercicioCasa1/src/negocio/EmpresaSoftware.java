package negocio;

import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int cantidadEmpleados() {
        return empleados.size();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleado(String identificacion) {
        for (Empleado e : empleados) {
            if (e.getIdentificacion().equals(identificacion)) {
                return e;
            }
        }
        return null;
    }

    public double calcularTotalBonos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularBono();
        }
        return total;
    }

    public String mostrarEmpleados() {
        String resultado = "";
        for (Empleado e : empleados) {
            resultado += e.mostrarInformacion();
        }
        return resultado;
    }
}
