/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2_hectorflores;

public class VideoGameItem extends BlockBusterItem{
    String nombreConsola;
    static final String XBOX = "XBOX";
    static final String PLAYSTATION = "PLAYSTATION";
    static final String WII = "WII";

    public VideoGameItem(String nombreConsola, int codigo, String nombre) {
        super(codigo, nombre, 30);
        this.nombreConsola = nombreConsola;
    }

    public String getNombreConsola() {
        return nombreConsola;
    }

    public void setNombreConsola(String nombreConsola) {
        this.nombreConsola = nombreConsola;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Game";
    }

    @Override
    public double pagoRenta(int dias) {
        return dias * renta;
    }
    
    
}
