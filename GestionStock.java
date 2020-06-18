import java.util.ArrayList;

/**
 * GestionStock
 */
public class GestionStock {

    private ArrayList<Producto> listaProductos;

    public GestionStock() {
        listaProductos = new ArrayList<>();
    }

    public Producto BuscarByCOdigo(int codigo) {

        for (Producto p : listaProductos) {

            if (p.getStock() > 0 && codigo == p.getCod()) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> getListadoProductos() {
        return listaProductos;
    }

    public ArrayList<Producto> ListadoProductosBy(Producto producto) {
        ArrayList<Producto> arrayAux = new ArrayList<>();
        
        for (Producto p : listaProductos) {
            if (p.equals(producto)) {
                arrayAux.add(p);
            }
        }
        return arrayAux;
    }

    //Fran continua de aca
    /* public Producto BuscarProductoBy(String nombre, String marca){
        
    } */
}