package Clases;
import java.util.Scanner;
public class Libro {
    
    private String titulo;
    private String autor;
    private int numPag;
    
    Scanner e = new Scanner(System.in);
    
    public void obtenerValores(){
        
        System.out.print("Ingrese el nombre del titulo: ");
        this.titulo = e.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        this.autor = e.nextLine();
        System.out.print("Ingrese la cantidad de paginas: ");
        this.numPag = e.nextInt();

        
    }

    public String getTitulo() {
        return titulo.toUpperCase();
    }

    public String getAutor() {
        return autor.toUpperCase();
    }

    public int getNumPag() {
        return numPag;
    }

    public Scanner getE() {
        return e;
    }
       
}
