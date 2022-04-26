package test_polimorfismo;

public class Administrador extends Empleado {

    @Override
    public void Nombre() {
        System.out.print("Ingrese su nombre: ");
        super.setNombre(super.Input.next());
    }

    @Override
    public void Sueldo() {
        System.out.println(super.getNombre()+" tu sueldo es de: 2'000.000");
    }
}
