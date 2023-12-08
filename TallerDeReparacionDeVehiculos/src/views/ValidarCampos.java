/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

/**
 *
 * @author admin
 */
public class ValidarCampos {
    
    public boolean comprobarTexto(String a){
        if(a.matches("^(?i)[a-záéíóúÁÉÍÓÚ]+$"))
            return true;
        else 
            return false;
    }
    
    public boolean comprobarNumeros(String a){
        if(a.matches("^[0-9]+$"))
            return true;
        else
            return false;
    }
    
    public int convertirEntero(String a){
        int num = Integer.parseInt(a);
        return num;
    }
    
    public boolean comprobarRango(int numero, int desde, int hasta){
        if(desde >= numero || numero <= hasta)
            return true;
        else
            return false;
    }
    
    public boolean comprobarFecha(String a){
        String[] fecha = a.split("-");
        if(fecha.length == 3){
            if(comprobarRango(convertirEntero(fecha[0]), 1, 30)){
                if(comprobarRango(convertirEntero(fecha[1]), 1, 12)){
                    return true;
                } else return false;
            } else return false;
        } else
            return false;
    }
}
