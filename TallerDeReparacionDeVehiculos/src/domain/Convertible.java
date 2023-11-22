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
public class Convertible extends Automovil{
    private boolean lujo;

    public Convertible(boolean lujo, int cantidadVelocidades, String chapa, String color, String fechaFabricacion, double cantidadCombustible, double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        super(cantidadVelocidades, chapa, color, fechaFabricacion, cantidadCombustible, kilometraje, precioReparacion, fechaReparacion, costoReparacion);
        this.lujo = lujo;
    }

    public boolean isLujo() {
        return lujo;
    }

    public void setLujo(boolean lujo) {
        this.lujo = lujo;
    }

    @Override
    public double invertidoEnPiezas() {
        if(lujo == true)
            return super.invertidoEnPiezas()+(super.costoReparacion*0.45);
        else
            return super.invertidoEnPiezas()+(super.costoReparacion*0.30);
    }
    
}