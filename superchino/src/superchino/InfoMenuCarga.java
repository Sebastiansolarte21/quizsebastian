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
public class InfoMenuCarga {
 private Info inventarioCarga[]=new Info[2]; 
   //Profe este se suponia que iba ser el menu de carga donde iba ir la matematicas de los precios y solicitudes de nombre de la empresa pero no me dio chance
   public void agregar(){
      int x;
      for(x=0;x<inventarioCarga.length;x++){
          Info p=new Info();
          p.setNombreProducto(JOptionPane.showInputDialog(null,"Digite el nombre del producto:"));
          p.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad existente:")));
          p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          p.setCodProducto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto:")));
          p.setNombreEmpleado(JOptionPane.showInputDialog(null,"Digite su nombre:"));
          p.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su numero de cedula:")));
          inventarioCarga[x]=p;
      }
   }

   public void mostrarInfo(){
      int x;
      String s="";
      for(x=0;x<inventarioCarga.length;x++){
          s=s+inventarioCarga[x].getNombreProducto()+" "+inventarioCarga[x].getCantidad()+
                  " "+inventarioCarga[x].getPrecio()+" "+inventarioCarga[x].getCodProducto()+"\n\n";
      }
      JOptionPane.showMessageDialog(null,"Productos registrados:\n"+s);
   }   
}
