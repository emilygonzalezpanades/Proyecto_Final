/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.Camioneta;
import domain.Convertible;
import domain.Motocicleta;
import domain.Rastra;
import domain.Trabajador;
import domain.Vehiculo;
import interfaces.ITaller;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class TallerTest {
    
    public TallerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarVehiculo method, of class Taller.
     */
    @Test
    public void testAgregarVehiculo() {
        System.out.println("agregarVehiculo");
        Vehiculo v = null;
        Taller instance = new Taller();
        instance.agregarVehiculo(v);
       
    }

    /**
     * Test of agregarTrabajador method, of class Taller.
     */
    @Test
    public void testAgregarTrabajador() {
        System.out.println("agregarTrabajador");
        Trabajador t = null;
        Taller instance = new Taller();
        instance.agregarTrabajador(t);
        
    }
    
    @Test
    public void testGananciaTotal() {
        System.out.println("gananciaTotal");
        Taller instance = new Taller();
        double expResult = 0.0;
        double result = instance.gananciaTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult){
         fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testGananciaTotal2(){
        ITaller taller = new Taller();
        
        Vehiculo v1 = new Motocicleta(true, "China", "dds23", "azul", "2-6-2020", 34, 30, 500, "4-6-2023", 300);
        Vehiculo v2 = new Rastra(2, 5, "adr475", "rojo", "5-25-2022", 40, 30, 800, "3-19-2023", 500);
        
        taller.agregarVehiculo(v1);
        taller.agregarVehiculo(v2);
        
        double gananciaEsperada = 1060;
        double result = taller.gananciaTotal();
        assertEquals(gananciaEsperada, result);
    }
    
    @Test
    public void testOrdenarReparacionesDiarias() {
        System.out.println("ordenarReparacionesDiarias");
        String dia = "5";
        Taller instance = new Taller();
        ArrayList expResult = null;
        ArrayList result = instance.ordenarReparacionesDiarias(dia);
        assertNull(expResult);
        
    }

    /**
     * Test of getVehiculos method, of class Taller.
     */
    @Test
    public void testGetVehiculos() {
        System.out.println("getVehiculos");
        Taller instance = new Taller();
        ArrayList<Vehiculo> expResult = null;
        ArrayList<Vehiculo> result = instance.getVehiculos();
        assertNull(expResult);
        
    }

    /**
     * Test of getTrabajadores method, of class Taller.
     */
    @Test
    public void testGetTrabajadores() {
        System.out.println("getTrabajadores");
        Taller instance = new Taller();
        ArrayList<Trabajador> expResult = null;
        ArrayList<Trabajador> result = instance.getTrabajadores();
        assertNull(expResult);
    }
    
    @Test
    public void testCalcularSalarioMensual() {
        ITaller taller = new Taller();
        
        Vehiculo v1 = new Motocicleta(true, "China", "dds23", "azul", "2-6-2020", 34, 30, 500, "4-6-2023", 300);
        Vehiculo v2 = new Rastra(2, 5, "adr475", "rojo", "25-5-2022", 40, 30, 800, "3-6-2023", 500);
        Vehiculo v3 = new Convertible(false, 3, "gs564", "rojo", "5-3-2020", 40, 30, 600, "5-3-2023", 300);
        Vehiculo v4 = new Camioneta(20, 5, 3, "dh263", "amarillo", "5-7-2020", 40, 30, 700, "3-3-2023", 200);
        
        taller.agregarVehiculo(v1);
        taller.agregarVehiculo(v2);
        taller.agregarVehiculo(v3);
        taller.agregarVehiculo(v4);
        
        Trabajador t = new Trabajador("Mauricio", "232454", taller.getVehiculos());
        
        double salarioEsperado = 1066.75;
        double result = taller.calcularSalarioMensual("232454", "3");
        
        assertEquals(salarioEsperado, result);
    }
}
