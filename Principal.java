import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Catalogos;
import Entity.Menus;
import Entity.Productos;

public class Principal {

    private static List<Productos> productos;

    private static Productos producto;

    private static List<Catalogos> catalogos;

    private static Catalogos catalogo;

    private static List<Menus> menus;

    private static Menus menu;

    private static String nombreProducto;

    private static Float precioProducto;

    private static String nombreCatalogo;

    private static String nombreMenu;

    public static void main(String[] args) {
        System.out.println("Menu");
        Scanner leerDato = new Scanner(System.in);
        int opcion;
        do {
            String opcionesMenu = "1. Crear Menú." +
                    "2. Crear Catalogo."+
                    "3. Agregar Producto.";
            opcion = leerDato.nextInt();
            switch (opcion) {
                case 1:

                    break;

                default:
                System.out.println("Elige otra opción.");
                    break;
            }

        } while (opcion != 3);
        agregarNombreMenu();
        agregarCatalogo();
        agregarProductos();

    }

    public static void agregarNombreMenu() {
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Nombre del menú");
        nombreMenu = leerDato.nextLine();
        menu = new Menus(nombreMenu);
    }

    public static void agregarCatalogo() {
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Nombre del catalogo");
        nombreCatalogo = leerDato.nextLine();
        catalogo = new Catalogos(nombreCatalogo);
    }

    public static void agregarProductos() {
        Scanner leerDato = new Scanner(System.in);
        System.out.print("Nombre producto:");
        nombreProducto = leerDato.nextLine();
        System.out.print("Precio del producto:");
        precioProducto = leerDato.nextFloat();
        listarProductos(nombreProducto, precioProducto);
    }

    public static List<Productos> listarProductos(String product, Float precio) {
        producto = new Productos(product, precio);
        productos = new ArrayList<>();
        productos.add(producto);
        return productos;
    }

    public static void mostrarProductos(List<Productos> productos) {
        productos.stream().forEach((x) -> {
            System.out.println("Producto: " + x.getNombreProducto());
            System.out.println("Precio: " + x.getPrecioProducto());
        });
    }

}
