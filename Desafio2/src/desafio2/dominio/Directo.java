package desafio2.dominio;

public class Directo extends Empleado{
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    public long calcularSalud(){
        return (long) (this.salario*0.07);
    }

    public long calcularPension(){
        return (long) (this.salario*0.065);
    }

    @Override
    public long calcularSalario() {
        long salario;
        salario=this.salario-calcularSalud()-calcularPension();
        return salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }


}
