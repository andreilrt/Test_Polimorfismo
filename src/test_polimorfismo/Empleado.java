package test_polimorfismo;

import java.util.Scanner;

public abstract class Empleado {

    public Scanner Input = new Scanner(System.in);
    private String Nombre = " ";

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public abstract void Nombre();

    public abstract void Sueldo();
}
