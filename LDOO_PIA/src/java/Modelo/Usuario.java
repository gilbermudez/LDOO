/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Usuario {
    private String nombre;
    private String contra;
    
    public Usuario(String nombre,String contra){
        this.nombre=nombre;
        this.contra=contra;
        
    }

    /**
     * @return the nombre
     */
    public String getUsuario() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setUsuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public String getNombreCompleto(){
        return getUsuario() + "Contraseña:" + getContra();
    }
}
