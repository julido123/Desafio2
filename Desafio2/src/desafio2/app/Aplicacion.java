package desafio2.app;

import desafio2.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {

        List<Empleado> empleados=new ArrayList<>();
        Nomina nomina = new Nomina();
        Empleado directo=new Directo("Juan",5360000);
        Empleado vendedor=new Vendedor("Julián",2450000,55510000);
        Empleado freelance=new Freelance("Johana",76000,85);
        Empleado vendedor1=new Vendedor("Carolina",990000,62487000);
        Empleado promotor=new Promotor("Pedro",1500,250,48);
        Empleado directo1=new Directo("David",2895000);
        Empleado freelace1=new Freelance("Gustavo",52500,60);

        empleados.add(directo);
        empleados.add(vendedor);
        empleados.add(freelance);
        empleados.add(vendedor1);
        empleados.add(promotor);
        empleados.add(directo1);
        empleados.add(freelace1);
        nomina.setEmpleados(empleados);

        nomina.calcularNomina();

        System.out.println("Los empleados directos son:");
        nomina.listarDirectos();
        System.out.println("Los empleados Freelance son:");
        nomina.listarFreelance();
        System.out.println("Los empleados Promotores son:");
        nomina.listarPromotores();

    }
}
