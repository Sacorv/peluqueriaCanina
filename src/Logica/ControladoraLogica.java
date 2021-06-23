package Logica;

import Persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlDB = new ControladoraPersistencia();
    
    
    //Método para instanciar una nueva mascota
    public void guardarMascota( int numCliente, String nombreMascota, String raza, String color, String alergico, String atencionEsp, String duenio, String celular, String observacion){
        
        Mascota nuevaMascota = new Mascota();
        
        //Seteamos los datos que recibimos por parámetro desde la interfaz de usuario
        nuevaMascota.setNum_cliente(numCliente);
        nuevaMascota.setNombre_perro(nombreMascota);
        nuevaMascota.setRaza(raza);
        nuevaMascota.setColor(color);
        nuevaMascota.setAlergico(alergico);
        nuevaMascota.setAtencion_especial(atencionEsp);
        nuevaMascota.setNombre_duenio(duenio);
        nuevaMascota.setCelular_duenio(celular);
        nuevaMascota.setObservaciones(observacion);
        
        controlDB.altaMascota(nuevaMascota);
    }
    
}
