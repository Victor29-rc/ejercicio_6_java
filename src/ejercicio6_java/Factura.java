/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Factura {
    
    Random randomizer = new Random(java.lang.System.nanoTime());
    
    int numeroFactura = randomizer.nextInt();
    public Date fechaFactura = new Date();
    double totalAPagar;
    double montoConITBIS;
    double montoConDescuento;
    double monto = 0;
    double descuento = 0;
    double ITBIS = 0;

    ArrayList<Libro> libros = new ArrayList<Libro>();

    public Factura(){
       
    }
    
    public Factura(Libro libros, double descuento){
        this.libros.add(libros);
        this.descuento = descuento;
        
        calcularITBIS();
        calcularDescuento();
    }
    
    public void setLibros(Libro libros){
        this.libros.add(libros);
        calcularITBIS();
    }
    
    public void setDescuento(double descuento){
        this.descuento = descuento;
        calcularDescuento();
    }
    
    private Date getFechaFactura(){
        return fechaFactura;
    }
    
    private void setMonto(){
        for(int i = 0; i < libros.size(); i++){
            monto += libros.get(i).getPrecio();
        }
    }
    
    private void calcularITBIS(){
        
        for(int i = 0; i < libros.size(); i++){
            ITBIS += (libros.get(i).getPrecio() * 0.18);
        }
    }
    
    private void calcularDescuento(){
        descuento *= (libros.size());
    }

    public void facturaToString(){
        setMonto();
        
        montoConDescuento = monto - descuento;
        montoConITBIS = monto + ITBIS;       
        totalAPagar = montoConITBIS - descuento;
             
        System.out.println(
        "Numero de factura: " + numeroFactura + " \n" +
        "Fecha factura: " + fechaFactura + " \n" +
        "Monto: " + monto + " \n" +
        "Monto con ITBIS: " + montoConITBIS + " \n" +
        "Monto con Descuento: " + montoConDescuento + " \n"+
        "Total a pagar: " + totalAPagar + " \n"
        );
    }
    
}
