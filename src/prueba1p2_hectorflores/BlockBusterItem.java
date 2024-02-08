/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2_hectorflores;

import java.util.Calendar;

/**
 *
 * @author hecto
 */
public abstract class BlockBusterItem {
    int codigo;
    String nombre;
    double renta;
    Calendar fecha;

    public BlockBusterItem(int codigo, String nombre, double renta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.renta = renta;
        fecha = Calendar.getInstance();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+this.codigo+ "Nombre: "+ this.nombre+"Renta: " + this.renta;
    }
    
    public abstract double pagoRenta(int dias);
    
}
