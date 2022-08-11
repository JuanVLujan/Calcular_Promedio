/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Valencia
 */
public class JavaApplication8 {

   
    
    public static void main(String[] args) 
    {
       int nnotas = 0; int contador = 1; 
       float nota; float suma = 0; float promedio;
       int sw = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Todas las notas tienen el mismo valor? 1. Si  2. No"));
       nnotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de notas a calcular"));
        while (nnotas < 0)
               {
                   nnotas = Integer.parseInt(JOptionPane.showInputDialog(null,"La cantidad de notas ingresadas no es valida, inserte el número de notas a promediar"));
               }
       if (sw == 1)
       {           
           while (contador <= nnotas)
           {
               nota = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la CALIFICACIÓN de la nota " + contador));
               while (nota > 5 | nota < 0)
               {
                   nota = Float.parseFloat(JOptionPane.showInputDialog(null,"La calificación ingresada no es valida, ingrese la CALIFICACIÓN de la nota #" + contador));
               }
               suma = suma + nota;
               contador++;
           }
           promedio = suma/nnotas;
       }
       else
       {
           while (contador <= nnotas)
           {
              float porcentaje = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el PORCENTAJE de la nota #" + contador));
              nota = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la CALIFICACIÓN de la nota #" + contador));
              while (nota > 5 | nota < 0)
               {
                   nota = Float.parseFloat(JOptionPane.showInputDialog(null,"La calificación ingresada no es valida, ingrese la CALIFICACIÓN de la nota #" + contador));
               }
              contador++;
              suma = suma + (nota*(porcentaje/100));
           }
           promedio = suma;
       }
       JOptionPane.showMessageDialog(null, "El promedio para esta asignatura es: " + promedio);
    }
    
}
