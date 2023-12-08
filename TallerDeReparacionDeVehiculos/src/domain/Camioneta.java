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
public class Camioneta extends Automovil{
    private double volumenMaximo;
    private double volumenCargado;

    public Camioneta(double volumenMaximo, double volumenCargado, int cantidadVelocidades, String chapa, String color, String fechaFabricacion,
            double cantidadCombustible, double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        super(cantidadVelocidades, chapa, color, fechaFabricacion, cantidadCombustible, kilometraje, precioReparacion, fechaReparacion, costoReparacion);
        this.volumenMaximo = volumenMaximo;
        this.volumenCargado = volumenCargado;
    }

    public double getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(double volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public double getVolumenCargado() {
        return volumenCargado;
    }

    public void setVolumenCargado(double volumenCargado) {
        this.volumenCargado = volumenCargado;
    }

    @Override
    public double invertidoEnPiezas() {
        if(volumenMaximo-volumenCargado <20)
            return super.invertidoEnPiezas()+super.costoReparacion*0.50;
        else
            return super.invertidoEnPiezas()+super.costoReparacion*0.27;
    }
    
}
