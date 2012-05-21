/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guille.tienda;
import java.util.*;
/**
 *
 * @author gguard
 */
public class Escaparate {
    private LinkedList catalogo = new LinkedList();
    
    public void addArticulo(String id, String nombre, String precio, String cantidad) {
        Articulos art = new Articulos(id, nombre, precio, cantidad);
        catalogo.add(art);
    }
    
    public Articulos getArticulo(int i) {
        return (Articulos) catalogo.get(i);
    }
    
    public int getSize() {
        return catalogo.size();
    }
    
    public void sort() {
        Collections.sort(catalogo);
    }
    
}
