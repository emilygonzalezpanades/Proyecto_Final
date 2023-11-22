/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author admin
 */
public class Trabajador {
    private String nombre;
    private String id;
    private LinkedList<Vehiculo> vehiculos;

    public Trabajador(String nombre, String id, LinkedList<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.id = id;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public boolean addVehiculo(Vehiculo v){
        return vehiculos.add(v);
    }
    
}
