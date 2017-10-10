/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author JuanDiegoGoñi
 */
public class Contrato {
    
     // Definimos atributos de la clase
    
    private Cliente ClienteC;
    private Dispositivo DispositivoD;
    private int anioContrato;
    private int costo;
    
    
     // Definimos constructor sin parametros
     
    public Contrato() {};

    // Definimos constructor con parametros
    
    public Contrato(Cliente unClienteC, Dispositivo unDispositivoD, int unAnioContrato, int unCosto) {
        this.ClienteC = unClienteC;
        this.DispositivoD = unDispositivoD;
        this.anioContrato = unAnioContrato;
        this.costo = unCosto;
    }
    
    // Definimos get y set 

    public Cliente getClienteC() {
        return ClienteC;
    }

    public void setClienteC(Cliente ClienteC) {
        this.ClienteC = ClienteC;
    }

    public Dispositivo getDispositivoD() {
        return DispositivoD;
    }

    public void setDispositivoD(Dispositivo DispositivoD) {
        this.DispositivoD = DispositivoD;
    }

    public int getAnioContrato() {
        return anioContrato;
    }

    public void setAnioContrato(int anioContrato) {
        this.anioContrato = anioContrato;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
