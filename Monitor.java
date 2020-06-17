public class Monitor extends Producto {

    private int tasaRefresco;
    private double pulgadas;


    /**
     * Constructor con Parametros
     * @param cod
     * @param nombre
     * @param marca
     * @param stock
     * @param precio
     * @param tasaRefresco
     * @param pulgadas
     */
    public Monitor(int cod, String nombre, String marca, int stock, double precio, int tasaRefresco, double pulgadas){
        super(cod, nombre, marca, stock, precio);
        this.tasaRefresco = tasaRefresco;
        this.pulgadas = pulgadas;
    }

    /**
     * Constructor default
     */
    public Monitor(){
        this(0, "s/d", "s/d", STOCK, PRECIO, 0, 0);
    }

    // Getters
    public int getTasaRefresco() {
        return tasaRefresco;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    // Setters
    public void setTasaRefresco(int tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }
    
    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    // ToString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  super.toString() + "\nTasa de refresco: " + getTasaRefresco() + "Mhz" + "\nPulgadas: " + getPulgadas() + "''";
    }

}