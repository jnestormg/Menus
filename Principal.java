import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Menus;
import Entity.Productos;

public class Principal {

    private static List<Productos> productos;

    private static Productos producto;


    private static List<Menus> menus;

    private static Menus menu;

    private static String nombreProducto;

    private static Float precioProducto;

    private static String nombreCatalogo;

    private static String nombreMenu;

    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        int opcion;
        do {
            String opcionesMenu = "1. Crear Menú." +
                    "\n2. Crear Catalogo."+
                    "\n3. Agregar Producto.";
                    System.out.println(opcionesMenu);
            opcion = leerDato.nextInt();
            switch (opcion) {
                case 1:

                    break;

                default:
                System.out.println("Elige otra opción.");
                    break;
            }

        } while (opcion != 3);
       leerDato.close();
    }

    

}
