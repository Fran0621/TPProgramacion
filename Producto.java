/**
 * Producto
 */
public class Producto {
    // Constantes
    protected static final int STOCK = 0;
    protected static final int PRECIO = 0;

    // Atributos
    private int reposicion;
    private int cod;
    private String nombre;
    private String marca;
    private int stock;
    private double precio;

    /**
     * Constructor con los 5 @param
     * @param cod
     * @param nombre
     * @param marca
     * @param stock
     * @param precio
     */
    public Producto(int cod, String nombre, String marca, int stock, double precio, int reposicion) {

        this.cod = cod;
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
        this.reposicion = reposicion;
    }

    
    public Producto(){
        this(0, "s/d", "s/d", STOCK, PRECIO, 0);
    }

    // Getters
    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getReposicion() {
        return reposicion;
    }

    // Setters
    public void setCod(int cod) {
        this.cod = cod;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setReposicion(int reposicion) {
        this.reposicion = reposicion;
    }

    // ToString
    @Override
    public String toString() {
        return  "Codigo: " + getCod() + "\nNombre: " + getNombre() + "\nMarca" + getMarca() + "\nStock: " + getStock() + "\nPrecio: " + getPrecio();
    }
}