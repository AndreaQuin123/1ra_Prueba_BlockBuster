/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1p2_hectorflores;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class MovieItem extends BlockBusterItem {
    
   private String estado;

    public MovieItem(int codigo, String nombre) {
        super(codigo, nombre, 50);
        this.estado = "ESTRENO";
    }

    @Override
    public String toString() {
        return super.toString() + "Estado: " + estado + "- Movie";
    }

    @Override
    public double pagoRenta(int dias) {

        double pagoTotal = super.getRenta();

        if (estado.equals("ESTRENO") && dias > 2) {
            pagoTotal += 50 * (dias - 2);
        } else if (estado.equals("NORMAL") && dias > 5) {
            pagoTotal += 30 * (dias - 5);
        }

        return pagoTotal;
    }

    
    public void evaluarEstado() {
        LocalDate currentDate = LocalDate.now();
        Calendar fechaItem = super.getFecha();

        long mesesDiferencia = java.time.temporal.ChronoUnit.MONTHS.between((Temporal) fechaItem, currentDate);

        if (mesesDiferencia >= 5 && estado.equals("ESTRENO")) {
            estado = "NORMAL";
            JOptionPane.showMessageDialog(null, "Estado cambiado a NORMAL.");
        }
    }

    


}
