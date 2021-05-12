package desafio2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;


    public void calcularNomina(){
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof Directo) {
                System.out.println("El sueldo de "+ empleado.getNombre()+ " es: "+empleado.calcularSalario());
            }
        }
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof Freelance) {
                System.out.println("El sueldo de "+ empleado.getNombre()+ " es: "+empleado.calcularSalario());
            }
        }
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof Promotor) {
                System.out.println("El sueldo de "+ empleado.getNombre()+ " es: "+empleado.calcularSalario());
            }
        }
    }
    public void listarDirectos(){
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof Directo){
                System.out.println((empleado.getNombre()));
            }
        }
    }
    public void listarFreelance(){
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof  Freelance){
                System.out.println((empleado.getNombre()));
            }
        }
    }
    public void listarPromotores(){
        for (Empleado empleado:this.empleados) {
            if (empleado instanceof  Promotor){
                System.out.println((empleado.getNombre()));
            }
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List empleados) {
        this.empleados = empleados;
    }
}
