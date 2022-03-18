
package entornos;

public class Adulto extends Persona{
    private String NSS;
    private String direccion;
    
    public Adulto(String nombre, String DNI, int edad ,String NSS, String direccion){
        super(nombre,DNI,edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre: "+this.getNombre()+" DNI: "+this.getDNI()+" edad: "
                +this.getEdad()+ " NSS: " + this.NSS + " direccion: " + this.direccion ;
    }
    
    
}
