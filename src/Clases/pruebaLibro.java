
package Clases;


public class pruebaLibro {
    
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.obtenerValores();
        System.out.println("");
        System.out.println("el libro es: "+l1.getTitulo()); 
        System.out.println(" ");
        System.out.println("el autor es: "+l1.getAutor()); 
    }
    
}
