package Entity;

import java.util.List;

public class Menus {
    
    private String nombreMenu;

    private List<Catalogos> catalogos;


    public Menus() {
    }
    

    public Menus(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }


    public Menus(String nombreMenu, List<Catalogos> catalogos) {
        this.nombreMenu = nombreMenu;
        this.catalogos = catalogos;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public List<Catalogos> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogos> catalogos) {
        this.catalogos = catalogos;
    }    
    

}
