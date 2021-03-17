/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_java;

public class Libro {
    String ISBN;
    String titulo;
    String autor;
    int numeroDePaginas;
    double precio;
    
    public void setISBN(String ISBN){this.ISBN = ISBN;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setAutor(String autor){this.autor = autor;}
    public void setNumeroDePaginas(int numeroDePaginas){this.numeroDePaginas = numeroDePaginas;}
    public void setPrecio(double precio){this.precio = precio;}
    
    public String getISBN() {return ISBN;}
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getNumeroDePaginas() {return numeroDePaginas;}
    public double getPrecio() {return precio;}
    
    public void ToString(){
        System.out.println("El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+numeroDePaginas+" paginas.");
    }
    
}
