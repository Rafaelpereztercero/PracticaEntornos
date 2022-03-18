
package entornos;

import java.util.Date;

public class Barco {
   private String nombre;
   private Date fechaConstruccion;
   private int numCamarotes;
   
   private Motor motor;
   
   public Barco(String nombre, Date fechaConstruccion, int numCamarotes){
       this.nombre = nombre;
       this.fechaConstruccion = fechaConstruccion;
       this.numCamarotes = numCamarotes;
       motor = new Motor();
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + '}';
    }
   
   
}
