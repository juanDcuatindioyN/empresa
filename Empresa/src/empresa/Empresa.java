/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author sistemas
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicializa la clase Login y hace el llamado del método getLogin
        Login login=Login.getLogin();
        //con el llamado de la clase login y el método será visible hace visible la interfaz gráfica de la clase login
        login.setVisible(true);
    }
    
}
