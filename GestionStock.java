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

    /**
     * Agrega cantidad deseada al stock del producto indicado (solo si la cantidad
     * que se desea agregar sea mayor a la existente)
     * 
     * Recibe:
     * 
     * @param cod
     * @param cantidad
     * 
     * @return true en caso de que lo haya agregado, false en caso contrario
     */
    public boolean agregarCdadProducto(int cod, int cantidad) {
        Producto p = buscarByCodigo(cod);

        if(p == null){
            return false;
        } else {
            p.setStock(p.getStock() + cantidad);
            return true;
        }
    }

    /**
     * Agrega un producto indicado a la lista de productos (ArrayList)
     * 
     * Recibe:
     * 
     * @param producto
     */
    public boolean agregarProducto(Producto producto) {
        Producto p = buscarByCodigo(producto.getCod());
        if (p == null) {
            listaProductos.add(producto);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Busca el producto por un criterio de mayor (o menor) a un precio
     * 
     * Recibe:
     * 
     * @param criterio
     * @param precio
     * 
     * @return Un listado con todos los productos que cumplieron con el criterio de
     *         busqueda.
     */
    public ArrayList<Producto> BuscarProductoPrecio(String criterio, double precio) {
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

    /**
     * Busca en la lista de productos (ArrayList) el producto que coincida con el
     * codigo indicado
     * 
     * Recibe:
     * 
     * @param codigo
     * 
     * @return true si encontro el producto, false en caso contrario.
     */
    public Producto buscarByCodigo(int codigo) {

        for (Producto p : listaProductos) {

            if (codigo == p.getCod() && p.getStock() > 0) {
                return p;
            }
        }
        return null;
    }

    /**
     * @return listaProductos
     */
    public ArrayList<Producto> getListadoProductos() {
        return listaProductos;
    }

    /**
     * Itera sobre listaProductos comparando si la clase del producto coincide con
     * la clase pasada por parametro
     * 
     * Recibe:
     * 
     * @param filtro
     * @return un array con los productos que coincidieron con el filtro
     */
    public ArrayList<Producto> listadoProductosByProd(Class<? extends Producto> filtro) {

        ArrayList<Producto> arrayAux = new ArrayList<>();

        for (Producto p : listaProductos) {
            if (p.getClass() == filtro) {
                arrayAux.add(p);
            }
        }
        return arrayAux;
    }

    /**
     * Busca por nombre o marca independientemente del dato que se le pase (es
     * decir, si se le pasa solo uno buscara por ese mismo parametro)
     * 
     * Recibe:
     * 
     * @param nombre
     * @param marca
     * 
     * @return un listado de todos los productos filtrados por el parametro (en el
     *         caso de que los parametros pasados esten vacios devuelve un array
     *         vacio)
     */
    public ArrayList<Producto> buscarByNombreMarca(String nombre, String marca) {
        ArrayList<Producto> arrayAux = new ArrayList<>();

        if (nombre.isEmpty() && marca.isEmpty()) {
            return arrayAux;

        } else {
            for (Producto p : listaProductos) {

                if (p.getNombre().toUpperCase().contains(nombre.toUpperCase())
                        || p.getMarca().toUpperCase().contains(marca.toUpperCase())) {
                    arrayAux.add(p);
                }
            }
            return arrayAux;
        }
    }

    // Metodos (Fabri)
    /**
     * Borra la cantidad pasada por parametro en stock del producto indicado
     * 
     * Recibe:
     * 
     * @param cod
     * @param cantidad
     * 
     * @return true si logró borrarlo, false en caso contrario
     */
    public boolean borrarCantidadProductos(int cod, int cantidad) {
        Producto p = buscarByCodigo(cod);

        if(p == null){
            return false;
        } else {
            if(p.getStock() >= cantidad){
                p.setStock(p.getStock() - cantidad);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Borra un producto de la lista, siempre y cuando su stock sea 0
     * 
     * Recibe:
     * 
     * @param cod
     * 
     * @return true si logró borrarlo, false en caso contrario
     */
    public boolean borrarProducto(int cod) {
        Producto p = buscarByCodigo(cod);
        if (p == null) {
            return false;
        } else {
            listaProductos.remove(p);
            return true;
        }
    }

    /**
     * Metodo vacio que devuelve un sysout de cada producto que este por debajo del
     * stock minimo
     */
    public void alertaDeStock() {
        int aux;
        for (Producto p : listaProductos) {
            if (p.getStock() < p.getReposicion()) {
                aux = p.getReposicion() - p.getStock();
                System.out.println(
                        "¡ATENCIÓN! El stock del/los productos " + p.getCod() + " es bajo, debe reponer: " + aux);
            }
        }
    }
}