package desafio2.dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        long b=999999;
        long salario=super.getSalario();
        if (salario<=b){
            salario+=((this.ventasDelMes)*(0.05));
        }
        else {
            salario+=((this.ventasDelMes)*(0.045));
        }
        return salario;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
}
