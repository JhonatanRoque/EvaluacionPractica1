
package rectangulo;

import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Rectangulo objeto = new Rectangulo();
        
        try{
        
        System.out.println("Ingrese el ancho del rectangulo:");
        objeto.setAnchura(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese la longitud del rectangulo:");
        objeto.setLongitud(Double.parseDouble(leer.nextLine()));
        
        
        
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("El datos del rectangulo son los siguientes\n");
        System.out.println("El Perimetro del rectangulo es el siguiete: " + objeto.calcularPerimetro());
        System.out.println("El Area del rectangulo es el siguiente: " + objeto.calcularArea());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
        }catch (Exception e){
            System.out.println(e.getMessage());
    }
    }
    
}
