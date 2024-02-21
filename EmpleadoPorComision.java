public class EmpleadoPorComision extends Empleado {
    
    //Atributos
    float totalVentas;
    float porcentajeComision;

    //Constructor
    public EmpleadoPorComision (String n, float totalVentas, float porcentajeComision) {
        super(n,0);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;

    }

    //Metodos
    public void tarifaPorComision (float valor) {
        porcentajeComision = valor;
    }

    @Override
    public float calcularSalario(){
        return totalVentas * (porcentajeComision/100);

    }

    //ARREGLAR









}
