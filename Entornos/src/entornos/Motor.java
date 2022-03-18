
package entornos;

public class Motor {
    private String fabricante;
    private String potencia;
    private int codigo;
    
    public Motor(){
        
    }
    
    public Motor(String fabricante, String potencia, int codigo){
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
