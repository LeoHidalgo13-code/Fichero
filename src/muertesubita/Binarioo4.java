package muertesubita;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Leo
 */
public class Binarioo4 {
     public static void main(String[] args) {
          FileInputStream fis = null;
        DataInputStream entrada = null;
          FileOutputStream fos = null;
        DataOutputStream salida = null;
        int filas1,columnas1,filas2,columnas2;
        int filas3, columnas3,filas4,columnas4;
        int filas5,columnas5, filas6, columnas6;
        int x,y,a,b,i,j;
        try {
            fis = new FileInputStream("C:\\archivosprueba\\matriz.dat");
            entrada = new DataInputStream(fis);
            filas1 = entrada.readInt();            //se lee el primer entero del fichero                           
            columnas1 = entrada.readInt();         //se lee el segundo entero del fichero
            filas2 = entrada.readInt();            //se lee el primer entero del fichero                           
            columnas2 = entrada.readInt();
            filas3 = entrada.readInt();
            columnas3 = entrada.readInt();
            filas4 = entrada.readInt();
            columnas4 = entrada.readInt();
            filas5 = entrada.readInt();
            columnas5 = entrada.readInt();
            filas6 = entrada.readInt();
            columnas6 = entrada.readInt();
            
             System.out.println("Matriz de "+filas3+" x "+columnas3+" \n");
            for (i = 0; i < filas3; i++) {
                for (j = 0; j < columnas3; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.print(entrada.readChar()+" ");
                }
                System.out.println();
            }
            
            
            
              System.out.println("Matriz de "+filas1+" x "+columnas1+" \n");
            for (i = 0; i < filas1; i++) {
                for (j = 0; j < columnas1; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.printf("%8.2f",entrada.readInt()+" ");
                }
                System.out.println();
            }
              System.out.println("Matriz de "+filas2+" x "+columnas2+" \n");
            for (i = 0; i < filas2; i++) {
                for (j = 0; j < columnas2; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.printf("%8.2f",entrada.readDouble());
                }
                System.out.println();
            }
              System.out.println("Matriz de "+filas4+" x "+columnas4+" \n");
            for (i = 0; i < filas4; i++) {
                for (j = 0; j < columnas4; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.printf("%8.2f",entrada.readFloat()+" ");
                }
                System.out.println();
            }
              System.out.println("Matriz de "+filas5+" x "+columnas5+" \n");
            for (i = 0; i < filas5; i++) {
                for (j = 0; j < columnas5; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.print(entrada.readBoolean()+" ");
                }
                System.out.println();
            }
              System.out.println("Matriz de "+filas6+" x "+columnas6+" \n");
            for (i = 0; i < filas6; i++) {
                for (j = 0; j < columnas6; j++) {  // se leen los double y se muestran por pantalla                
                    System.out.print(entrada.readLine()+" ");
                }
                System.out.println();
            }

            System.out.println("\nPrograma terminado");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("\nFin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
}