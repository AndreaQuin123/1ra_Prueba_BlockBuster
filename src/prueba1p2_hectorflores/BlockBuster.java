/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2_hectorflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class BlockBuster {
    ArrayList <BlockBusterItem> items;

    public BlockBuster() {
        items = new ArrayList<>();
    }
    
    public BlockBusterItem buscarItem(int codigo, String tipo){
        
        for (BlockBusterItem item : items){
            if (item.getCodigo() == codigo && item instanceof MovieItem && tipo.equals("MOVIE")) {
                JOptionPane.showMessageDialog(null, "Se encontro el siguiente item:\n" + item.toString());
                return item;
            } else if (item.getCodigo() == codigo && item instanceof VideoGameItem && tipo.equals("GAME")) {
                JOptionPane.showMessageDialog(null, "Se encontro el siguiente item:\n" + item.toString());
                return item;
            } 
        }
        
        JOptionPane.showMessageDialog(null, "No se encontro el item");
        return null;
    }
    
    public void agregarItem(int codigo, String nombre, String tipoItem){
        
        if (buscarItem(codigo, tipoItem) == null){
            if (tipoItem.equals("MOVIE")){
                MovieItem peli = new MovieItem(codigo, nombre);
                items.add(peli);
                JOptionPane.showMessageDialog(null, "Peli agregada");
            } else {
                
                String consola = JOptionPane.showInputDialog("Ingrese el nombre de la consola\nXBOX, PLAYSTATION o WII");
                
                while (true){
                    if (consola.equalsIgnoreCase("xbox") || consola.equalsIgnoreCase("wii") || consola.equalsIgnoreCase("playstation")){
                        break;
                    } else {
                        consola = JOptionPane.showInputDialog("Ingrese un nombre valido de la consola\nXBOX, PLAYSTATION o WII");
                    }
                }
                
                
                VideoGameItem juego = new VideoGameItem(consola, codigo, nombre);
                items.add(juego);
                JOptionPane.showMessageDialog(null, "Juego agregado");
            }
        }
        
    }
    
    public void Rentar(int codigo, String tipoItem, int dias) {
        BlockBusterItem item = buscarItem(codigo, tipoItem);
        
        if (item != null) {
            JOptionPane.showMessageDialog(null, "Detalles del item: "+ item.toString());
            double montoPagar = item.pagoRenta(dias);
            
            JOptionPane.showMessageDialog(null, "Monto a pagar: "+ montoPagar + " lps");
        } else {
            
            JOptionPane.showMessageDialog(null , "Item no existe.");
        }   
    }
    
    public String auditarMovieEstados() {
        StringBuilder resultado = new StringBuilder("Estados de peliculas: \n");
        
        for (BlockBusterItem item : items) {
            if (item instanceof MovieItem) {
                MovieItem pelicula = (MovieItem) item;
                pelicula.evaluarEstado();
                resultado.append(pelicula).append("\n");
            }
        }
        
        return resultado.toString();
    }
}
