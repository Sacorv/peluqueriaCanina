package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    //Se crea una instancia de la clase JpaController para poder acceder a sus métodos que ingresan los datos en nuestra BD
    MascotaJpaController mascotaJpa = new MascotaJpaController ();
    
    
    //Método para crear un nuevo registro en la DB.
    public void altaMascota(Mascota mascota){

        try {
            mascotaJpa.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
