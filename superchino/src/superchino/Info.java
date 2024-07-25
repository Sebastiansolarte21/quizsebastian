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
public class Info {
   private int codProducto;
   public String nombreProducto;
   public String nombreEmpleado;
   private int cedulaEmpleado;
   public double precio;
   public String tipoProducto;
   private int ganancia;
    private float cantidadP;

        public Info(int codProducto, String nombreProducto, String nombreEmpleado, int cedulaEmpleado, double ingresoProducto, double precio, String tipoProducto, int ganancia, String descripcion, float cantidad) {
            this.codProducto = codProducto;
            this.nombreProducto = nombreProducto;
            this.nombreEmpleado = nombreEmpleado;
            this.cedulaEmpleado = cedulaEmpleado;   
            this.precio = precio;
            this.tipoProducto = tipoProducto;
            this.ganancia = ganancia;
            this.cantidadP = cantidadP;
        }

    public Info() {
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }


    public float getCantidad() {
        return cantidadP;
    }

    public void setCantidad(float cantidad) {
        this.cantidadP = cantidad;
    }
    

  
  
   
   
}
