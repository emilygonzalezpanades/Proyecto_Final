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
public class Automovil extends Vehiculo{
    protected int cantidadVelocidades;

    public Automovil() {
    }

    public Automovil(int cantidadVelocidades, String chapa, String color, String fechaFabricacion, double cantidadCombustible,
            double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        super(chapa, color, fechaFabricacion, cantidadCombustible, kilometraje, precioReparacion, fechaReparacion, costoReparacion);
        this.cantidadVelocidades = cantidadVelocidades;
    }

    public int getCantidadVelocidades() {
        return cantidadVelocidades;
    }

    public void setCantidadVelocidades(int cantidadVelocidades) {
        this.cantidadVelocidades = cantidadVelocidades;
    }

    @Override
    public double invertidoEnPiezas() {
        if(cantidadVelocidades >= 5)
            return 50;
        else return 0;
    }
    
}
