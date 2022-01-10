/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author camil
 */
public class nodosDibujados {
    int numero;
    double x;
    double y;
    nodosDibujados link;

    public nodosDibujados(int numero, double x, double y) {
        this.numero = numero;
        this.x = x;
        this.y = y;
    }
}
