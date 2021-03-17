/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_java;

/**
 *
 * @author Victor Rosario
 */
public class Ejercicio6_java {

    public static void main(String[] args) {
        
       System.out.println("\n\n ---------------------------------Ejercicio 6----------------------------------------------\n\n");
       
       //Ejercicio 6
       Libro libro1 = new Libro();
       
       libro1.setAutor("Juan Bosch");
       libro1.setISBN("978-84-7884-212-4");
       libro1.setNumeroDePaginas(112);
       libro1.setPrecio(100);
       libro1.setTitulo("Cuentos dominicanos");
       libro1.ToString();
       
        Libro libro2 = new Libro();
       
       libro2.setAutor("Juan Bosco");
       libro2.setISBN("978-84-16223-36-7");
       libro2.setNumeroDePaginas(416);
       libro2.setPrecio(100);
       libro2.setTitulo("La lista");
       libro2.ToString();
       
       if(libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()){
           System.out.println("El libro " + libro1.getTitulo() + " es el que cuenta con mas paginas");
       }
       else if(libro1.getNumeroDePaginas() == libro2.getNumeroDePaginas()){
           System.out.println("Ambos libros cuentan con la misma cantidad de paginas");
       }
       else{
           System.out.println("El libro " + libro2.getTitulo() + " es el que cuenta con mas paginas de los dos");
       }
       
       //Ejercicio 7
       
       System.out.println("\n\n ---------------------------------Ejercicio 7----------------------------------------------\n\n");
       
       Factura factura = new Factura();
       factura.setLibros(libro1);
       factura.setLibros(libro2);
       factura.setDescuento(15);
       
       factura.facturaToString();
       
       Factura factura2 = new Factura();
       factura2.setLibros(libro1);
       factura2.setDescuento(20);
       
       factura2.facturaToString();
    }
    
}
