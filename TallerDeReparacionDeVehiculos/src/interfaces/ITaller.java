/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Trabajador;
import domain.Vehiculo;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ITaller {
    void agregarVehiculo(Vehiculo v);
    void agregarTrabajador(Trabajador t);
    Map<String, Integer> cantidadDeVehiculosPorTrabajador(String id);
    double gananciaVehiculo(Vehiculo v);
    ArrayList ordenarReparacionesDiarias(String dia);
    double calcularSalarioMensual(String id, String mes);
    Map<String, Integer> cantidadVehiculosPorTipo(ArrayList<Vehiculo> list);
    Trabajador trabajadorMasProductivo();
    double inversionDeUnVehiculo(String chap);
    double gananciaTotal();
    ArrayList<Vehiculo> getVehiculos();
    ArrayList<Trabajador> getTrabajadores();
    Vehiculo buscarVehiculo(String chapa);
    Trabajador buscarTrabajador(String id);
}
