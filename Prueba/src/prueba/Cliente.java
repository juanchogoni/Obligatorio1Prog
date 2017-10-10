package prueba;

/**
 *
 * @author JuanDiegoGoñi
 */
public class Cliente {
    
     // Definimos atributos de la clase
    
    private String nombre;
    private String direccion;
    private int departamento;
    private int edad;
    private int telefono;
    
    
     // Definimos constructor sin parametros
     
    public Cliente( ) {};

    // Definimos constructor con parametros
    
    public Cliente(String unNombre, String unaDireccion, int unDepartamento, int unaEdad, int unTelefono) {
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.departamento = unDepartamento;
        this.edad = unaEdad;
        this.telefono = unTelefono;
    }
    
    // Definimos get y set 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
     
    
    
    
    
}
