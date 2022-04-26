package test_polimorfismo;

import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    private int Opc;
    private Scanner Input;

    public Menu() {
        Opc = 1;
        Input = new Scanner(System.in);
    }

    public int getOpc() {
        return Opc;
    }

    public void setOpc(int Opc) {
        this.Opc = Opc;
    }

    public void Menu() {
        System.out.println("Digita la opcion que desees:"
                + "\n1. Administrador"
                + "\n2. Auxiliar"
                + "\n3. Todero"
                + "\n4. Salir");
        this.setOpc(Input.nextInt());
    }

    public void Proceso() {
        Empleado Obj1;
        while (this.getOpc() > 0 && this.getOpc() < 5) {
            this.Menu();
            if (this.getOpc() == 1) {
                System.out.println("Bienvenido al menu de administrador");
                Obj1 = new Administrador();
                Obj1.Nombre();
                Obj1.Sueldo();
            }
            if (this.getOpc() == 2) {
                System.out.println("Bienvenido al menu de auxiliar");
                Obj1 = new Auxiliar();
                Obj1.Nombre();
                Obj1.Sueldo();
            }
            if (this.getOpc() == 3) {
                System.out.println("Bienvenido al menu de todero");
                Obj1 = new Todero();
                Obj1.Nombre();
                Obj1.Sueldo();
            }
            if (this.getOpc() == 4) {
                System.out.println("Gracias por su visita");
                exit(0);
            }
        }
    }
}
