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
public class Rastra extends Automovil{
    private int cantidadVagones;

    public Rastra(int cantidadVagones, int cantidadVelocidades, String chapa, String color, String fechaFabricacion, double cantidadCombustible, double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        super(cantidadVelocidades, chapa, color, fechaFabricacion, cantidadCombustible, kilometraje, precioReparacion, fechaReparacion, costoReparacion);
        this.cantidadVagones = cantidadVagones;
    }

    public int getCantidadVagones() {
        return cantidadVagones;
    }

    public void setCantidadVagones(int cantidadVagones) {
        this.cantidadVagones = cantidadVagones;
    }

    @Override
    public double invertidoEnPiezas() {
        if(cantidadVagones < 2)
            return super.invertidoEnPiezas()+super.costoReparacion*0.15;
        else
            return super.invertidoEnPiezas()+super.costoReparacion*0.33;
    }
    
    
}
