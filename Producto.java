/**
 * Prueba
 */
public class Producto {
    // Constantes
    private static final int STOCK = 0;
    private static final int PRECIO = 0;

    // Atributos
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
    public Producto(int cod, String nombre, String marca, int stock, double precio) {

        this.cod = cod;
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }

    /** 
     * Constructor por defecto
    */
    public Producto(){
        this(0, "s/d", "s/d", STOCK, PRECIO);
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
}