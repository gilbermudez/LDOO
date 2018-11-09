/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Autentificacion {
    public static boolean autenticar(String usuario, String password){
        if(usuario.equals("Gilberto")&& password.equals("lstifcfm")){
         return true;   
        }else{
            return false;
        }
    }
}
