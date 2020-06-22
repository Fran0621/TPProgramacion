
public class Main {
    public static void main(String[] args) {

        // Array
        GestionStock gs = new GestionStock();

        // Objects
        Producto m = new Monitor(1, "M-200", "Philips", 30, 400, 60, 25, 5);
        Producto m1 = new Monitor();
        Producto n = new Notebook(8, "intel", 2, "M-200", "dell", 25, 800, 10);
        Producto u = new Usb(25, "verb", "Verbatim", 10, 500, "negro", 32, 20);
        Producto u1 = new Usb(255, "kin", "Kingstone", 5, 500, "negro", 32, 20);

        // Cargo el array y uso de metodo 'agregarProducto(producto)' \\
        gs.agregarProducto(m);
        gs.agregarProducto(m1);
        gs.agregarProducto(n);
        gs.agregarProducto(u);
        gs.agregarProducto(u1);

        /* Prueba de metodos */

        //Agregar la cantidad de un producto\\
        System.out.println("Agregar cdad Producto\n");
        System.out.println(gs.agregarCdadProducto(1, 25));
        System.out.println("--------------------");
        System.out.println(gs.getListadoProductos()); //Corroboro stock
        System.out.println("||||||||||||||||||||||||||||");

        //Buscar por codigo\\
        System.out.println("Buscar por codigo\n");
        System.out.println(gs.buscarByCodigo(8));
        System.out.println("||||||||||||||||||||||||||||");

        //Listado de productos\\
        System.out.println("Listado de productos");
        System.out.println(gs.getListadoProductos());
        System.out.println("||||||||||||||||||||||||||||");

        //LIistado de productos filtrado por producto\\
        System.out.println("Liistado de productos filtrado por producto");
        System.out.println(gs.listadoProductosByProd(Monitor.class)); //le paso el filtro (.class necesario)
        System.out.println("||||||||||||||||||||||||||||");


        //Buscar por nombre o marca\\
        System.out.println("Buscar por nombre o marca\n");
        System.out.println(gs.buscarByNombreMarca("M", "dll")); //dos parametros
        System.out.println("--------------------");
        System.out.println(gs.buscarByNombreMarca("M-", "")); //solo nombre
        System.out.println("--------------------");
        System.out.println(gs.buscarByNombreMarca("", "Verbatim")); //solo marca
        System.out.println("--------------------");
        System.out.println(gs.buscarByNombreMarca("", "")); //ningun parametro
        System.out.println("||||||||||||||||||||||||||||");

        //Borrar cdad de productos\\
        System.out.println("Borrar cdad de productos");
        System.out.println("Cantidad inicial " + m.getStock()); //traigo el stock del producto (cod 1)
        System.out.println(gs.borrarCantidadProductos(1, 5));
        System.out.println("Cdad luego del metodo " + m.getStock()); //corroboro stock
        System.out.println("||||||||||||||||||||||||||||");

        //Borrar Producto\\
        System.out.println("Borrar Producto");
        System.out.println(gs.getListadoProductos()); //veo el array antes de borrar prod
        System.out.println("----------------------");
        System.out.println(gs.borrarProducto(8)); //false
        System.out.println(gs.borrarProducto(1));
        System.out.println("----------------------");
        System.out.println(gs.getListadoProductos()); //confirmo si borro
        System.out.println("||||||||||||||||||||||||||||");


        //Alerta de Stock\\
        System.out.println("Alerta de Stock");
        gs.alertaDeStock();

        /* Todo funcionando y correcto :) */
    }
}