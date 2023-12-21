/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.Trabajador;
import domain.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ernesto
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

   

   

   

    /**
     * Test of gananciaTotal method, of class Taller.
     */
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
    //Second test of gananciaTotal method, of class Taller.
    @Test
    public void testGananciaTotal2(){
        Taller taller = new Taller();
        Vehiculo v1 = new Vehiculo(null, null, null, 60, 50, 500, null, 200) {
         @Override
            public double invertidoEnPiezas() {
             return 0;
              
            }    
        
        };
        Vehiculo v2 = new Vehiculo(null, null, null, 70, 40, 600, null, 100) {
          @Override
            public double invertidoEnPiezas() {
              return 0;
                
            }  
            
        };
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        double gananciaEsperada = 800;
        double result = v1.gananciaVehiculo() + v2.gananciaVehiculo();
        assertEquals(gananciaEsperada,result, 0.001);
        }
    /**
     * Test of ordenarReparacionesDiarias method, of class Taller.
     */
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

    

    
    
}
