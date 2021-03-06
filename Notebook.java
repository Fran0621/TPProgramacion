/**
 * Notebook
 */
public class Notebook extends Producto {
    // Atributos
    private int memoriaram;
    private String procesador;

    /**
     * Constructor con los 7 @param
     * 
     * @param cod
     * @param nombre
     * @param marca
     * @param stock
     * @param precio
     * @param memoriaram
     * @param procesador
     *
     */
    public Notebook(int memoriaram, String procesador, int cod, String nombre, String marca, int stock, double precio, int reposicion) {
        super(cod, nombre, marca, stock, precio, reposicion);
        this.memoriaram = memoriaram;
        this.procesador = procesador;
    }

    public Notebook()
    {
        this(0, "s/d", 0, "s/d", "s/d", STOCK, PRECIO, 0);
    }

    // Getters
    public int getMemoriaram() {
        return memoriaram;
    }

    public String getProcesador() {
        return procesador;
    }

    // Setters
    public void setMemoriaram(int memoriaram) {
        this.memoriaram = memoriaram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nProcesador: " + getProcesador() + "\nMemoria Ram: " + getMemoriaram();
    }
   
}