/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.Camioneta;
import domain.Convertible;
import domain.Motocicleta;
import domain.Trabajador;
import domain.Vehiculo;
import interfaces.ITaller;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Taller implements ITaller{
    private LinkedList<Vehiculo> listVehiculos = new LinkedList<>();
    private LinkedList<Trabajador> listTrabajadores = new LinkedList<>();

    @Override
    public boolean agregarVehiculo(Vehiculo v) {
        return listVehiculos.add(v);
    }

    @Override
    public boolean agregarTrabajador(Trabajador t) {
        return listTrabajadores.add(t);
    }
    
    @Override
    public Map<String, Integer> cantidadVehiculosPorTipo(LinkedList<Vehiculo> list) {
        Map<String, Integer> vehiculosPorTipo = new HashMap<>();
        vehiculosPorTipo.put("moto", 0);
        vehiculosPorTipo.put("camioneta", 0);
        vehiculosPorTipo.put("convertible", 0);
        vehiculosPorTipo.put("rastra", 0);
        
        for(Vehiculo v : list){
            if(v instanceof Motocicleta){
                Integer value = vehiculosPorTipo.get("moto");
                vehiculosPorTipo.replace("moto", value+1);
            } else if(v instanceof Camioneta){
                Integer value = vehiculosPorTipo.get("camioneta");
                vehiculosPorTipo.replace("camioneta", value+1);
            } else if(v instanceof Convertible){
                Integer value = vehiculosPorTipo.get("convertible");
                vehiculosPorTipo.replace("convertible", value+1);
            } else {
                Integer value = vehiculosPorTipo.get("rastra");
                vehiculosPorTipo.replace("rastra", value+1);
            }
            
        } return vehiculosPorTipo;
    }

    @Override
    public double calcularSalarioMensual(String id, String mes) {
        LinkedList<Vehiculo> vehiculosPorMes = new LinkedList<>();
        double salario = 0;
        int pos = -1;
        int j = 0;
        
        while(pos == -1 && j < listTrabajadores.size()){
            if(listTrabajadores.get(j).getId().equals(id))
                pos = j;
            j++;
        } 
        
        if(pos == -1)
            return pos;
        else{
            LinkedList<Vehiculo> vehiculosPorTrabajador = listTrabajadores.get(pos).getVehiculos();
            for(Vehiculo v : vehiculosPorTrabajador){
                String[] fecha = v.getFechaReparacion().split("-");
                if (fecha[1].equals(mes)){
                    salario += gananciaVehiculo(v);
                    vehiculosPorMes.add(v);
                }
            }
            
        Map<String, Integer> tipoVehiculos = cantidadVehiculosPorTipo(vehiculosPorMes);
        if(tipoVehiculos.get("moto")>0 && tipoVehiculos.get("moto")<15)
            salario += 1.5;
        else
            salario += tipoVehiculos.get("moto")/15*3;
        if(tipoVehiculos.get("camioneta")>0 && tipoVehiculos.get("camioneta")<15)
            salario += 1.75;
        else
            salario += tipoVehiculos.get("camioneta")/15*3.55;
        if(tipoVehiculos.get("convertible")>0 && tipoVehiculos.get("convertible")<20)
            salario += 2.5;
        else
            salario += tipoVehiculos.get("convertible")/20*4;
        if(tipoVehiculos.get("rastra")>0 && tipoVehiculos.get("rastra")<12)
            salario += 4.25;
        else
            salario += tipoVehiculos.get("rastra")/12*6;
        
        return salario;
        }
    }

    @Override
    public double inversionDeUnVehiculo(String chap) {
        int pos = -1;
        int i = 0;
        while(pos == -1 && i < listVehiculos.size()){
            if(listVehiculos.get(i).getChapa().equals(chap))
                pos = i;
            i++;
        }
        return listVehiculos.get(pos).invertidoEnPiezas();
    }

    @Override
    public double gananciaTotal() {
        double total = 0;
        for(Vehiculo v: listVehiculos)
            total += gananciaVehiculo(v);
        return total;
    }

    @Override
    public Map<String, Integer> cantidadDeVehiculosPorTrabajador(String id) {
        int pos = -1;
        int j = 0;
        while(pos == -1 && j < listTrabajadores.size()){
            if(listTrabajadores.get(j).getId().equals(id))
                pos = j;
            j++;
        }
        LinkedList<Vehiculo> vehiculos = listTrabajadores.get(pos).getVehiculos();
        
        return cantidadVehiculosPorTipo(vehiculos);
    }
    

    @Override
    public double gananciaVehiculo(Vehiculo v) {
        return v.getPrecioReparacion()-v.invertidoEnPiezas();
    }

    @Override
    public LinkedList ordenarReparacionesDiarias(String dia) {
        LinkedList<Vehiculo> vehiculos = new LinkedList<>();
        for(Vehiculo v: listVehiculos){
            if(v.getFechaReparacion().equals(dia))
                vehiculos.add(v);
            
        } Collections.sort(vehiculos);
        return vehiculos;
    }
    
    
    @Override
    public Trabajador trabajadorMasProductivo() {
        Trabajador masProductivo = listTrabajadores.get(0);
        for(Trabajador t: listTrabajadores)
            if(masProductivo.getVehiculos().size() < t.getVehiculos().size())
                masProductivo = t;
        return masProductivo;
    }

    @Override
    public LinkedList<Vehiculo> getVehiculos() {
        return listVehiculos;
    }

    @Override
    public LinkedList<Trabajador> getTrabajadores() {
        return listTrabajadores;
    }


}
