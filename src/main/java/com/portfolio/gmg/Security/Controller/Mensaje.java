
package com.portfolio.gmg.Security.Controller;

/**
 *
 * @author Gonzalo Martín
 */
public class Mensaje {
    private String mensaje;
    
    //Constructores

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    //Getters && Setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
