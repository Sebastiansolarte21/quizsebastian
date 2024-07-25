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
public class InfoMenu {
     private Info inventario[]=new Info[2]; 
   
   public void agregar(){
      int x;
      for(x=0;x<inventario.length;x++){
          Info p=new Info();
          p.setNombreProducto(JOptionPane.showInputDialog(null,"Digite el nombre del producto:"));
          p.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad existente:")));
          p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          p.setCodProducto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto:")));
          p.setNombreEmpleado(JOptionPane.showInputDialog(null,"Digite su nombre:"));
          p.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su numero de cedula:")));
          inventario[x]=p;
      }
   }

   public void mostrarInfo(){
      int x;
      String s="";
      for(x=0;x<inventario.length;x++){
          s=s+inventario[x].getNombreProducto()+" "+inventario[x].getCantidad()+
                  " "+inventario[x].getPrecio()+" "+inventario[x].getCodProducto()+"\n\n";
      }
      JOptionPane.showMessageDialog(null,"Productos registrados:\n"+s);
   }
}
