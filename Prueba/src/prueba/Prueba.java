/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.*;


public class Prueba {

    private static Cliente c1;
 
    
    
    public static void main(String[] args) {
        
    }
    
    //metodo para soliticar ingreso INT
    
    private static Integer solicitoNum(String mensaje, Scanner input) {
        System.out.println(mensaje);
        return numeroIngresado(input.nextInt());
    
    }
    
    
    
    // Método para ingresar un cliente
    
    public static Cliente CargaCliente() {
        Scanner entrada = new Scanner(System.in);
        c1.setNombre("Ingrese un nombre: " + entrada); 
        c1.setDireccion("Ingrese una direccion: " + entrada.nextLine());
        System.out.println("Ingrese un departamento: ");                            //VER ACA COMO ACOMODARLO
        c1.setDepartamento(entrada.nextInt());
        System.out.println("Ingrese una edad: ");                       //VER ACA COMO ACOMODARLO
        c1.setEdad(entrada.nextInt()); 
        System.out.println("Ingrese un numero de celular: ");
        c1.setTelefono( entrada.nextInt());
        
        
    }
    
    
}
