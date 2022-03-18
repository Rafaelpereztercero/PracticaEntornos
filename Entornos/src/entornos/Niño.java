package entornos;

public class Niño extends Persona{
    private String colegio;
    private Juguete juguete;
    
        public Niño(String nombre,String DNI,int edad,String colegio){
            super(nombre,DNI,edad);
            this.colegio = colegio;
        }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    public void comprarJuguete(String nombre,int precio, int edadRecomendada){
        juguete=new Juguete(nombre,precio,edadRecomendada);
    }
    
    @Override
    public String toString(){
        return "nombre: "+
                this.getNombre()+
                " DNI: "+
                this.getDNI()+
                " edad: "+
                this.getEdad()+
                " colegio: "+
                this.colegio;
    }
        
}
