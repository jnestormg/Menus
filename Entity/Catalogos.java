
package Entity;

import java.util.List;

public class Catalogos {
    
    private String nombreCatalogo;

    private List<Productos> productos;

    public Catalogos() {
    }

    
    public Catalogos(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }


    public Catalogos(String nombreCatalogo, List<Productos> productos) {
        this.nombreCatalogo = nombreCatalogo;
        this.productos = productos;
    }

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    

    
}
