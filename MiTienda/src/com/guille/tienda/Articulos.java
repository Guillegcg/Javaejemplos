/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guille.tienda;

/**
 *
 * @author gguard
 */
public class Articulos implements Comparable{
    private String id;
    private String nombre;
    private double detalle;
    private int cantidad;
    private double precio;

    Articulos(String idIn, String nombreIn, String detalleIn, String cantIn) {
        id = idIn;
        detalle = Double.parseDouble(detalleIn);
        cantidad = Integer.parseInt(cantIn);
        
        if (cantidad > 400)
            precio = detalle * .5D;
        else if (cantidad > 200)
            precio = detalle * .6D;
        else
            precio = detalle * .7D;
        precio = Math.floor(precio * 100 + .5) / 100;
    }
    
    
    
    public int compareTo(Object obj) {
        Articulos temp = (Articulos)obj;
        if (this.precio < temp.precio)
            return 1;
        else if (this.precio > temp.precio)
            return -1;
        return 0;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getDetalle() {
        return detalle;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
}
