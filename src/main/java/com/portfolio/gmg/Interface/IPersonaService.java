
package com.portfolio.gmg.Interface;

/**
 *
 * @author Gonzalo Martín
 */
import com.portfolio.gmg.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de usuarios
    public List<Persona> getPersona();
    
    //Guardar un usuario
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por ID
    public void deletePersona(Long id);
    
    //Buscar un usuario por ID
    public Persona findPersona(Long id);
}