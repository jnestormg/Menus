package Entity;

import java.util.List;

public class Menus {

    private String nombreMenu;

    private List<Categorias> listaCategorias;

    public Menus() {
    }

    public Menus(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public List<Categorias> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categorias> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public void agregarCategorias(Categorias categoria) {
        listaCategorias.add(categoria);
    }

}
