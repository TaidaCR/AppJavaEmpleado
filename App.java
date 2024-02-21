public class App {
    public static void main(String[] args) {
    
        int numeroDeEmpleados;

        numeroDeEmpleados = 4; //tenemos que aprender a hacer input

        Empleado empleado1 = new Empleado("Alba", 10);
        empleado1.setHorasTrabajadas(40);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Belen", 2000);
        EmpleadoPorComision empleado3 = new EmpleadoPorComision("Wenceslao",100,(float)10);
        EmpleadoPorHoras empleado4 = new EmpleadoPorHoras("Carlos",15,20);
        empleado4.setHorasExtras(40);
        empleado4.setHorasTrabajadas(20);

        System.out.println(empleado1.n);
        System.out.println(empleado1.calcularSalario());
        System.out.println("Num Empleados " + numeroDeEmpleados);

        System.out.println(empleado2.n);
        System.out.println(empleado2.calcularSalario());

        System.out.println(empleado3.n);
        System.out.println(empleado3.calcularSalario());

        System.out.println(empleado4.n);
        System.out.println(empleado4.calcularSalario());
        

    }
}