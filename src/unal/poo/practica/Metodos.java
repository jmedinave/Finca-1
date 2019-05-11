
package unal.poo.practica;

import java.io.* ;
import javax.swing.JOptionPane;


public class Metodos {

//Escribe en el arcibo .txt
 public void Escribir(String nombre){
 File f; 
 FileWriter w;
 BufferedWriter bw;
 PrintWriter wr;

     try {
    f=new File(nombre);
    w=new FileWriter(f);
    bw=new BufferedWriter(w);
    wr=new PrintWriter(f);
    
    wr.write(String.valueOf(new Integer(5)));
wr.append("\n");
 wr.write(String.valueOf(new Integer(10)));
 wr.append("\n");
    
    
    wr.close();
    bw.close();
    
         
         
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null ,"Ha sucedido un error"+ e);
     }
 
 }
    
 //Lee del archivo .txt
 public void Leer(String nombreArchivo){
 
 File archivo;
     FileReader fr;
  BufferedReader br ; 
     
     try {
     archivo = new File(nombreArchivo);
     fr = new FileReader(archivo);
     br = new BufferedReader(fr);
     
         String linea ; 
         while((linea=br.readLine())!=null){
             System.out.println(linea);
         }
br.close();
fr.close();
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Hubo un error leyendo el archivo"+ e);
     }
        
 
 }
 
}
