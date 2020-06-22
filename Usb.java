/**
 * Usb
 */
public class Usb extends Producto {
    private String color;
    private int memoria;

    public Usb(int cod, String nombre, String marca, int stock, double precio, String color, int memoria, int reposicion){
        super(cod, nombre, marca, stock, precio, reposicion);
        this.color = color;
        this.memoria = memoria;
    }

    public Usb(){
        this(0, "s/d", "s/d", STOCK, PRECIO, "s/d", 0, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + getColor() + "\nMemoria: " + getMemoria();
    }
}
