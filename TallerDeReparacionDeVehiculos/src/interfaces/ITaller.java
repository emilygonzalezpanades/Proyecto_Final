/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Trabajador;
import domain.Vehiculo;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ITaller {
    boolean agregarVehiculo(Vehiculo v);
    boolean agregarTrabajador(Trabajador t);
    Map<String, Integer> cantidadDeVehiculosPorTrabajador(String id);
    double gananciaVehiculo(Vehiculo v);
    LinkedList ordenarReparacionesDiarias(String dia);
    double calcularSalarioMensual(String id, String mes);
    Map<String, Integer> cantidadVehiculosPorTipo(LinkedList<Vehiculo> list);
    Trabajador trabajadorMasProductivo();
    double inversionDeUnVehiculo(String chap);
    double gananciaTotal();
    LinkedList<Vehiculo> getVehiculos();
    LinkedList<Trabajador> getTrabajadores();
}
