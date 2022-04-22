
package ControlDePersonal_ITCA;

public class CodigoArea {
    String computos;
    String BibliotecaW;
    String Zona_Verde;
    String Laboratorio,Cancha;
    
    public CodigoArea(){
        
    }

    public CodigoArea(String computos, String Biblioteca, String Zona_Verde, String laboratorio, String Cancha) {
        this.computos = computos;
        this.BibliotecaW = Biblioteca;
        this.Zona_Verde = Zona_Verde;
        this.Laboratorio = laboratorio;
        this.Cancha = Cancha;
    }

    public String getComputos() {
        return computos;
    }

    public void setComputos(String computos) {
        this.computos = computos;
    }

    public String getBibliotecaW() {
        return BibliotecaW;
    }

    public void setBibliotecaW(String BibliotecaW) {
        this.BibliotecaW = BibliotecaW;
    }

    public String getZona_Verde() {
        return Zona_Verde;
    }

    public void setZona_Verde(String Zona_Verde) {
        this.Zona_Verde = Zona_Verde;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String Laboratorio) {
        this.Laboratorio = Laboratorio;
    }

    public String getCancha() {
        return Cancha;
    }

    public void setCancha(String Cancha) {
        this.Cancha = Cancha;
    }

    
}




