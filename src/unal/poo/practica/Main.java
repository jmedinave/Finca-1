package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

      

public class Main
{    
     
      
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
         //Declarar la creacion de la ciudad
objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            

            
           
        // Vacas lote 1
            estudiante = new Robot(objetos,2, 3, Direction.SOUTH,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,4, 3, Direction.WEST,0);
           estudiante.setColor(Color.black);
           estudiante = new Robot(objetos,6, 5, Direction.NORTH,0);
           estudiante.setColor(Color.black);
           estudiante = new Robot(objetos,9, 2, Direction.EAST,0);
           estudiante.setColor(Color.black);
           estudiante = new Robot(objetos,11, 3, Direction.NORTH,0);
           estudiante.setColor(Color.black);
           estudiante = new Robot(objetos,13, 7, Direction.WEST,0);
           estudiante.setColor(Color.black);
           //vacas lote 2
            estudiante = new Robot(objetos,2, 14, Direction.EAST,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,6, 13, Direction.SOUTH,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,7, 15, Direction.NORTH,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,12, 11, Direction.SOUTH,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,3, 14, Direction.WEST,0);
            estudiante.setColor(Color.black);
            estudiante = new Robot(objetos,11, 15, Direction.NORTH,0);    
            estudiante.setColor(Color.black);
            
            //VACAS LOTE 3
             estudiante = new Robot(objetos,5, 22, Direction.EAST,0);
             estudiante.setColor(Color.black);
             estudiante = new Robot(objetos,5, 23, Direction.WEST,0);
             estudiante.setColor(Color.black);
             estudiante = new Robot(objetos,10, 21, Direction.NORTH,0);
             estudiante.setColor(Color.black);
             estudiante = new Robot(objetos,9, 21, Direction.SOUTH,0);
             estudiante.setColor(Color.black);
             estudiante = new Robot(objetos,4, 23, Direction.EAST,0);
             estudiante.setColor(Color.black);
             estudiante = new Robot(objetos,4, 24, Direction.WEST,0); 
             estudiante.setColor(Color.black);
             //llamo al metodo Escribir         
             Metodos m =new Metodos();
             m.Escribir("variables");
   // llamo al metodo Leer 
   m.Leer("variables");
   
             
             
             //pedir valores referencia de salud 
       /* int valorRefPulso;
        int variaPulsoMax;
        int variaPulsoMin;
        float valorRefRitmo;
        float variaRitmoMax;
        float variaRitmoMin;
        float valorRefTemp;
        float variaTempMax;
        float variaTempMin;
        Scanner entrada = new Scanner(System.in);    
        System.out.println("Ingrese el valor de referencia para el pulso:");
        valorRefPulso = entrada.nextInt();
        System.out.println("Ingrese el valor MAXIMO permitido para el pulso");
        variaPulsoMax = entrada.nextInt();
            System.out.println("Ingrese el valor MINIMO permitido para el pulso");
            variaPulsoMin = entrada.nextInt();
        System.out.println("Ingrese el valor de referencia para el ritmo cardiaco ");
        valorRefRitmo = entrada.nextFloat();
        System.out.println("Ingrese el valor MAXIMO permitido para el ritmo cardiaco ");
        variaRitmoMax = entrada.nextFloat();
        System.out.println("Ingrese el valor MINIMO permitido para el ritmo cardiaco ");
        variaRitmoMin = entrada.nextFloat();
        System.out.println("Ingrese el valor de refencia para la temperatura ");
        valorRefTemp = entrada.nextFloat();
         System.out.println("Ingrese el valor MAXIMO permitido para la temperatura ");
         variaTempMax = entrada.nextFloat();
         System.out.println("Ingrese el valor MINIMO permitido para la temperatura ");
         variaTempMin = entrada.nextFloat();
            
            
           //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            //Girar a la izquierda
            estudiante.turnLeft();
         */ 

        //Escribe en el arcibo .txt
        }}