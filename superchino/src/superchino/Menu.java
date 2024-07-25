/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Menu {
       private byte mnu;
     public void mostrarMenu(){
      InfoMenu r=new InfoMenu();
      while(mnu!=3){ 
         mnu=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***Menu SuperChino***\n\n"
                         + "1.Agregar producto\n"
                         + "2.Mostrar productos\n"
                         + "3.Salir del sistema\n\n"
                         + "Escriba un numero de los que se le presenta en pantalla:"));
         switch(mnu){
             case 1:{
                r.agregar();
                break;
             } 
          
             case 2:{
                r.mostrarInfo();
                break;
             }
             case 3:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
