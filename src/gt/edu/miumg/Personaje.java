package gt.edu.miumg;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;

    public abstract void desplazarse();
    public abstract int mostrarVida();
    public abstract void mostrarPoder();

    public Personaje(String nombre, String descripcion, int poder, int vida, long tamano){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.vida = vida;
        this.tamano = tamano;
    }
}


