public class EmpleadoAsalariado extends Empleado {

    //Atributos
    float salarioMensual;

    //Constructor
    public EmpleadoAsalariado (String nombre, float salarioMensual) {
        super(nombre, 0);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public float calcularSalario() {
        return salarioMensual;
    }

    
}
