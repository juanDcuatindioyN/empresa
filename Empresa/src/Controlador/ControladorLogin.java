/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author juan cuatindioy
 */
public class ControladorLogin implements DAOLogin{
    /**
     * declarar variables para guardar el usuario y contraseña.
     */
    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;
    
    /**
     * hace el llamado de la clase ControladorLogin en la variable controladorlogin y se implementa en el método ControladorLogin
     */
    private ControladorLogin() {
        
    }
    
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }

    @Override
     /**
     * guardar el usuario y contraseña correctos.
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("juan"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }

    @Override
     /**
     * nos retorna el nombre de usuario.
     */
    public String getUsuario() {
        return this.usuario;
    }

    @Override
     /**
     * cambiar contraseña por si se le ha olvidado al usuario.
     */
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}
