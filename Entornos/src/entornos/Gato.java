
package entornos;

public class Gato extends Mascota{
    private String raza;
    
    public Gato(String nombre, int edad,String raza){
        super(nombre,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "nombre: "+this.getNombre() +" edad: "+this.getEdad() + "raza: " + this.raza;
    }
}
