import java.util.ArrayList;

/**
 * GestionStock
 */
public class GestionStock {
    private int cantidad;

    private final ArrayList<Producto> listaProductos;

    public GestionStock() {
        listaProductos = new ArrayList<>();
    }

    public boolean agregarCdadProducto(final int cod, final int cantidad) {
        for (final Producto p : listaProductos) {
            if (cod == p.getCod()) {
                p.setStock(cantidad);
                return true;
            }
        }
        return false;
    }

    public void agregarNuevoProducto(final Producto producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Producto> buscarProductoPrecio(final double precio, final String precioCriterio) {
        final ArrayList<Producto> arrayAux = new ArrayList<>();

        if (precioCriterio.equalsIgnoreCase("mayor a")) {
            for (final Producto p : listaProductos) {
                if(p.getPrecio() > precio){
                    arrayAux.add(p);         
                }

                if(p.getPrecio() < precio){
                    arrayAux.add(p);
                }
            }
        }
        return arrayAux;
    }
}