
package ControlDePersonal_ITCA;

public class Edificio {
    String Ubicacion;
    String nomb;
    String cantidad_Dep;
    String cantidadDePisos;
    
    public Edificio(){
        
    }

    public Edificio(String Ubicacion, String nomb, String cantidad_Dep, String cantidadDePisos) {
        this.Ubicacion = Ubicacion;
        this.nomb = nomb;
        this.cantidad_Dep = cantidad_Dep;
        this.cantidadDePisos = cantidadDePisos;
    }

    public String getUbicacion() {
        System.out.println("Km 64 1/2 , desvío Hacienda El Nilo, sobre autopista a Zacatecoluca y Usulután, El Salvador ");        
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.Ubicacion = ubicacion;
    }

    public String getNomb(){ 
        System.out.println("ITCA - FEPADE Edificio C");
        return nomb;
    }

    public void setNomb(String nombreE) {
        this.nomb = nombreE;
    }

     
    public String getCantidad_Dep() {
        System.out.println("Cuatro departamentos ");
        return cantidad_Dep;
    }

    public void setCantidad_Dep(String cantidadDep) {
        this.cantidad_Dep = cantidadDep;
    }

    public String getCantidadDePisos() {
        System.out.println("tres pisos en el edificio C Y dos pisos en el edificio B");
        return cantidadDePisos;
    }

    public void setCantidadDePisos(String cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    

    

   
    }




