
package rectangulo;

/*Ejercicio 1:

En un paquete rectangulo, cree una clase llamada Rectangulo con los atributos longitud y
anchura, cada uno con valor predeterminado de 1. Debe tener métodos para calcular el
perímetro y el área del rectángulo. Debe tener métodos para establecer (set) y obtener (get)
la longitud y la anchura. Los métodos establecer deben verificar que longitud y anchura sean
números de punto flotante mayores que 0.0 y menores que 20.0.
Agregue la clase PruebaRectangulo para probar la clase Rectangulo.

*/
public class Rectangulo {
    private double longitud;
    private double anchura;
    
    public Rectangulo(double longitud, double anchura){
        
    }
    public Rectangulo(){
        this.longitud=1;
        this.anchura=1;
    }
    
    //Metodo para calcular el perimetro
    public double calcularPerimetro(){
        return (2 * anchura) + (2 * longitud);
    }
//Metodo para calcular el area
    public double calcularArea(){
        return anchura * longitud;
    }
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0){
            this.longitud = longitud;
        }else
            throw new RuntimeException("La Longitud debe debe de ser > 0 < 20.0");
        }

    public double getAnchura(){
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0){
            this.anchura = anchura;
        }else{
            
        throw new RuntimeException("La Anchura debe debe de ser > 0 < 20.0");
    }
    }
}
