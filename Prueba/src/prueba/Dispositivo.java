package prueba;

/**
 * Mariano Rodriguez - ??????
 * Juan Diego Goñi - 150549
 */
public class Dispositivo {
    
    // Definimos atributos de la clase
    
    private String codigo;
    private int tipo;
    private String modelo;
   
    // Definimos constructor sin parametros
     
    public Dispositivo( ) {};

    // Definimos constructor con parametros
    
    public Dispositivo(String unCodigo, int unTipo, String unModelo) {
        this.codigo = unCodigo;
        this.tipo = unTipo;
        this.modelo = unModelo;
    }
    
    // Definimos get y set 
        
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
    
}
