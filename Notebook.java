/**
 * Notebook
 */
public class Notebook extends Producto {
    // Atributos
    private String memoriaram;
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
    public Notebook(String memoriaram, String procesador, int cod, String nombre, String marca, int stock,
            double precio) {
        super(cod, nombre, marca, stock, precio);
        this.memoriaram = memoriaram;
        this.procesador = procesador;
    }

    public Notebook()
    {
        this("s/d", "s/d", 0, "s/d", "s/d", STOCK, PRECIO);
    }

    // Getters
    public String getMemoriaram() {
        return memoriaram;
    }

    public String getProcesador() {
        return procesador;
    }

    // Setters
    public void setMemoriaram(String memoriaram) {
        this.memoriaram = memoriaram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "\nProcesador: " + getProcesador() + "\nMemoria Ram: " + getMemoriaram();
    }
   
}