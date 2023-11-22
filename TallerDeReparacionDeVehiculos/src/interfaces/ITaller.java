/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Trabajador;
import domain.Vehiculo;
import java.util.LinkedList;

/**
 *
 * @author admin
 */
public interface ITaller {
    boolean agregarVehiculo(Vehiculo v);
    boolean agregarTrabajador(Trabajador t);
    LinkedList<Integer> cantidadDeVehiculosPorTrabajador(String id);
    double gananciaVehiculo(Vehiculo v);
    LinkedList ordenarReparacionesDiarias(String dia);
    double calcularSalarioMensual(String id, String mes);
    Trabajador trabajadorMasProductivo();
    double inversionDeUnVehiculo(String chap);
    double gananciaTotal();
    LinkedList<Vehiculo> getVehiculos();
    LinkedList<Trabajador> getTrabajadores();
}
