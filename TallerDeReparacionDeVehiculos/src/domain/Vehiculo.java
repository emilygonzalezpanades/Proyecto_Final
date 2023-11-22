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
public abstract class Vehiculo implements Comparable<Vehiculo>{
    protected String chapa;
    protected String color;
    protected String fechaFabricacion;
    protected double cantidadCombustible;
    protected double kilometraje;
    protected double precioReparacion;
    protected String fechaReparacion;
    protected double costoReparacion;

    public Vehiculo() {
    }

    public Vehiculo(String chapa, String color, String fechaFabricacion, double cantidadCombustible, double kilometraje, double precioReparacion, String fechaReparacion, double costoReparacion) {
        this.chapa = chapa;
        this.color = color;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadCombustible = cantidadCombustible;
        this.kilometraje = kilometraje;
        this.precioReparacion = precioReparacion;
        this.fechaReparacion = fechaReparacion;
        this.costoReparacion = costoReparacion;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public String getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(String fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }
       
    public abstract double invertidoEnPiezas();

    @Override
    public int compareTo(Vehiculo o) {
        if(o.getPrecioReparacion()>precioReparacion)
            return -1;
        else if(o.getPrecioReparacion()==precioReparacion)
            return 0;
        else
            return 1;
    }
}
