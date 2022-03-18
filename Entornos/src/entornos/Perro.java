
package entornos;

public class Perro extends Mascota {
    private String raza;
    
    public Perro(String nombre, int edad, String raza){
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
        return  "nombre: "+this.getNombre()+" edad: "+ this.getEdad()+" raza: " + this.raza ;
    }
    
}
