/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author admin
 */
public class Motocicleta extends Vehiculo{
    private boolean monoplaza;
    private String paisProcedencia;

    public Motocicleta(boolean monoplaza, String paisProcedencia, String chapa, String color, String fechaFabricacion, double cantidadCombustible, double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        super(chapa, color, fechaFabricacion, cantidadCombustible, kilometraje, precioReparacion, fechaReparacion, costoReparacion);
        this.monoplaza = monoplaza;
        this.paisProcedencia = paisProcedencia;
    }

    public boolean isMonoplaza() {
        return monoplaza;
    }

    public void setMonoplaza(boolean monoplaza) {
        this.monoplaza = monoplaza;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    @Override
    public double invertidoEnPiezas() {
        if(monoplaza == true)
            return super.costoReparacion*0.25;
        else
            return super.costoReparacion*0.35;
    }
    
}
