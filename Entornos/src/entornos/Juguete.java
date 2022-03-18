package entornos;

public class Juguete {

    private String nombre;
    private int precio;
    private int edadRecomendada;

    public Juguete(String nombre, int precio, int edadRecomendada) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        return "Juguete: " + "nombre=" + nombre + ", precio=" + precio + ", edadRecomendada=" + edadRecomendada + '}';
    }

}
