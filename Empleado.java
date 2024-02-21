public class Empleado{
    //Atributos
    String n;
    int horasTrabajadas = 0;
    float tarifaHoraTrabajada;

    //Constructor
    public Empleado(String nombre, float tarifa) {
        this.n = nombre;
        tarifaHoraTrabajada = tarifa;

    }
    //Metodos
    public float calcularSalario() {
        return horasTrabajadas * tarifaHoraTrabajada;
        }
    public void setHorasTrabajadas(int horas) {
        horasTrabajadas = horas;

        }
}