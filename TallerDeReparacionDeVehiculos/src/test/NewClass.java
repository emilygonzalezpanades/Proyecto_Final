/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import domain.Camioneta;
import domain.Convertible;
import domain.Motocicleta;
import domain.Rastra;
import domain.Trabajador;
import domain.Vehiculo;
import interfaces.ITaller;
import java.util.LinkedList;
import services.Taller;

/**
 *
 * @author admin
 */
public class NewClass {
    
    public static void main (String[] args){
        
    //Comptovando el metodo "invertido en piezas"    
    
    Vehiculo v1 = new Motocicleta(false, "Espana", "a", "azul", "14-5-2023", 52.3, 50, 500.00, "12-9-2023", 200.00);
    Vehiculo v2 = new Motocicleta(true, "Espana", "b", "azul", "7-6-2023", 52.3, 50, 650.00, "20-9-2023", 300.00);
    Vehiculo v3 = new Camioneta(50, 15, 6, "c", "", "", 42, 140, 800.00, "10-8-2023", 500.00);
    Vehiculo v4 = new Camioneta(31, 15, 4, "d", "", "", 42, 140, 720.00, "20-9-2023", 550.00);
    Vehiculo v5 = new Convertible(true, 7, "e", "", "", 54, 115, 430, "4-8-2023", 300.00);
    Vehiculo v6 = new Convertible(false, 7, "f", "", "", 54, 115, 800, "4-8-2023", 410.00);
    Vehiculo v7 = new Rastra(1, 3, "g", "", "", 2, 45, 900.00, "5-7-2023", 400.00);
    Vehiculo v8 = new Rastra(3, 3, "h", "", "", 2, 45, 800.00, "4-7-2023", 530.00);
    Vehiculo v9 = new Camioneta(12, 10, 7, "i", "", "", 34, 140, 540.00, "16-9-2023", 400.00);
    Vehiculo v10 = new Motocicleta(false, "Espana", "j", "azul", "20-9-2023", 52.3, 50, 356.00, "20-9-2023", 300.00);
    Vehiculo v11 = new Rastra(3, 3, "k", "", "", 2, 45, 530.00, "9-7-2023", 430.00);
    Vehiculo v12 = new Rastra(1, 6, "l", "", "", 2, 45, 860.00, "4-7-2023", 300.00);
    Vehiculo v13 = new Camioneta(31, 30, 4, "m", "", "", 42, 140, 450.00, "20-9-2023", 460.00);
    Vehiculo v14 = new Rastra(1, 3, "n", "", "", 2, 45, 900.00, "5-7-2023", 400.00);
    Vehiculo v15 = new Camioneta(50, 15, 6, "o", "", "", 42, 140, 360.00, "10-8-2023", 130.00);
    
    System.out.println(v1.invertidoEnPiezas());
    System.out.println(v2.invertidoEnPiezas());
    System.out.println(v3.invertidoEnPiezas());
    System.out.println(v4.invertidoEnPiezas());
    System.out.println(v5.invertidoEnPiezas());
    System.out.println(v6.invertidoEnPiezas());
    System.out.println(v7.invertidoEnPiezas());
    System.out.println(v8.invertidoEnPiezas());
    System.out.println(v9.invertidoEnPiezas());
    System.out.println(v10.invertidoEnPiezas());
    System.out.println(v11.invertidoEnPiezas());
    System.out.println(v12.invertidoEnPiezas());
    System.out.println(v13.invertidoEnPiezas());
    System.out.println(v14.invertidoEnPiezas());
    System.out.println(v15.invertidoEnPiezas());
    
    System.out.println("-------------------------------");
    
    ITaller taller = new Taller();
    
    taller.agregarVehiculo(v1);
    taller.agregarVehiculo(v2);
    taller.agregarVehiculo(v3);
    taller.agregarVehiculo(v4);
    taller.agregarVehiculo(v5);
    taller.agregarVehiculo(v6);
    taller.agregarVehiculo(v7);
    taller.agregarVehiculo(v8);
    taller.agregarVehiculo(v9);
    taller.agregarVehiculo(v10);
    taller.agregarVehiculo(v11);
    taller.agregarVehiculo(v12);
    taller.agregarVehiculo(v13);
    taller.agregarVehiculo(v14);
    taller.agregarVehiculo(v15);
    
    LinkedList<Vehiculo> vehiculos1 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos2 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos3 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos4 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos5 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos6 = new LinkedList<>();
    LinkedList<Vehiculo> vehiculos7 = new LinkedList<>();

    Trabajador trab1 = new Trabajador("deku", "plusultra", vehiculos1);
    Trabajador trab2 = new Trabajador("tanaka", "hohoho", vehiculos2);
    Trabajador trab3 = new Trabajador("gojo", "bukoroso", vehiculos3);
    Trabajador trab4 = new Trabajador("geto", "monkeys", vehiculos4);
    Trabajador trab5 = new Trabajador("kachan", "shine", vehiculos5);
    Trabajador trab6 = new Trabajador("sebastian", "bochan", vehiculos6);
    Trabajador trab7 = new Trabajador("grell", "death", vehiculos7);
    
    trab1.addVehiculo(v1);
    trab1.addVehiculo(v2);
    trab1.addVehiculo(v3);
    trab1.addVehiculo(v4);
    trab1.addVehiculo(v5);
    
    trab2.addVehiculo(v8);
    trab2.addVehiculo(v10);
    trab2.addVehiculo(v5);
    trab2.addVehiculo(v15);
    trab2.addVehiculo(v1);
    trab2.addVehiculo(v13);
    trab2.addVehiculo(v3);
    trab2.addVehiculo(v15);
    
    trab3.addVehiculo(v15);
    trab3.addVehiculo(v12);
    trab3.addVehiculo(v4);
    
    trab7.addVehiculo(v1);
    trab7.addVehiculo(v2);
    trab7.addVehiculo(v3);
    trab7.addVehiculo(v4);
    trab7.addVehiculo(v5);
    trab7.addVehiculo(v6);
    trab7.addVehiculo(v7);
    
    
    taller.agregarTrabajador(trab1);
    taller.agregarTrabajador(trab2);
    taller.agregarTrabajador(trab3);
    taller.agregarTrabajador(trab4);
    taller.agregarTrabajador(trab5);
    taller.agregarTrabajador(trab6);
    taller.agregarTrabajador(trab7);
    
    System.out.println(taller.getTrabajadores().get(0).getNombre());
    System.out.println(taller.getTrabajadores().get(1).getNombre());
    System.out.println(taller.getTrabajadores().get(2).getNombre());
    System.out.println(taller.getTrabajadores().get(3).getNombre());
    System.out.println(taller.getTrabajadores().get(4).getNombre());
    System.out.println(taller.getTrabajadores().get(5).getNombre());
    System.out.println(taller.getTrabajadores().get(6).getNombre());
    
    
    System.out.println("-------------------------------");
    
    //comprobando "inversion de un vehiculo"
    
    System.out.println(taller.inversionDeUnVehiculo("a"));
    System.out.println(taller.inversionDeUnVehiculo("b"));
    System.out.println(taller.inversionDeUnVehiculo("c"));
    System.out.println(taller.inversionDeUnVehiculo("d"));
    System.out.println(taller.inversionDeUnVehiculo("e"));
    System.out.println(taller.inversionDeUnVehiculo("f"));
    
    System.out.println("-------------------------------");
    
    System.out.println(taller.gananciaVehiculo(v1));
    System.out.println(taller.gananciaVehiculo(v2));
    System.out.println(taller.gananciaVehiculo(v3));
    System.out.println(taller.gananciaVehiculo(v4));
    System.out.println(taller.gananciaVehiculo(v5));
    System.out.println(taller.gananciaVehiculo(v6));
    System.out.println(taller.gananciaVehiculo(v7));
    System.out.println(taller.gananciaVehiculo(v8));
    System.out.println(taller.gananciaVehiculo(v9));
    System.out.println(taller.gananciaVehiculo(v10));
    System.out.println(taller.gananciaVehiculo(v11));
    System.out.println(taller.gananciaVehiculo(v12));
    System.out.println(taller.gananciaVehiculo(v13));
    System.out.println(taller.gananciaVehiculo(v14));
    System.out.println(taller.gananciaVehiculo(v15));
    
    System.out.println("-------------------------------");
    
    System.out.println(taller.gananciaTotal());
    
    System.out.println("-------------------------------");
    
    LinkedList<Integer> cantVehiculos = taller.cantidadDeVehiculosPorTrabajador("death");
    
    for(int i = 0; i < cantVehiculos.size(); i++)
        System.out.println(cantVehiculos.get(i));
    
    System.out.println("-------------------------------");
    
    Trabajador masProductivo = taller.trabajadorMasProductivo();
    
    System.out.println(masProductivo.getNombre());
    
    System.out.println("-------------------------------");
    
    LinkedList<Vehiculo> ordenar = taller.ordenarReparacionesDiarias("20-9-2023");
    
    for(Vehiculo v: ordenar)
        System.out.println(v.getPrecioReparacion());
    
    System.out.println("-------------------------------");
    
    //comprobando "salario mensual"
    if(taller.calcularSalarioMensual("death", "9") == -1)
        System.out.println("No se encontro un trabajador con esa identificacion");
    else
        System.out.println(taller.calcularSalarioMensual("death", "9"));
    
    }  
}
