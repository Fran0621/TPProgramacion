import java.util.ArrayList;

/**
 * GestionStock
 */
public class GestionStock {

    private ArrayList<Producto> listaProductos;

    public GestionStock() {
        listaProductos = new ArrayList<>();
    }

    // Metodos (Alan)
    public boolean agregarCdadProducto(int cod, int cantidad) {
        for (Producto p : listaProductos) {
            if (cod == p.getCod()) {
                p.setStock(cantidad);
                return true;
            }
        }
        return false;
    }

    public void agregarNuevoProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Producto> buscarProductoPrecio(String criterio, double precio) {
        ArrayList<Producto> arrayAux = new ArrayList<>();

        if (criterio.equalsIgnoreCase("mayor a")) {
            for (Producto p : listaProductos) {
                if (p.getPrecio() > precio) {
                    arrayAux.add(p);
                }
            }
        }

        if (criterio.equalsIgnoreCase("menor a")) {

            for (Producto p : listaProductos) {
                if (p.getPrecio() < precio) {
                    arrayAux.add(p);
                }
            }
        }
        return arrayAux;
    }

    // Metodos (Fran)
    public Producto BuscarByCOdigo(int codigo) {

        for (Producto p : listaProductos) {

            if (codigo == p.getCod() && p.getStock() > 0) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> getListadoProductos() {
        return listaProductos;
    }

    public ArrayList<Producto> ListadoProductosByProd(Producto producto) {
        ArrayList<Producto> arrayAux = new ArrayList<>();

        for (Producto p : listaProductos) {
            if (p.equals(producto)) {
                arrayAux.add(p);
            }
        }
        return arrayAux;
    }

    public ArrayList<Producto> BuscarByNombreMarca(String nombre, String marca){

        ArrayList<Producto> arrayAux = new ArrayList<>();

        for (Producto p : listaProductos) {
            
            if(p.getNombre().toUpperCase().contains(nombre) || p.getMarca().toUpperCase().contains(marca)){
                arrayAux.add(p);
            }
        }
        return arrayAux;
    }

    //Metodos (Fabri)
    public boolean BorrarCantidadProductos(int cod, int cantidad)
    {
        for (Producto p : listaProductos) {
            if(p.getStock()>0)
            {
                if(cod==p.getCod())
                {
                 p.setStock(p.getStock()-cantidad);
                 return true;
                }
             }               
        }
        return false;
    }


    public boolean BorrarProducto(int cod)
    {
        for (Producto p : listaProductos) {
            if(p.getStock()==0)
            {
                if(cod==p.getCod())
                {
                    listaProductos.remove(p);
                    return true;
                }
            }
        }
        return false;
    }

    public void AlertaDeStock() {
        int aux;
        for (Producto p : listaProductos) {
            if (p.getStock() < p.getReposicion()) {
                aux = p.getReposicion()-p.getStock();             
                System.out.println("¡ATENCIÓN! El stock del producto es bajo, debe reponer: " + aux);
            }
        }
    }
}