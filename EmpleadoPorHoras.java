public class EmpleadoPorHoras extends Empleado {
    
    //Atributos
    float tarifaHoraExtra;
    int horasExtras = 0;

    //Constructor
    public EmpleadoPorHoras (String n, float tarifaBase, float tarifaHExtra) {
        super(n, tarifaBase);
        tarifaHoraExtra = tarifaHExtra;
    }
    //Metodos
    public void setHorasExtras(int valor) {
        horasExtras = valor;
    }

    @Override
    public float calcularSalario(){
        return super.calcularSalario() + tarifaHoraExtra * horasExtras;

    }
}
