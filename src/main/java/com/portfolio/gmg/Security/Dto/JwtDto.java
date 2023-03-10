package com.portfolio.gmg.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Gonzalo Martín
 */


public class JwtDto {
    private String token;
    private String Bearer = "bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;
    
    //Constructores

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }
    
    //Getters && Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return Bearer;
    }

    public void setBearer(String Bearer) {
        this.Bearer = Bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
}
