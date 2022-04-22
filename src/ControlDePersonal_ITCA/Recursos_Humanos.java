
package ControlDePersonal_ITCA;

import java.util.Scanner;

public class Recursos_Humanos {
    private Scanner desde_teclado;
    private String nombre,direccion,numEdificio;
    private int Cargo,edad;
    private double salario,salario_Final, afp,isss,renta;
    

    
   public void inicializar() {
        desde_teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado:");
        nombre=desde_teclado.next();
        System.out.print("Ingrese la edad del empleado:");
        edad=desde_teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        salario=desde_teclado.nextDouble();
        System.out.print("Digite 1 si su cargo es por servicio y 2 si es permanente:");
        Cargo =desde_teclado.nextInt();
          System.out.print("Ingrese la direccion del empleado:");
        direccion=desde_teclado.next();
          System.out.print("Ingrese el numero de edificio:");
        numEdificio=desde_teclado.next();
    }

    public void imprimir_datos() {
        System.out.println("\n---------------------------------------------");
        System.out.println("Los datos del empleado son los siguientes");
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad + "años");
         System.out.println("Direccion: " + direccion);
         System.out.println("Número de edificio :" +numEdificio );
    }
    public void cargo() {
        if (Cargo==1) {
            renta= (salario * 0.10);
             salario_Final= (salario-renta);
             System.out.println("");
            System.out.print("El cargo del empleado " + nombre + " es por servicio y su salario final es : $" + salario_Final + "\n");
            
        } else if(Cargo==2){
             renta= (salario * 0.10);
             isss= (salario* 0.13);
             afp= (salario * 0.10);
             salario_Final= (salario-renta-isss-afp);
           
            System.out.print("\n" + "El cargo del empleado " + nombre + " es permanente y su salario final es : $" + salario_Final + "\n");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
        Recursos_Humanos datosPersona1es;
        datosPersona1es=new Recursos_Humanos();
        datosPersona1es.inicializar();
        datosPersona1es.imprimir_datos();
        datosPersona1es.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNomb();
        objeto.getCantidad_Dep();
        objeto.getCantidadDePisos();
        
         
         CodigoArea  codigo= new CodigoArea();
         codigo.getComputos();
         codigo.getBibliotecaW();
         codigo.getCancha();
         codigo.getLabo();
         codigo.getZona_Verde();
         
        System.out.println("---------------------------------------");
}
}



